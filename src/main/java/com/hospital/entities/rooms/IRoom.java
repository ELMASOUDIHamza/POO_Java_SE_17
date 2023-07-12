package com.hospital.entities.rooms;

import com.hospital.entities.appointment.IAppointment;
import com.hospital.entities.persons.IPerson;

import java.util.LinkedList;
import java.util.List;

/***
 * Here we can use template method pattern
 * to implement a several methods in an abstract
 * to implement it by different way
 */
public interface IRoom {
    List<IAppointment> appointmentList = new LinkedList<>();
    default boolean reserveRoom (IAppointment appointment){
        return appointmentList.add(appointment);
    }
    void freeUpRoom();
}
