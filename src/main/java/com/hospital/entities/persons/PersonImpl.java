package com.hospital.entities.persons;

import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.IDivision;

import java.time.DateTimeException;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

public abstract class PersonImpl implements IPerson {
    protected Long id ;
    protected String fullname ;
    protected IDivision division ;
    protected Date dateOfBirth ;
    protected boolean isWomen ;
    protected String phoneNumber ;

// Constructors :
    public PersonImpl() { }
    public PersonImpl(Long id) {
        this.id = Objects.requireNonNull(id);
    }
    public PersonImpl(Long id, String fullname) {
        this(id);
        this.fullname = fullname;
    }
    public PersonImpl(Long id, String fullname, IDivision division) {
        this(id, fullname);
        this.division = division;
    }

    public PersonImpl(Long id, String fullname, IDivision division, Date dateOfBirth, boolean isWomen, String phoneNumber) {
        this( id, fullname, division);
        this.dateOfBirth = dateOfBirth;
        this.isWomen = isWomen;
        this.phoneNumber = phoneNumber;
    }

    // Getters :
    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public IDivision getDivision() {
        return division;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isWomen() {
        return isWomen;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters :
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDivision(IDivision division) {
        this.division = division;
    }

    public void setDateOfBirth(Date dateOfBirth) throws DateTimeException {
        this.dateOfBirth = dateOfBirth;
    }

    public void setWomen(boolean women) {
        isWomen = women;
    }

    public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException {
        if(isValidPhoneNumber(phoneNumber) ) this.phoneNumber = phoneNumber ;
    }
}
