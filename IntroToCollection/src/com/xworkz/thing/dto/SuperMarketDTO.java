package com.xworkz.thing.dto;

public class SuperMarketDTO {

    //SuperMarketDTO(83): name,location,totalStaff,totalArea,managerName
    //find all by location
    //find all by totalStaff greaterThan
    //find all by totalArea and totalStaff
    //print managerName
    //print name

    private String name;
    private String location;
    private int totalStaff;
    private String managerName;

    public SuperMarketDTO()
    {

    }

    public SuperMarketDTO(String name, String location, int totalStaff, String managerName) {
        this.name = name;
        this.location = location;
        this.totalStaff = totalStaff;
        this.managerName = managerName;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof SuperMarketDTO)
            {
                SuperMarketDTO casted=(SuperMarketDTO) obj;
                if(((SuperMarketDTO) obj).name.equals(casted.getName()))
                return true;
            }
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "SuperMarketDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalStaff=" + totalStaff +
                ", managerName='" + managerName + '\'' +
                '}';
    }


}
