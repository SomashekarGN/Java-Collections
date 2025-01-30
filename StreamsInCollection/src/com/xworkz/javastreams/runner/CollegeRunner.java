package com.xworkz.javastreams.runner;

import com.xworkz.javastreams.thing.CollegeDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CollegeRunner {
    public static void main(String[] args) {

        CollegeDTO collegeDTO1=new CollegeDTO("Angadi Institute Of Technology & Management");
        CollegeDTO collegeDTO2 = new CollegeDTO("RV College of Engineering");
        CollegeDTO collegeDTO3 = new CollegeDTO("BMS College of Engineering");
        CollegeDTO collegeDTO4 = new CollegeDTO("PES University");
        CollegeDTO collegeDTO5 = new CollegeDTO("Manipal Institute of Technology");
        CollegeDTO collegeDTO6 = new CollegeDTO("MS Ramaiah Institute of Technology");
        CollegeDTO collegeDTO7 = new CollegeDTO("Dayananda Sagar College of Engineering");
        CollegeDTO collegeDTO8 = new CollegeDTO("Nitte Meenakshi Institute of Technology");
        CollegeDTO collegeDTO9 = new CollegeDTO("Acharya Institute of Technology");
        CollegeDTO collegeDTO10 = new CollegeDTO("Siddaganga Institute of Technology");
        CollegeDTO collegeDTO11 = new CollegeDTO("Jain University");
        CollegeDTO collegeDTO12 = new CollegeDTO("Reva University");
        CollegeDTO collegeDTO13 = new CollegeDTO("Alliance University");
        CollegeDTO collegeDTO14 = new CollegeDTO("Christ University");
        CollegeDTO collegeDTO15 = new CollegeDTO("KLE Technological University");
        CollegeDTO collegeDTO16 = new CollegeDTO("NMAM Institute of Technology, Nitte");
        CollegeDTO collegeDTO17 = new CollegeDTO("New Horizon College of Engineering");
        CollegeDTO collegeDTO18 = new CollegeDTO("CMR Institute of Technology");
        CollegeDTO collegeDTO19 = new CollegeDTO("RNS Institute of Technology");
        CollegeDTO collegeDTO20 = new CollegeDTO("Oxford College of Engineering");

        Collection<CollegeDTO> collection=new ArrayList<>();
        collection.add(collegeDTO1);
        collection.add(collegeDTO2);
        collection.add(collegeDTO3);
        collection.add(collegeDTO4);
        collection.add(collegeDTO5);
        collection.add(collegeDTO6);
        collection.add(collegeDTO7);
        collection.add(collegeDTO8);
        collection.add(collegeDTO9);
        collection.add(collegeDTO10);
        collection.add(collegeDTO11);
        collection.add(collegeDTO12);
        collection.add(collegeDTO13);
        collection.add(collegeDTO14);
        collection.add(collegeDTO15);
        collection.add(collegeDTO16);
        collection.add(collegeDTO17);
        collection.add(collegeDTO18);
        collection.add(collegeDTO19);
        collection.add(collegeDTO20);


        collection.stream()
                .filter(e->e.getCollegeName().startsWith("A"))
                .forEach(e-> System.out.println("College Names That Start With A :"+e));

        System.out.println("===============Upper Case=================");
        collection.stream()
                .map(e->e.getCollegeName().toUpperCase())
                .forEach(e-> System.out.println(e));

        System.out.println("===============Lower Case=================");
        collection.stream()
                .map(e->e.getCollegeName().toLowerCase())
                .forEach(e-> System.out.println(e));

        System.out.println("===============Sort using Comparator=================");
        collection.stream()
                .sorted((e1,e2)->e2.getCollegeName().compareTo(e1.getCollegeName()))
                .forEach(e-> System.out.println(e));

        System.out.println("===============Sort using Comparable=================");
        collection.stream()
                .sorted()
                .forEach(e-> System.out.println(e));

    }
}
