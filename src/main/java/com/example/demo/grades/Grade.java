package com.example.demo.grades;

import javax.persistence.*;

@Entity
@Table
public class Grade {
    @Id
    @SequenceGenerator(name = "grade_sequence", sequenceName = "grade_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grade_sequence")
    private Long id;
    private Long idCustomer;
    private Long idEmployer;
    private Long grade;
    private Long gradeSum;
    private int gradeCount = 0;

    // ?
    public Grade(Long idCustomer, Long idEmployer, Long grade, Long gradeSum, int gradeCount) {
        this.grade = grade;
        this.idCustomer = idCustomer;
        this.idEmployer = idEmployer;
        this.gradeCount = gradeCount;
        this.gradeSum = gradeSum;
    }

    public Grade() {

    }

    public Long getId() {
        return id;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public Long getIdEmployer() {
        return idEmployer;
    }

    public Long getGradeSum() {
        return gradeSum;
    }

    public int getGradeCount() {
        return gradeCount;
    }

    public Long getGrade() {
        return grade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setIdEmployer(Long idEmployer) {
        this.idEmployer = idEmployer;
    }

    public void setGradeSum(Long gradeSum) {
        this.gradeSum = gradeSum;
    }

    // ?
    public void setGradeCount() {
        this.gradeCount += 1;
    }

    // ?
    public void setGrade(Long gradeSum, Long gradeCount) {
        this.grade = gradeSum / gradeCount;
    }

    @Override
    public String toString() {
        return "Grade{" + "id=" + id + ", grade='" + grade + '\'' + ", idCustomer='" + idCustomer + '\''
                + ", idEmployer='" + idEmployer + '\'' + ", gradeCount='" + gradeCount + '\'' + ", gradeSum='"
                + gradeSum + '\'' +

                '}';
    }
}
