package com.hospital.entities.persons;

import com.hospital.entities.appointment.IAppointment;
import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.IDivision;
import com.hospital.enums.DoctorSpeciality;
import com.hospital.exceptions.EmployeeTaskNotRightException;
import com.hospital.exceptions.PersonNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface IEmployeeTask {
    Set<IPerson> patientList = new TreeSet<>();
    default boolean subscribePatient (IPerson patient) throws NullPointerException {
        boolean successful =true ;
        if (!patientList.add(patient)) {
            successful = false ;
            throw new NullPointerException("Can't add null value for patient"+this);
        }
        return successful ;
    }
    Set<IAppointment> checkPatient(IPerson patient) throws PersonNotFoundException;
    List<IPerson> checkAvailableDoctors(LocalDateTime dateTime )throws Exception;
    List<LocalDateTime> checkAvailableDoctors(LocalDateTime dateTime , IPerson doctor)throws Exception;
    List<IPerson> checkAvailableDoctors(LocalDateTime dateTime , DoctorSpeciality doctorSpeciality)throws Exception;
    String checkSchedule(IPerson doctor) throws NullPointerException;
    String generatePrescription(IPerson patient, String prescription) throws PersonNotFoundException, EmployeeTaskNotRightException;
    boolean isManager(IDivision division);

}

