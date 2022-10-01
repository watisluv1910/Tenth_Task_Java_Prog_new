package org.application;

public class App {

    public static void main( String[] args ) {

        StudentsList studentsList = new StudentsList();

        while (true) {

            Integer navigationVar = MyInput.inputInteger("""
                    Navigation menu:
                    Enter 1 to enter students data.
                    Enter 2 to run quick sort.
                    Enter 3 to run merge sort.
                    Enter 4 to concatenate sorted arrays;
                    Enter any other digit to stop the program.""", Integer::valueOf);

            switch (navigationVar) {
                case 1: {
                    studentsList.setArray();
                    break;
                }
                case 2: {
                    studentsList.outArray(studentsList.quickSort());
                    break;
                }
                case 3: {
                    studentsList.outArray(studentsList.mergeSort());
                    break;
                }
                case 4: {
                    StudentsList studentsList1 = new StudentsList();
                    System.out.println("Enter the second array data:");
                    studentsList1.setArray();
                    studentsList.getStudents().addAll(studentsList1.getStudents());
                    studentsList.outArray(studentsList.mergeSort());
                    break;
                }
                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
