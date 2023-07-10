package com.hospital.entities.hospitals_departments_divisions.hospitals;

import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.departments.IDepartment;
import com.hospital.exceptions.DepartmentNotFoundException;

import java.util.Set;

/**
 * Here I will use composite design pattern
 */
public interface IHospital<HospitalType> {
    boolean isOpen (boolean open);
    String getHospitalInfos ();
    void addDepartment(IDepartment department) throws NullPointerException ;
    void removeDepartment (IDepartment department) throws DepartmentNotFoundException;
    Set<IHospital> hospitalList ();


}
