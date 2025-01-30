package com.xworkz.javastreams.thing;

import java.io.Serializable;

public class AddressDTO implements Serializable,Comparable<AddressDTO> {

    //street,no,area

    private String street;
    private String crossNum;
    private String area;

    public AddressDTO(String street, String crossNum, String area) {
        this.street = street;
        this.crossNum = crossNum;
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCrossNum() {
        return crossNum;
    }

    public void setCrossNum(String crossNum) {
        this.crossNum = crossNum;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
            if(obj instanceof AddressDTO)
            {
                AddressDTO casted=(AddressDTO) obj;
                if(casted.street.equals(this.street))
                    return true;
            }
        return false;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "street='" + street + '\'' +
                ", crossNum='" + crossNum + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    @Override
    public int compareTo(AddressDTO o) {
        return o.area.compareTo(this.area);
    }
}
