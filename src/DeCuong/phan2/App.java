package DeCuong.phan2;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        CRUDStudent crud = new CRUDStudent();

        Student student = new Student(1, "Khánh", "unknown");
        Student student1 = new Student(2, "Chanh", "unknown");
        Student student2 = new Student(3, "Sâm", "unknown");

        crud.addStudent(student);
        crud.addStudent(student1);
        crud.addStudent(student2);

        crud.addStudentToFile(student, "student1.txt");
        crud.addStudentToFile(student1, "student2.txt");
        crud.addStudentToFile(student2, "student3.txt");

        Student getS1 =  crud.getStudentFromFile("student1.txt");
        Student getS2 =  crud.getStudentFromFile("student2.txt");
        Student getS3 =  crud.getStudentFromFile("student3.txt");

        System.out.println("Thông tin sinh viên 1 " + getS1 );
        System.out.println("Thông tin sinh viên 2 " + getS2 );
        System.out.println("Thông tin sinh viên 3 " + getS3 );


        crud.addListStudentToFile(new Student[]{student,student1,student2},"students.txt");

        Student[] studentFromFile = crud.getAllStudentFromFile("students.txt");

        System.out.println("All student: " + Arrays.toString(studentFromFile));

    }
}
