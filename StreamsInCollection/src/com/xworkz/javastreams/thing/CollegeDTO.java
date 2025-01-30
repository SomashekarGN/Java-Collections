package com.xworkz.javastreams.thing;

import java.io.Serializable;

public class CollegeDTO implements Serializable,Comparable<CollegeDTO> {


    String collegeName;

    public CollegeDTO()
    {

    }
    public CollegeDTO(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "CollegeDTO{" +
                "collegeName='" + collegeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
            if(obj instanceof CollegeDTO) {
                CollegeDTO casted = (CollegeDTO) obj;
                if(casted.collegeName.equals(this.collegeName))
                    return true;
            }
        return false;
    }



    @Override
    public int compareTo(CollegeDTO collegeDTO) {
        return collegeDTO.collegeName.compareTo(this.collegeName);
    }
}
