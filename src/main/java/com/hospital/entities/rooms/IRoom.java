package com.hospital.entities.rooms;

import com.hospital.entities.appointment.IAppointment;

/***
 * Here we can use template method pattern
 * to implement a several methods in an abstract
 * to implement it by different way
 */
public interface IRoom {
    void reserveRoom (IAppointment appointment);
    void freeUpRoom ();
    default void freeUp(IAppointment appointment){
        appointment.
    }
}
