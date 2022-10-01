package org.application;

import java.util.Comparator;

public class StudentPointsComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) { // Descending order by points
        return o1.getPoints() < o2.getPoints() ? 1 : o1.getPoints() == o2.getPoints() ? 0 : -1;
    }
}
