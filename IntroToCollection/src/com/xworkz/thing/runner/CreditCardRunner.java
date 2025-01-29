package com.xworkz.thing.runner;

import com.xworkz.thing.dto.CreditCardDto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CreditCardRunner {
    public static void main(String[] args) {


        CreditCardDto cardDto1 = new CreditCardDto("RuPay",4235551655527771L, LocalDate.of(2025,06,13),955 );
        CreditCardDto cardDto2 = new CreditCardDto("MasterCard", 5234123498751234L, LocalDate.of(2026, 6, 15), 856);
        CreditCardDto cardDto3 = new CreditCardDto("Visa", 378282246310005L, LocalDate.of(2024, 9, 20), 342);
        CreditCardDto cardDto4 = new CreditCardDto("MasterCard", 6011556448578945L, LocalDate.of(2028, 12, 31), 765);
        CreditCardDto cardDto5 = new CreditCardDto("RuPay", 3530111333300000L, LocalDate.of(2023, 7, 5), 123);
        CreditCardDto cardDto6 = new CreditCardDto("MasterCard", 30569309025904L, LocalDate.of(2027, 10, 10), 678);
        CreditCardDto cardDto7 = new CreditCardDto("Visa", 3566002020360505L, LocalDate.of(2029, 2, 28), 890);
        CreditCardDto cardDto8 = new CreditCardDto("RuPay", 6200000000000005L, LocalDate.of(2030, 3, 15), 451);
        CreditCardDto cardDto9 = new CreditCardDto("RuPay", 6759649826438453L, LocalDate.of(2025, 8, 18), 298);
        CreditCardDto cardDto10 = new CreditCardDto("Visa", 4235551655527771L, LocalDate.of(2025, 4, 10), 955);

        Collection<CreditCardDto> collection=new ArrayList<>();
        collection.add(cardDto1);
        collection.add(cardDto2);
        collection.add(cardDto3);
        collection.add(cardDto4);
        collection.add(cardDto5);
        collection.add(cardDto6);
        collection.add(cardDto7);
        collection.add(cardDto8);
        collection.add(cardDto9);
        collection.add(cardDto10);

        Iterator<CreditCardDto> iterator= collection.iterator();
        while(iterator.hasNext())
        {
            CreditCardDto value=iterator.next();
            if(value.getExpDate().getYear()<2027)
                iterator.remove();
            System.out.println("Removed values"+value);
        }
        System.out.println("/////////////////////////////////////////////////////");

//        Iterator<CreditCardDto> iterator1= collection.iterator();
//        while(iterator1.hasNext())
//        {
//            CreditCardDto value=iterator1.next();
//            System.out.println("Removed values"+value);
//        }

        for(CreditCardDto dto:collection)
        {
            if(dto.getExpDate().getYear()>2026)
                System.out.println(dto);
        }

        System.out.println("////////////////////////////////////////////////////////");

        for(CreditCardDto dto:collection)
        {
            if(dto.getType().equals("Visa"))
                System.out.println(dto);
        }

        System.out.println("////////////////////////////////////////////////////////");

        for(CreditCardDto dto:collection)
        {
            if(dto.getType().equals("MasterCard"))
                System.out.println(dto);
        }

        System.out.println("////////////////////////////////////////////////////////");

        for(CreditCardDto dto:collection)
        {
            if(dto.getType().equals("RuPay"))
                System.out.println(dto);
        }

        System.out.println("////////////////////////////////////////////////////////");

        for(CreditCardDto dto:collection)
        {
                System.out.println("CVV :"+dto.getCvv());
        }

        System.out.println("////////////////////////////////////////////////////////");

        for(CreditCardDto dto:collection)
        {
            System.out.println("Credit Card No's :"+dto.getCardNumber());
        }

        System.out.println("////////////////////////////////////////////////////////");

    }
}
