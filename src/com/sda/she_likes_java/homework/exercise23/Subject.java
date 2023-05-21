package com.sda.she_likes_java.homework.exercise23;

import java.util.Objects;

public class Subject {
    private final String subjectName;
    final int grade;

    public Subject(String subjectName, int grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return grade == subject.grade && Objects.equals(subjectName, subject.subjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName, grade);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrade() {
        return grade;
    }
}
