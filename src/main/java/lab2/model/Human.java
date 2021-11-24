package lab2.model;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String dateOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        String s;
        s = "\nname:" + this.name;
        s = s + "\tsurname:" + this.surname;
        s = s + "\tdata of birth is:" + this.dateOfBirth;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && surname.equals(human.surname) && Objects.equals(dateOfBirth, human.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth);
    }
}
