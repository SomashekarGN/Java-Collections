package com.xworkz.things;

import java.io.Serializable;
import java.util.Objects;

public class GiftDTO implements Comparable<GiftDTO>, Serializable {

    private int id;
    private String name;
    private double cost;
    private String from;
    private String to;


    public GiftDTO() {
    }


    public GiftDTO(int id, String name, double cost, String from, String to) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }


    @Override
    public String toString() {
        return "GiftDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
            if(obj instanceof GiftDTO)
            {
                GiftDTO casted=(GiftDTO) obj;
                if(casted.getId()==((GiftDTO) obj).getId())
                    return true;
            }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost, from, to);
    }

    @Override
    public int compareTo(GiftDTO o) {
        return this.getName().compareTo(o.getName());
    }
}
