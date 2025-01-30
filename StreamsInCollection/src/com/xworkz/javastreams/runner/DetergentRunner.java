package com.xworkz.javastreams.runner;

import com.xworkz.javastreams.thing.DetergentDTO;

import java.util.ArrayList;
import java.util.Collection;

public class DetergentRunner {
    public static void main(String[] args) {
        DetergentDTO detergentDTO1=new DetergentDTO();
        detergentDTO1.setBrand("Surf Excel");
        detergentDTO1.setdiscount(5);
        detergentDTO1.setQuantity(5);
        detergentDTO1.setSoldBy("Bushan Provisions");
        detergentDTO1.setPricePerKg(140);

        DetergentDTO detergentDTO2 = new DetergentDTO();
        detergentDTO2.setBrand("Ariel");
        detergentDTO2.setdiscount(15);
        detergentDTO2.setQuantity(3);
        detergentDTO2.setSoldBy("Deepak Stores");
        detergentDTO2.setPricePerKg(180);

        DetergentDTO detergentDTO3 = new DetergentDTO();
        detergentDTO3.setBrand("Tide");
        detergentDTO3.setdiscount(7);
        detergentDTO3.setQuantity(4);
        detergentDTO3.setSoldBy("Sai Supermarket");
        detergentDTO3.setPricePerKg(100);

        DetergentDTO detergentDTO4 = new DetergentDTO();
        detergentDTO4.setBrand("Rin");
        detergentDTO4.setdiscount(10);
        detergentDTO4.setQuantity(6);
        detergentDTO4.setSoldBy("Navya Mart");
        detergentDTO4.setPricePerKg(70);

        DetergentDTO detergentDTO5 = new DetergentDTO();
        detergentDTO5.setBrand("Wheel");
        detergentDTO5.setdiscount(20);
        detergentDTO5.setQuantity(8);
        detergentDTO5.setSoldBy("Green Valley Stores");
        detergentDTO5.setPricePerKg(50);

        DetergentDTO detergentDTO6 = new DetergentDTO();
        detergentDTO6.setBrand("Nirma");
        detergentDTO6.setdiscount(18);
        detergentDTO6.setQuantity(7);
        detergentDTO6.setSoldBy("Maya Mart");
        detergentDTO6.setPricePerKg(45);

        DetergentDTO detergentDTO7 = new DetergentDTO();
        detergentDTO7.setBrand("Surf Excel");
        detergentDTO7.setdiscount(15);
        detergentDTO7.setQuantity(2);
        detergentDTO7.setSoldBy("Vijay Traders");
        detergentDTO7.setPricePerKg(320);

        DetergentDTO detergentDTO8 = new DetergentDTO();
        detergentDTO8.setBrand("Sunlight");
        detergentDTO8.setdiscount(5);
        detergentDTO8.setQuantity(5);
        detergentDTO8.setSoldBy("Modern Bazaar");
        detergentDTO8.setPricePerKg(90);

        DetergentDTO detergentDTO9 = new DetergentDTO();
        detergentDTO9.setBrand("Henko");
        detergentDTO9.setdiscount(7);
        detergentDTO9.setQuantity(3);
        detergentDTO9.setSoldBy("Eco Stores");
        detergentDTO9.setPricePerKg(250);

        DetergentDTO detergentDTO10 = new DetergentDTO();
        detergentDTO10.setBrand("Ghadi");
        detergentDTO10.setdiscount(9);
        detergentDTO10.setQuantity(10);
        detergentDTO10.setSoldBy("Pioneer Mart");
        detergentDTO10.setPricePerKg(35);


        Collection<DetergentDTO> collection=new ArrayList<>();
        collection.add(detergentDTO1);
        collection.add(detergentDTO2);
        collection.add(detergentDTO3);
        collection.add(detergentDTO4);
        collection.add(detergentDTO5);
        collection.add(detergentDTO6);
        collection.add(detergentDTO7);
        collection.add(detergentDTO8);
        collection.add(detergentDTO9);
        collection.add(detergentDTO10);

        collection.stream()
                .filter(dto->dto.getPricePerKg()<100)
                .forEach(dto-> System.out.println(dto));

        System.out.println("/////////////////////////////////////////////////////");

        collection.stream()
                .filter(dto->dto.getQuantity()<5)
                .forEach(dto-> System.out.println(dto));

        System.out.println("/////////////////////////////////////////////////////");

        collection.stream()
                .filter(dto->dto.getdiscount()>=5 && dto.getBrand().equals("Surf Excel"))
                .forEach(dto-> System.out.println(dto));

        System.out.println("/////////////////////////////////////////////////////");

        collection.stream()
                .filter(dto->dto.getSoldBy().equals("Vijay Traders") && dto.getdiscount()>=5 && dto.getBrand().equals("Surf Excel"))
                .forEach(dto-> System.out.println(dto));

        System.out.println("/////////////////////////////////////////////////////");

        collection.stream()
                .sorted()
                .forEach(dto-> System.out.println(dto));

        System.out.println("/////////////////////////////////////////////////////");

        collection.stream()
                .sorted()
                .forEach(dto-> System.out.println(dto));

        System.out.println("/////////////////////////////////////////////////////");

        System.out.println("===========Comparator===============");
        collection.stream()
                .sorted((e1,e2)->e1.getBrand().compareTo(e2.getBrand()))
                .forEach(e-> System.out.println(e));


        System.out.println("===========Map===============");
        collection.stream().filter(e->e.getQuantity()>4)
                .map(e->e.getBrand()+":"+e.getQuantity())
                .forEach(e-> System.out.println(e));

        System.out.println("===========Map===============");
        collection.stream()
                .map(e->e.getBrand()+":"+e.getQuantity())
                .forEach(e-> System.out.println(e));




    }
}
