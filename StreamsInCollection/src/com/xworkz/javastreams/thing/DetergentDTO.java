package com.xworkz.javastreams.thing;

import java.io.Serializable;
import java.util.Objects;

public class DetergentDTO implements Serializable,Comparable<DetergentDTO> {
    private String brand;
    private int discount;
    private int quantity;
    private String soldBy;
    private int pricePerKg;

    public DetergentDTO()
    {

    }

    @Override
    public boolean equals(Object obj) {

        if(obj!=null)
            if(obj instanceof DetergentDTO) {
                DetergentDTO casted = (DetergentDTO) obj;
                if(casted.getBrand().equals(((DetergentDTO) obj).getBrand()))
                    return true;
            }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, discount, quantity, soldBy, pricePerKg);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getdiscount() {
        return discount;
    }

    public void setdiscount(int discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }



    @Override
    public String toString() {
        return "DetergentDTO{" +
                "brand='" + brand + '\'' +
                ", price=" + discount +
                ", quantity=" + quantity +
                ", soldBy='" + soldBy + '\'' +
                ", pricePerKg=" + pricePerKg +
                '}';
    }

    @Override
    public int compareTo(DetergentDTO detergentDTO) {

        return this.brand.compareTo(detergentDTO.brand);
        //return Integer.compare(this.discount,detergentDTO.discount);

    }
}
