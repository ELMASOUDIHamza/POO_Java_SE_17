package com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions;

import com.hospital.entities.persons.Employee;
import com.hospital.exceptions.AddDivisionException;
import com.hospital.exceptions.PersonNotFoundException;

import java.util.Map;
import java.util.Set;

/***
 * Here we will use Composite pattern
 * We assume that a division can contain other subdivisions
 */
public interface IDivision {

    Map<Long , Employee> getEmployeeList ();
    Employee getManager() throws PersonNotFoundException;
    Set<IDivision> getSubdivisions();
    String getDivisionParent() throws NullPointerException;
    void addSubdivision (IDivision subdivision) throws AddDivisionException;

}
