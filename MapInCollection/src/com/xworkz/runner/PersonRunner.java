package com.xworkz.runner;

import com.xworkz.things.PersonDTO;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {

    public static void main(String[] args) {

        PersonDTO personDTO1=new PersonDTO("Somashekar GN",9743065930L);
        PersonDTO personDTO2=new PersonDTO("Manoj Kumar",993475782650L);
        PersonDTO personDTO3=new PersonDTO("Chetana S",9740659650L);
        PersonDTO personDTO4=new PersonDTO("Venu Gopal",7353486135L);
        PersonDTO personDTO5=new PersonDTO("Deekshith",63621509823L);
        PersonDTO personDTO6=new PersonDTO("Lavanya",9654398972L);
        PersonDTO personDTO7=new PersonDTO("Bala Gopal Krishna",6136457283L);
        PersonDTO personDTO8=new PersonDTO("Nikhil Kumar Swamy",7544398976L);
        PersonDTO personDTO9=new PersonDTO("Sandeep Hardy",8971546263L);
        PersonDTO personDTO10=new PersonDTO("Somashekar GN",7375436521L);

        Map<PersonDTO,PersonDTO> map=new HashMap<>();
        map.put(personDTO1,personDTO2);

        map.forEach((k,v)-> System.out.println(k+":"+v));

    }
}
