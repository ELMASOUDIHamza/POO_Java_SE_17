package com.hospital.entities.rooms;

public abstract class RoomImpl implements IRoom {
    protected boolean isAvailable ;
    protected int idRoom ;
    protected String name ;

// Getters :
    public int getIdRoom() {
        return idRoom;
    }
    public String getName() {
        return name;
    }
// Setters :
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void setName(String name) {
        this.name = name;
    }
//

    @Override
    public void freeUpRoom() {
        this.setAvailable(true);
    }
}
