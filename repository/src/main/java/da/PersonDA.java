package da;

import model.Person;
import util.DatabaseType;
import util.DatabaseUtil;
import util.Position;
import util.Wage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gh-abdoli on 9/25/16.
 */
public class PersonDA {
    private static DatabaseUtil databaseUtil = DatabaseUtil.getConnectionInstance(DatabaseType.POSTGRE);
    private static PreparedStatement statement;

    public void insert(Person person) {
        try {

            String query = "INSERT INTO person(id, \"position\", name, family, \"dateOfBird\", \"experienceYear\", wage, \"wagePeryear\")  VALUES (?,?,?,?,?,?,?,?);";
            statement = databaseUtil.getConnection().prepareStatement(query);
            statement.setLong(1, person.getId());
            statement.setInt(2, person.getPosition() != null && person.getPosition().ordinal() != 0 ? person.getPosition().ordinal():0);
            statement.setString(3, person.getName());
            statement.setString(4, person.getFamily());
            statement.setDate(5, new java.sql.Date(person.getDateOfBird().getTime()));
            statement.setInt(6, person.getExperienceYear());
            statement.setDouble(7, person.getWage().getWage());
            statement.setInt(8, person.getYear());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Person person) {
        try {
            statement = databaseUtil.getConnection().prepareStatement("DELETE FROM person WHERE person.id = ?");
            statement.setLong(1, person.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Person> select() {
        List<Person> persons = null;
        try {
            statement = databaseUtil.getConnection().prepareStatement("SELECT * FROM person");
            ResultSet resultSet = statement.executeQuery();
            persons = new ArrayList<Person>();
            while (resultSet.next()) {
                Person person = new Person(
                        resultSet.getLong("id"),
                        Position.getUsingOrdinal(resultSet.getInt("position")),
                        resultSet.getString("name"),
                        resultSet.getString("family"),
                        resultSet.getDate("dateOfBird"),
                        resultSet.getInt("experienceYear"),
                        new Wage(resultSet.getDouble("wage")),
                        resultSet.getInt("wagePeryear"));
                persons.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public void close() {
        try {
            databaseUtil.getConnection().commit();
            statement.close();
//            databaseUtil.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
