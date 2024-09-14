package DeCuong.phan2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDStudent {
    private Student[] students;
    private static int numberOfStudent = 0;

    public CRUDStudent() {
        students = new Student[100];
        numberOfStudent = 0;
    }

    public boolean addStudent(Student objStudent) {
        if (numberOfStudent < students.length) {
            students[numberOfStudent++] = objStudent;
            return true;
        }
        return false;
    }

    public boolean addStudentToFile(Student objStudent, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename, true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(objStudent);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student getStudentFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addListStudentToFile(Student[] listStudent, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Student student : listStudent) {
                if (student != null) {
                    oos.writeObject(student);
                }
            }
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student[] getAllStudentFromFile(String filename) {
        List<Student> studentsList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    studentsList.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentsList.toArray(new Student[0]);
    }
}