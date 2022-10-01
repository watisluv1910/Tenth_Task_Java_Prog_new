package org.application;

public class Student {

    private String name, surname, specialization;
    private Integer course, group, points;

    public Student() {}

    public Student(String name, String surname, String specialization, Integer course, Integer group) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", points=" + points +
                '}';
    }
}
