package com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.departments;


import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.DivisionImpl;
import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions.IDivision;
import com.hospital.entities.persons.IPerson;

import java.util.List;
import java.util.UUID;

public class DepartmentImpl implements IDepartment {
    private String idDepartment;
    private String name;
    private IPerson departmentManager;
    private List<IDivision> divisionList ;

// Constructors :
    public DepartmentImpl(String name) {
        this.idDepartment = UUID.fromString(name).toString();
        this.name = name;
    }
    public DepartmentImpl(String name, IPerson departmentManager, List <IDivision> divisionList) {
        this(name);
        this.departmentManager = departmentManager;
        this.divisionList = divisionList;
    }
// Getters :
    public String getIdDepartment() {
        return idDepartment;
    }
    public String getName() {
        return name;
    }

    public IPerson getDepartmentManager() {
        return departmentManager;
    }
    public List<IDivision> getDivisionList() {
        return divisionList;
    }
// Setters :
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartmentManager(IPerson departmentManager) {
        this.departmentManager = departmentManager;
    }

    public void setDivisionList(List<IDivision> divisionList) {
        this.divisionList = divisionList;
    }
// Implemented methods
    @Override
    public List<IDivision> getDivisions() {
        return getDivisionList();
    }

    @Override
    public void addDivision(IDivision division) {
        division = new DivisionImpl();
        divisionList.add(division) ;
        ((DivisionImpl) division).setDepartment(this);
        ((DivisionImpl) division).setDivisionLevel(1);
    }
}
