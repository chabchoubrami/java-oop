package com.finall;

public final class Student {
    private final int STUDENT_ID;
    private String name;
    private int yeahOfBirth;
    private final static float DEGEE_OF_SUCCESS; // static blank final variable

    // { STUDENT_ID = 123; }
//    Student () {
//        STUDENT_ID = 123;
//    }
    static {
        DEGEE_OF_SUCCESS = 50;
    }

    public Student(final int STUDENT_ID, String name, int yeahOfBirth) {
        this.STUDENT_ID = STUDENT_ID;
        this.name = name;
        this.yeahOfBirth = yeahOfBirth;
    }

    @Override
    final public String toString() {
        return "Student{" +
                "STUDENT_ID=" + STUDENT_ID +
                ", name='" + name + '\'' +
                ", yeahOfBirth=" + yeahOfBirth +
                '}';
    }
}

class GraduatedStudent extends Student {
    public GraduatedStudent(int STUDENT_ID, String name, int yeahOfBirth) {
        super(STUDENT_ID, name, yeahOfBirth);
    }

    // ERROR because final keyword is used
    @Override
    public String toString() {
        return "GraduatedStudent{" +
                "STUDENT_ID=" + STUDENT_ID +
                ", name='" + name + '\'' +
                ", yeahOfBirth=" + yeahOfBirth +
                '}';
    }
}