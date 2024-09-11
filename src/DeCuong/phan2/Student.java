package DeCuong.phan2;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private double markAvg;

    Student() {

    }

    Student(int personID, String personName, String dateOfBirth) {
        super(personID, personName, dateOfBirth);
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    @Override
    public String toString() {
        return "Student[" +
                "| ID:" + getPersonID() + " " +
                "| Name:" + getPersonName() + " " +
                "| Date Of birth:" + getDateOfBirth() + " " +
                "| markAvg:" + markAvg + " " + "|" +
                ']';
    }
}
