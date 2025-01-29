package com.xworkz.thing.dto;

import java.io.Serializable;

public class IplTeamDto implements Serializable {

    //IplDTO(10): name,teamSize,ownerName,sponsorName,budget
    //print all name
    //find all iplDto By Budget
    //find all iplDto by sponsorName
    //find all iplDto by ownerName and sponsorName
    //find all iplDto by teamSize
    //print name and teamSize
    //print name and budget
    private String name;
    private int teamSize;
    private String ownerName;
    private String sponsorName;
    private double teamBudget;

    public  IplTeamDto()
    {

    }

    public IplTeamDto(String name, int teamSize, String ownerName, String sponsorName, double teamBudget) {
        this.name = name;
        this.teamSize = teamSize;
        this.ownerName = ownerName;
        this.sponsorName = sponsorName;
        this.teamBudget = teamBudget;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof IplTeamDto)
            {
                IplTeamDto casted=(IplTeamDto) obj;
                if(((IplTeamDto) obj).name.equals(casted.name))
                {
                    System.out.println("Nmae ");
                    return  true;
                }
            }

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public double getTeamBudget() {
        return teamBudget;
    }

    public void setTeamBudget(double teamBudget) {
        this.teamBudget = teamBudget;
    }

    @Override
    public String toString() {
        return "IplTeamDto{" +
                "name='" + name + '\'' +
                ", teamSize=" + teamSize +
                ", ownerName='" + ownerName + '\'' +
                ", sponsorName='" + sponsorName + '\'' +
                ", teamBudget=" + teamBudget +
                '}';
    }
}
