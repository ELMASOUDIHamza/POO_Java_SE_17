package com.hospital.entities.persons;

import com.hospital.entities.appointment.IAppointment;
import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.IDivision;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Patient extends PersonImpl{
    private Set<IAppointment> appointmentList ;
//Getters & Setters :
    public Set<IAppointment> getAppointmentList() {
        return appointmentList;
    }
    public void setAppointmentList(Set<IAppointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
// Constructors :
    public Patient(Long id, Set<IAppointment> appointmentList) {
        super(id);
        this.appointmentList = appointmentList;
    }

    public Patient(Long id, String fullname, Set<IAppointment> appointmentList) {
        super(id, fullname);
        this.appointmentList = appointmentList;
    }

    public Patient(Long id, String fullname, IDivision division, Set<IAppointment> appointmentList) {
        super(id, fullname, division);
        this.appointmentList = appointmentList;
    }

    public Patient (Long id, String fullname, IDivision division,Set<IAppointment> appointmentList, Date dateOfBirth, boolean isWomen, String phoneNumber) {
        this( id, fullname, division,appointmentList);
        this.dateOfBirth = dateOfBirth;
        this.isWomen = isWomen;
        this.phoneNumber = phoneNumber;
    }
}
