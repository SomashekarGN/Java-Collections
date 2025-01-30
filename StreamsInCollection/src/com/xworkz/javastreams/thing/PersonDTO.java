package com.xworkz.javastreams.thing;

import java.io.Serializable;

public class PersonDTO implements Serializable,Comparable<PersonDTO> {

    //name,email,mobile,address
    private String name;
    private String email;
    private long mobile;
    private AddressDTO address;


    public PersonDTO(String name, String email, long mobile, AddressDTO address) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
            if(obj instanceof PersonDTO)
            {
                PersonDTO casted=(PersonDTO) obj;
                if(casted.name.equals(this.name))
                    return true;
            }
        return false;
    }

    @Override
    public int compareTo(PersonDTO o) {
        return o.name.compareTo(this.name);
    }


}
