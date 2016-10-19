package bl.impl;

import bl.PersonBl;
import da.PersonDA;
import model.Person;
import util.Position;
import util.Wage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by gh.abdoli on 9/25/2016.
 */
public class PersonBlImpl implements PersonBl {
    @Override
    public void registerPerson(Person person) {
        PersonDA personDA = new PersonDA();
        personDA.insert(person);
        personDA.close();
    }

    @Override
    public void removePerson(Person person) {
        PersonDA personDA = new PersonDA();
        personDA.delete(person);
        personDA.close();
    }

    @Override
    public List<Person> getPersons() {
        PersonDA personDA = new PersonDA();
        List<Person> persons = personDA.select();
        personDA.close();
        return persons;
    }
}
