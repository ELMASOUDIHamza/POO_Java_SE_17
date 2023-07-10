package com.hospital.entities.persons;

import com.hospital.entities.appointment.AppointmentImpl;
import com.hospital.entities.appointment.IAppointment;
import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.IDivision;
import com.hospital.enums.DoctorSpeciality;
import com.hospital.enums.Job;
import com.hospital.exceptions.EmployeeTaskNotRightException;
import com.hospital.exceptions.PersonNotFoundException;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.util.stream.Collectors.toList;

public  class Employee extends PersonImpl implements IEmployeeTask {
    private Job job;
    private DoctorSpeciality doctorSpeciality;
    private Set<IAppointment> appointmentList = new TreeSet<>(); // I used a Set to avoid appointment duplication
    public Employee(Long id) {
        super(id);
    }
// Constructors :
    public Employee(Long id, String fullname) {
        super(id, fullname);
    }
    public Employee(Long id, String fullname, IDivision division, Job job) {
        super(id, fullname, division);
        this.job = job;
    }
    public Employee(Long id, String fullname, IDivision division, Date dateOfBirth, boolean isWomen, String phoneNumber, Job job) {
        super( id, fullname, division, dateOfBirth,isWomen ,phoneNumber);
        this.job = job;
    }
// Getters :
    public Job getJob() {
        return job;
    }

    public DoctorSpeciality getDoctorSpeciality() {
        return job==Job.DOCTOR ? doctorSpeciality :  null;
    }

    public Set<IAppointment> getAppointmentList() {
        return appointmentList;
    }
// Setters :
    public void setJob(Job job) {
        this.job = job;
    }
    public void setAppointmentList(Set<IAppointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
    // Implemented methods :
    @Override
    public Set<IAppointment> checkPatient(IPerson patient) throws PersonNotFoundException {
        return job.equals (Job.RECEPTIONIST) || job.equals(Job.DOCTOR) ? ((Patient) patient).getAppointmentList()
                : (Set<IAppointment>) new EmployeeTaskNotRightException("Error!  you should be <<Receptionist>> or <<Doctor>> to check patient.");
    }
    @Override
    public List<IPerson> checkAvailableDoctors(LocalDateTime dateT) throws Exception {
        return appointmentList.stream().filter((appointment) -> !((AppointmentImpl)appointment).getDateTime().
                    equals(dateT) ).map(appointment -> ((AppointmentImpl) appointment).getDoctor()).toList();
    }
    @Override
    public List<LocalDateTime> checkAvailableDoctors(LocalDateTime dateTime, IPerson doctor) throws Exception {
        return appointmentList.stream().filter((appointment)-> ((AppointmentImpl)appointment).getDoctor().equals(doctor)).
                filter(appointment -> !((AppointmentImpl)appointment).getDateTime().equals(dateTime)).
                map(appointment -> ((AppointmentImpl) appointment).getDateTime()).toList();

    }
    @Override
    public List<IPerson> checkAvailableDoctors(LocalDateTime dateTime, DoctorSpeciality doctorSpeciality) throws Exception {
        return appointmentList.stream().filter(appointment -> !((AppointmentImpl)appointment).getDateTime().equals(dateTime)).
                filter((appointment) -> ((Employee)((AppointmentImpl)appointment).getDoctor()).getDoctorSpeciality().equals(doctorSpeciality)).
                map(appointment -> ((AppointmentImpl) appointment).getDoctor()).toList();
    }

    @Override
    public String checkSchedule(IPerson doctor) throws NullPointerException {
        return appointmentList.stream().filter(appointment -> ((AppointmentImpl)appointment).
                getDoctor().equals(doctor)).map(appointment -> ((AppointmentImpl) appointment).getDateTime()).toString();
    }

    @Override
    public String generatePrescription(IPerson patient, String prescription) {
        return job.equals(Job.DOCTOR) ? prescription : new PersonNotFoundException("Error! Patient not found.").toString() ; // à refaire
    }
    @Override
    public  boolean isManager(IDivision division) {
        return (job == Job.MANAGER && division.equals(division)); // Return if is manager of a specific division or not
    }

}
