package com.hospital.enums;

public enum HospitalType {
    CHILDRENS_HOSPITAL,
    ADULTS_HOSPITAL;

    private HospitalType type ;

    HospitalType(HospitalType type) {
        this.type = type;
    }

    HospitalType() {

    }

    public HospitalType getType(HospitalType type){
        return type;
    }

    public void setType(HospitalType typeHospital) {
        this.type = typeHospital;
    }

    @Override
    public String toString() {
        return this == CHILDRENS_HOSPITAL ? "Children's hospital" : "Adults hospital";
    }
}
