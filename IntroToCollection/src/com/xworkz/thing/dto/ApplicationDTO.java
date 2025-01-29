package com.xworkz.thing.dto;

import java.util.Objects;

public class ApplicationDTO {

    //ApplicationDTO(20): id,name,type,version,size,companyName
    //print name and companyName
    //print name and version and size
    //find all by type
    private int id;
    private String name;
    private String appType;
    private double version;
    private double size;
    private String companyName;

    public ApplicationDTO()
    {

    }
    public ApplicationDTO(int id, String name, String appType, double version, double size, String companyName) {
        this.id = id;
        this.name = name;
        this.appType = appType;
        this.version = version;
        this.size = size;
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApplicationDTO)) return false;
        ApplicationDTO that = (ApplicationDTO) o;
        return id == that.id && Double.compare(version, that.version) == 0 && Double.compare(size, that.size) == 0 && Objects.equals(name, that.name) && Objects.equals(appType, that.appType) && Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, appType, version, size, companyName);
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
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

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    @Override
    public String toString() {
        return "ApplicationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", appType='" + appType + '\'' +
                ", version=" + version +
                ", size=" + size +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
