package model;

import util.Position;
import util.Wage;

import java.util.Date;

/**
 * Created by gh-abdoli on 9/25/16.
 */
public class Person {
    private Long id;
    private Position position;
    private String name;
    private String family;
    private Date dateOfBird;
    private Integer experienceYear;
    private Wage wage;
    private Integer year;

    public Person(Long id, Position position, String name, String family, Date dateOfBird, Integer experienceYear, Wage wage, Integer year) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.family = family;
        this.dateOfBird = dateOfBird;
        this.experienceYear = experienceYear;
        this.wage = wage;
        this.year = year;
    }

    public Person() {
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Date getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(Date dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public Integer getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(Integer experienceYear) {
        this.experienceYear = experienceYear;
    }

    public Wage getWage() {
        return wage;
    }

    public void setWage(Wage wage) {
        this.wage = wage;
    }
}
