package com.hospital.entities.rooms;

import com.hospital.entities.hospitals_departments_divisions.hospitals.IHospital;
import com.hospital.enums.RoomType;
import com.sun.security.auth.UnixNumericUserPrincipal;

import java.util.UUID;

public class RoomImpl implements IRoom {
    private String idRoom ;
    private boolean isAvailable ;
    private String name ;
    private IHospital hospital ;
    private RoomType roomType ;
//Constructors :

    public RoomImpl(RoomType roomType, String name) {
        this.idRoom = UUID.fromString(roomType.toString().concat(name)).toString();
    }
    public RoomImpl( boolean isAvailable, String name, RoomType roomType) {
        this.idRoom = UUID.fromString(roomType.toString().concat(name)).toString();
        this.isAvailable = isAvailable;
        this.name = name;
        this.roomType = roomType;
    }
// Getters :
    public String getIdRoom() {
        return idRoom;
    }
    public String getName() {
        return name;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public IHospital getHospital() {
        return hospital;
    }

    public RoomType getRoomType() {
        return roomType;
    }

// Setters :
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHospital(IHospital hospital) {
        this.hospital = hospital;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    //Implemented methods :
    @Override
    public void freeUpRoom() {
        this.setAvailable(true);
    }
}
