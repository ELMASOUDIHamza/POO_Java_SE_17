package com.hospital.entities.persons;

import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.IDivision;

import java.util.regex.Pattern;

public interface IPerson {

    default String isValidEmail(String email) throws IllegalArgumentException {
        return Pattern.compile("^(.+)@(.+)$").
                matcher(email).matches() ? "Correct email !" : new IllegalArgumentException("Error ! Please enter a correct email.").toString();
    }
    default boolean isValidPhoneNumber(String number) throws IllegalArgumentException {
        boolean isValid  = Pattern.compile("^\\d{10}$").
                matcher(number).matches() ;
         if(!isValid) throw new IllegalArgumentException("Error ! please enter a correct phone number.");
        return  isValid ;
    }

}
