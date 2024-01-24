package de.bht.pr2.lab04;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name = "";
    private int matrikelnummer = 0;

    public Student(int matrikelnummer, String name) {
        this.matrikelnummer = matrikelnummer;
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", matrikelnummer=" + matrikelnummer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrikelnummer == student.matrikelnummer && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, matrikelnummer);
    }
}
