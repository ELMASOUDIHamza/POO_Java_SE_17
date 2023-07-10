package com.hospital.enums;

public enum ChildrenOrAdultPatient {
    CHILDREN_PATIENT (getAge()),
    ADULT_PATIENT (getAge());
    private static byte age ;
    private boolean isAdult;

    public static byte getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    ChildrenOrAdultPatient(byte age) throws IllegalArgumentException{
        setAge(age);
        if(age > 0 && age < 18) setAdult(false);
        else if (age <= 0 || age > 127 ) {
         throw new IllegalArgumentException("Error age ! Please enter a valid age ranging from 0 to 127");
        }
        else    setAdult(true);
    }
}
