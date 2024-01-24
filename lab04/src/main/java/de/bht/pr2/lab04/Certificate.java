package de.bht.pr2.lab04;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Certificate implements Serializable {

    private static final long serialVersionUID = 1L;
    private Student student;
    private List<Grade> gradeList;

    public Certificate(Student student, List<Grade> gradeList) {
        this.student = student;
        this.gradeList = gradeList;
    }
    public Certificate(Student student) {
        this.student = student;
    }

    public void addGrade(Grade grade) {
        final Student student1 = grade.getSubscription().getStudent();
        if (!student1.equals(this.student)) {
            throw new IllegalArgumentException(student1 + " not eqal to " + student);
        }
        gradeList.add(grade);
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "student=" + student +
                ", gradeList=" + gradeList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Certificate that = (Certificate) o;
        return Objects.equals(student, that.student) && Objects.equals(gradeList, that.gradeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, gradeList);
    }
}
