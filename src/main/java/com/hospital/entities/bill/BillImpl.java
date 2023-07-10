package com.hospital.entities.bill;

import com.hospital.entities.appointment.IAppointment;
import com.hospital.entities.persons.IPerson;

import java.util.List;
import java.util.UUID;

public class BillImpl implements IBill {
    private String id ;
    private float amount ;
    private IPerson patient ;
    private List<IAppointment> appointmentList ;
// Constructors :

    public BillImpl() {
        this.id = UUID.fromString(getPatient().toString()).toString();
    }
    public BillImpl(String id, float amount, IPerson patient, List<IAppointment> appointmentList) {
        this.id = id;
        this.amount = amount;
        this.patient = patient;
        this.appointmentList = appointmentList;
    }

    // Getters :
    public String getId() {
        return id;
    }
    public float getAmount() {
        return amount;
    }
    public IPerson getPatient() {
        return patient;
    }
    public List<IAppointment> getAppointmentList() {
        return appointmentList;
    }
// Setters :
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public void setPatient(IPerson patient) {
        this.patient = patient;
    }
    public void setAppointmentList(List<IAppointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
}
