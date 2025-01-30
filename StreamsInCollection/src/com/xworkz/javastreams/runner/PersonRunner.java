package com.xworkz.javastreams.runner;

import com.xworkz.javastreams.thing.AddressDTO;
import com.xworkz.javastreams.thing.PersonDTO;

import java.util.ArrayList;
import java.util.Collection;

public class PersonRunner {
    public static void main(String[] args) {


        AddressDTO address1 = new AddressDTO("Dr.Rajkumar","6Th B cross","RajajiNagar");
        AddressDTO address2 = new AddressDTO("Mahatma Gandhi Road", "4th Main", "RajajiNagar");
        AddressDTO address3 = new AddressDTO("Kempegowda Road", "2nd Cross", "Koramangala");
        AddressDTO address4 = new AddressDTO("Indiranagar Road", "8th A Main", "RajajiNagar");
        AddressDTO address5 = new AddressDTO("Bannerghatta Road", "5th Block", "Jayanagar");
        AddressDTO address6 = new AddressDTO("Church Street", "3rd Avenue", "Koramangala");
        AddressDTO address7 = new AddressDTO("Bellary Road", "1st Sector", "Jayanagar");
        AddressDTO address8 = new AddressDTO("Residency Road", "9th Cross", "Indiranagar");
        AddressDTO address9 = new AddressDTO("Brigade Road", "7th D Main", "Whitefield");
        AddressDTO address10 = new AddressDTO("Lalbagh Road", "10th Block", "Indiranagar");



        PersonDTO personDTO1 = new PersonDTO("Somashekar GN","gnsomashekar1998@gmail.com",9743065930L,address1);
        PersonDTO personDTO2 = new PersonDTO("Anusha Rao", "anusha.rao123@gmail.com", 9845032145L, address2);
        PersonDTO personDTO3 = new PersonDTO("Rajesh Kumar", "rajesh.kumar90@yahoo.com", 9741234567L, address3);
        PersonDTO personDTO4 = new PersonDTO("Priya Sharma", "priya.sharma88@hotmail.com", 9987654321L, address4);
        PersonDTO personDTO5 = new PersonDTO("Vikram Singh", "vikram.singh001@gmail.com", 9876543210L, address5);
        PersonDTO personDTO6 = new PersonDTO("Divya Nair", "divya.nair23@gmail.com", 9742056789L, address6);
        PersonDTO personDTO7 = new PersonDTO("Sandeep Reddy", "sandeep.reddy78@gmail.com", 9886453098L, address7);
        PersonDTO personDTO8 = new PersonDTO("Meera Iyer", "meera.iyer45@yahoo.com", 9751238906L, address8);
        PersonDTO personDTO9 = new PersonDTO("Arjun Das", "arjun.das99@hotmail.com", 9945672301L, address9);
        PersonDTO personDTO10 = new PersonDTO("Neha Gupta", "neha.gupta56@gmail.com", 9732456781L, address10);

        Collection<PersonDTO> collection=new ArrayList<>();
        collection.add(personDTO1);
        collection.add(personDTO2);
        collection.add(personDTO3);
        collection.add(personDTO4);
        collection.add(personDTO5);
        collection.add(personDTO6);
        collection.add(personDTO7);
        collection.add(personDTO8);
        collection.add(personDTO9);
        collection.add(personDTO10);

        System.out.println("===========Name starts with S==========");
        collection.stream()
                .filter(e->e.getName().startsWith("S"))
                .forEach(e-> System.out.println(e));


        System.out.println("===========All person by Area==========");
        collection.stream()
                .filter(e->e.getAddress().getArea().equals("RajajiNagar"))
                .forEach(e-> System.out.println(e));

        System.out.println("=========== Get Address Sort Area asc==========");
        collection.stream()
                .map(e->e.getAddress())
                        .sorted((e1,e2)->e1.getArea().compareTo(e2.getArea()))
                .forEach(e-> System.out.println(e));

        System.out.println("===========Sort person by Area==========");
        collection.stream()
                .sorted((e1,e2)->e1.getAddress().getArea().compareTo(e2.getAddress().getArea()))
                .forEach(e-> System.out.println(e));

        System.out.println("===========Filter by Street==========");
        collection.stream()
                .filter(e->e.getAddress().getStreet().equals("Church Street"))
                .forEach(e-> System.out.println(e));

        System.out.println("===========Filter by email Street & area==========");
        collection.stream()
                .filter(e->e.getEmail().equals("gnsomashekar1998@gmail.com") && e.getAddress().getStreet().equals("Dr.Rajkumar") && e.getAddress().getArea().equals("RajajiNagar"))
                .forEach(e-> System.out.println(e));

        System.out.println("===========Sort by Area & Name==========");
        collection.stream()
                .sorted((e1,e2)->(e1.getAddress().getArea().compareTo(e2.getAddress().getArea())))
                .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
                .forEach(e-> System.out.println(e));

        System.out.println("===========Collect only Street==========");
        collection.stream()
                .map(e->e.getAddress().getArea())
                .forEach(e-> System.out.println(e));

        System.out.println("===========Collect only Area==========");
        collection.stream()
                .map(e->e.getAddress().getStreet())
                .forEach(e-> System.out.println(e));


    }
}
