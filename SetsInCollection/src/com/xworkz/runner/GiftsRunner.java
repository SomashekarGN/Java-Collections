package com.xworkz.runner;

import com.xworkz.things.GiftDTO;

import java.util.HashSet;
import java.util.Set;

public class GiftsRunner {

    public static void main(String[] args) {

        GiftDTO gift1 = new GiftDTO(1, "Teddy Bear", 1200.50, "Ravi", "Priya");
        GiftDTO gift2 = new GiftDTO(2, "Flowers", 500.00, "Ananya", "Karthik");
        GiftDTO gift3 = new GiftDTO(3, "Chocolates", 350.75, "Meera", "Arjun");
        GiftDTO gift4 = new GiftDTO(4, "Watch", 2500.00, "Rajesh", "Nidhi");
        GiftDTO gift5 = new GiftDTO(5, "Perfume", 1500.00, "Sanjay", "Pooja");
        GiftDTO gift6 = new GiftDTO(6, "Book", 400.00, "Divya", "Aman");
        GiftDTO gift7 = new GiftDTO(7, "Necklace", 7000.00, "Vikram", "Riya");
        GiftDTO gift8 = new GiftDTO(8, "Gift Card", 2000.00, "Neha", "Akshay");
        GiftDTO gift9 = new GiftDTO(3, "Chocolates", 350.75, "Meera", "Arjun");
        GiftDTO gift10 = new GiftDTO(1, "Teddy Bear", 1200.50, "Ravi", "Priya");


        Set<GiftDTO> set=new HashSet<>();
        set.add(gift1);
        set.add(gift2);
        set.add(gift3);
        set.add(gift4);
        set.add(gift5);
        set.add(gift6);
        set.add(gift7);
        set.add(gift8);
        set.add(gift9);
        set.add(gift10);


        System.out.println("=============Displaying Each Elements with No Duplicates===============");
        set.forEach(System.out::println);

        System.out.println("=============Sorting The Elements===============");
        set.stream().sorted((e1,e2)->Double.compare(e1.getCost(),e2.getCost()))
                .forEach(System.out::println);

        System.out.println("=============Getting Only Id's===============");
        set.stream().map(e->e.getId())
                .forEach(System.out::println);

        System.out.println("=============Getting Only From in asc===============");
        set.stream().sorted((e1,e2)->e1.getFrom().compareTo(e2.getFrom()))
                .map(e->e.getFrom())
                .forEach(System.out::println);


    }
}
