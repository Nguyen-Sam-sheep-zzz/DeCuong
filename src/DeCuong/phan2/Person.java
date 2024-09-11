package DeCuong.phan2;

import java.io.Serializable;

public class Person implements Serializable {
    private int personID;
    private String personName;
    private String dateOfBirth;

    Person() {

    }

    Person(int personID, String personName, String dateOfBirth) {
        this.personID = personID;
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person[ " +
                "personID:" + personID +
                "|personName:'" + personName + '\'' +
                "|dateOfBirth:'" + dateOfBirth + '\'' +
                " ]";
    }
}
