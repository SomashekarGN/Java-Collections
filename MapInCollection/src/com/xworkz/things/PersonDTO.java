package com.xworkz.things;

import java.util.Objects;

public class PersonDTO {

    private String personName;
    private long mobileNum;

    public PersonDTO()
    {

    }

    public PersonDTO(String personName, long mobileNum) {
        this.personName = personName;
        this.mobileNum = mobileNum;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "personName='" + personName + '\'' +
                ", mobileNum=" + mobileNum +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if(obj!=null)
            if(obj instanceof PersonDTO)
            {
                PersonDTO casted=(PersonDTO) obj;
                if (this.personName.equals(((PersonDTO) obj).personName))
                    return true;
            }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, mobileNum);
    }
}
