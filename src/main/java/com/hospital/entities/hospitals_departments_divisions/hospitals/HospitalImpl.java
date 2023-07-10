package com.hospital.entities.hospitals_departments_divisions.hospitals;

import com.hospital.entities.address.Address;
import com.hospital.entities.hospitals_departments_divisions.departments_and_divisions.departments.IDepartment;
import com.hospital.entities.rooms.IRoom;
import com.hospital.enums.HospitalType;
import com.hospital.exceptions.DepartmentNotFoundException;

import java.util.*;

public class HospitalImpl implements IHospital {
    private int id;
    private String name;
    private Address hospiatlAddress ;
    private HospitalType hospitalType ;
    private Set<IHospital> hospitalList = new LinkedHashSet<>();
    private List<IRoom> roomList = new ArrayList<>();
    private List<IDepartment> departments= new LinkedList<>();

    public HospitalImpl(HospitalType type) {
        this.hospitalType= type;
        hospitalList.add(this);
    }
    public HospitalImpl(int id, String name, HospitalType hospitalType) {
        this(hospitalType);
        this.id = Objects.requireNonNull(id, "Id cannot be null");
        this.name = name;
    }

    public HospitalImpl(int id, String name, Address hospiatlAddress, HospitalType hospitalType) {
        this(id, name, hospitalType);
        this.hospiatlAddress = hospiatlAddress;
    }
    public HospitalImpl(int id, String name, Address hospiatlAddress, HospitalType hospitalType, List<IRoom> rooms) {
        this(id, name, hospiatlAddress, hospitalType);
        this.roomList = rooms;
    }
    public HospitalImpl(int id, String name, Address hospiatlAddress, HospitalType hospitalType, List<IRoom> rooms, List<IDepartment> departmentList) {
        this(id, name, hospiatlAddress, hospitalType, rooms);
        this.departments = departmentList;
    }

    @Override
    public boolean isOpen(boolean open) {
        open = true ;
        return open;
    }

    @Override
    public String getHospitalInfos() {
        String infos = """
                Hospital name : %s,
                Address : %s,
                Type : %s,
                id : %d,
                Open : %b,
                """.formatted(name,hospiatlAddress,hospitalType.toString(),id,isOpen(true));
        return infos;
    }
    @Override
    public void addDepartment(IDepartment department) throws NullPointerException {
//        departments.add(department);
        if(!departments.add(department)) throw new NullPointerException("Cannot add null department to ");
    }
    @Override
    public void removeDepartment(IDepartment department) throws DepartmentNotFoundException {
        if (!departments.remove(department)) {
            throw new DepartmentNotFoundException("Department not found !");
        }

    }

    @Override
    public Set<IHospital> hospitalList() {
        return hospitalList;
    }
}
