package bl;

import model.Person;
import util.Wage;

import java.util.List;

/**
 * Created by gh.abdoli on 9/25/2016.
 */
public interface PersonBl {
    void registerPerson(Person person);
    void removePerson(Person person);
    List<Person> getPersons();
}
