package com.hospital.exceptions;

public class EmployeeTaskNotRightException extends Exception {
    public EmployeeTaskNotRightException() {
        System.out.println("Error check speciality! This is not a doctor.");
    }

    public EmployeeTaskNotRightException(String message) {
        super(message);
    }
}
