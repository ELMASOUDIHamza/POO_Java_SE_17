package com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.divisions;

import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.departments.IDepartment;
import com.hospital.entities.persons.Employee;
import com.hospital.exceptions.PersonNotFoundException;

import java.util.*;
/*** méthodes à redéfinir
 * Here we will use Composite pattern
 * We assume that a division can contain other subdivisions
 */
public class DivisionImpl implements IDivision {
    private String id;
    private int divisionLevel ;
    private String divisionName;
    private IDepartment department;
    private Set<IDivision> subdivisionList = new LinkedHashSet<>() ;
    private IDivision divisionParent ;
    private Map <Long , Employee> employeeList ;
// Constructors :
    public DivisionImpl() {
        this.id = Objects.requireNonNullElse(id, UUID.fromString(divisionName).toString()) ;
    }
    public DivisionImpl (IDivision parent ){
        this();
        this.divisionParent = parent ; }

    public DivisionImpl( String divisionName, IDepartment department) {
        this();
        this.divisionName = divisionName;
        this.department = department;
    }
    public DivisionImpl(String divisionName, IDepartment department, Map<Long, Employee> employeeList) {
        this(divisionName, department);
        this.employeeList = employeeList;
    }
    public DivisionImpl(String divisionName, IDepartment department, Set<IDivision> subdivisionList, Map<Long, Employee> employeeList) {
        this(divisionName, department, employeeList);
        this.subdivisionList = subdivisionList;
    }
// Getters :
    public String getId() {
        return id;
    }

    public int getDivisionLevel() {
        return divisionLevel;
    }
    public IDepartment getDepartment() {
        return department;
    }
    public Set<IDivision> getSubdivisionList() {
        return subdivisionList;
    }
//    public IDivision getDivisionParent(){ return divisionParent ;}
    public String getDivisionName() {
        return divisionName;
    }
// Setters :            << We assum that id cannot be modified >>
    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public void setSubdivisionList(Set<IDivision> subdivisionList) {
        this.subdivisionList = subdivisionList;
    }

    public void setEmployeeList(Map<Long, Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setDivisionLevel(int divisionLevel) {
        this.divisionLevel = divisionLevel;
    }

    public void setDepartment(IDepartment department) {
        this.department = department;
    }

    public void setDivisionParent(IDivision divisionParent) {
        this.divisionParent = divisionParent;
    }

    // Implemented methods :
    @Override
    public Employee getManager() throws PersonNotFoundException {
        return (Employee) employeeList.entrySet().
                stream().filter( emp -> emp.getValue().isManager(this));
    }

    @Override
    public Set<IDivision> getSubdivisions() {
        return subdivisionList;
    }

    @Override
    public String getDivisionParent() throws NullPointerException {
        return divisionLevel > 1 ? getDivisionParent().toString() :  new NullPointerException("This division don't have division parent !").toString();
    }

    @Override
    public void addSubdivision(IDivision subdivision) {
        subdivision = new DivisionImpl(this );
        ((DivisionImpl)subdivision).setDivisionLevel(++this.divisionLevel);
        subdivisionList.add(subdivision);

    }
    @Override
    public Map<Long, Employee> getEmployeeList() {
//        return null ;
        return (Map<Long, Employee>) employeeList.entrySet().stream().filter( (emp) -> emp.getValue().getDivision().equals(this.divisionName) ).toList();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
