package com.relationship;

public class PersonaInformation {
    private String firstName;
    private String middleName;
    private String lastName;
    private String bloodGroup;
    private String accountNumber;
    private String nationality;
    private String yearOfBirth;

    public PersonaInformation() {
    }

    public PersonaInformation(String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, String yearOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "PersonaInformation{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                '}';
    }
}
