package com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.departments;


import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.IDivision;

import java.util.List;

public interface IDepartment<Long , String> {
    List<IDivision> getDivisions ();
    void addDivision ( IDivision division );

}

