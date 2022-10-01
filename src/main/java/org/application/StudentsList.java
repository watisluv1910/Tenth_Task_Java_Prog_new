package org.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StudentsList {

    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setArray() {
        Integer navVar = MyInput.inputInteger("Enter the number of students you would like to add", Integer::valueOf);

        for (int i = 0; i < navVar; i++) {
            students.add(setStudent());
        }
    }

    public Student setStudent() {
        Student student = new Student();
        student.setName(MyInput.inputString("Enter the student name:", v -> v));
        student.setSurname(MyInput.inputString("Enter the student surname:", v -> v));
        student.setSpecialization(MyInput.inputString("Enter the student specialization:", v -> v));
        student.setPoints(MyInput.inputInteger("Enter the student points:", Integer::valueOf));
        student.setCourse(MyInput.inputInteger("Enter the student course:", Integer::valueOf));
        student.setGroup(MyInput.inputInteger("Enter the student group:", Integer::valueOf));
        return student;
    }

    public void outArray(ArrayList<Student> students) {

        for (Student student : students) {

            System.out.println(student);
        }
    }

    public ArrayList<Student> mergeSort() {
        ArrayList<Student> tempList = new ArrayList<>(students);

        Comparator<Student> studentComparator = new StudentPointsComparator().thenComparing(new StudentsNameComparator());

        tempList.sort(studentComparator);

        return tempList;
    }

    public ArrayList<Student> quickSort() {
        ArrayList<Student> tempList = new ArrayList<>(students);

        Student[] tempArray = students.toArray(new Student[students.size()]);

        Comparator<Student> studentComparator = new StudentPointsComparator().thenComparing(new StudentsNameComparator());

        Arrays.sort(tempArray, studentComparator);

        arrayToList(tempList, tempArray);

        return tempList;
    }

    private void arrayToList(ArrayList<Student> studentsList, Student[] studentsArray) {

        for (int i = 0; i < studentsList.size(); i++) {

            studentsList.set(i, studentsArray[i]);
        }
    }
}
