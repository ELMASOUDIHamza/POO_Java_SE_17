package com.hospital.entities.appointment;

import com.hospital.entities.persons.Employee;
import com.hospital.entities.persons.IPerson;
import com.hospital.entities.rooms.IRoom;
import com.hospital.entities.rooms.RoomImpl;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.UUID;

public class AppointmentImpl implements IAppointment{
    private String id ;
    private LocalDateTime dateTime;
    private IPerson doctor;
    private IRoom room;
    private IPerson patient ;
    private boolean isPast ;
// Constructors :
    public AppointmentImpl() {
        this.id = UUID.fromString(((Employee)doctor).getFullname().concat(dateTime.toString())).toString();
    }
    public AppointmentImpl(LocalDateTime dateTime, RoomImpl room, IPerson patient, IPerson doctor) {
        this();
        this.dateTime = dateTime;
        this.room = room;
        this.patient = patient;
        this.doctor = doctor;
    }
// Getters :
    public String getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public IPerson getDoctor() {
        return doctor;
    }

    public IRoom getRoom() {
        return room;
    }

    public IPerson getPatient() {
        return patient;
    }

    public boolean isPast() {
        return isPast;
    }
// Setters :
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setDoctor(IPerson doctor) {
        this.doctor = doctor;
    }

    public void setRoom(RoomImpl room) {
        this.room = room;
    }

    public void setPatient(IPerson patient) {
        this.patient = patient;
    }

    public void setPast(boolean past) {
        isPast = past;
    }
// Implemented methods :
    @Override
    public boolean releaseAppointment() throws NullPointerException {
        if (dateTime.isAfter(LocalDateTime.now()) ) this.setPast(true); // Can we remove it in this case ?
        return isPast();
    }

    @Override
    public LocalDateTime updateAppointment(LocalDateTime dateTimeUpdated) throws DateTimeException {
        setDateTime(dateTimeUpdated);
        return getDateTime();
    }
    @Override
    public LocalDateTime updateAppointment(LocalDateTime dateTimeUpdated, IPerson doctor) throws DateTimeException {
        setDateTime(dateTimeUpdated);
        setDoctor(doctor);
        return getDateTime();
    }
}
