package com.hospital.entities.appointment;

import com.hospital.entities.persons.IPerson;
import com.hospital.exceptions.NullDateTimeException;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public interface IAppointment {
    boolean releaseAppointment () throws NullDateTimeException;
    LocalDateTime updateAppointment (LocalDateTime dateTime) throws DateTimeException;
    LocalDateTime updateAppointment (LocalDateTime dateTime, IPerson doctor) throws DateTimeException;
}
