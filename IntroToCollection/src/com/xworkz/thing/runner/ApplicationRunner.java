package com.xworkz.thing.runner;

import com.xworkz.thing.dto.ApplicationDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicationRunner {
    public static void main(String[] args) {

        ApplicationDTO app1 = new ApplicationDTO(01, "Motilal Oswal", "Finance", 4.3, 52.3, "Motilal&co");
        ApplicationDTO app2 = new ApplicationDTO(02, "Zerodha", "Stock Trading", 4.7, 28.6, "Rainmatter");
        ApplicationDTO app3 = new ApplicationDTO(03, "Byju's", "Education", 4.2, 115.4, "Think & Learn Pvt Ltd");
        ApplicationDTO app4 = new ApplicationDTO(04, "Tata Neu", "E-commerce", 4.0, 85.3, "Tata Digital");
        ApplicationDTO app5 = new ApplicationDTO(05, "Cred", "Finance", 4.8, 45.1, "Dreamplug Technologies");
        ApplicationDTO app6 = new ApplicationDTO(06, "Flipkart", "E-commerce", 4.5, 97.8, "Walmart");
        ApplicationDTO app7 = new ApplicationDTO(07, "Swiggy", "Food Delivery", 4.4, 120.5, "Bundl Technologies");
        ApplicationDTO app8 = new ApplicationDTO(8, "Ola", "Transportation", 4.1, 72.4, "ANI Technologies");
        ApplicationDTO app9 = new ApplicationDTO(9, "Paytm", "Finance", 4.6, 56.9, "One97 Communications");
        ApplicationDTO app10 = new ApplicationDTO(10, "BigBasket", "E-commerce", 4.3, 64.2, "Innovative Retail Concepts");
        ApplicationDTO app11 = new ApplicationDTO(11, "Dunzo", "Delivery Service", 4.2, 43.5, "Dunzo Digital");
        ApplicationDTO app12 = new ApplicationDTO(12, "Unacademy", "Education", 4.0, 78.6, "Sorting Hat Technologies");
        ApplicationDTO app13 = new ApplicationDTO(13, "Nykaa", "E-commerce", 4.7, 85.0, "FSN E-Commerce Ventures");
        ApplicationDTO app14 = new ApplicationDTO(14, "Urban Company", "Services", 4.5, 50.7, "UrbanClap Technologies");
        ApplicationDTO app15 = new ApplicationDTO(15, "PolicyBazaar", "Finance", 4.3, 60.3, "EtechAces Marketing");
        ApplicationDTO app16 = new ApplicationDTO(16, "Zomato", "Food Delivery", 4.2, 110.8, "Zomato Ltd");
        ApplicationDTO app17 = new ApplicationDTO(17, "Zoomcar", "Transportation", 4.1, 38.2, "Zoomcar India");
        ApplicationDTO app18 = new ApplicationDTO(18, "Lenskart", "Retail", 4.4, 52.1, "Lenskart Solutions");
        ApplicationDTO app19 = new ApplicationDTO(19, "FreshMenu", "Food Delivery", 4.0, 34.6, "FoodVista India");
        ApplicationDTO app20 = new ApplicationDTO(20, "Groww", "Finance", 4.7, 48.3, "Nextbillion Technology");
        ApplicationDTO app21 = new ApplicationDTO(21, "PharmEasy", "Healthcare", 4.3, 58.2, "Axelia Solutions");

        Collection<ApplicationDTO> coll=new ArrayList<>();
        coll.add(app1);
        coll.add(app2);
        coll.add(app3);
        coll.add(app4);
        coll.add(app5);
        coll.add(app6);
        coll.add(app7);
        coll.add(app8);
        coll.add(app9);
        coll.add(app10);
        coll.add(app11);
        coll.add(app12);
        coll.add(app13);
        coll.add(app14);
        coll.add(app15);
        coll.add(app16);
        coll.add(app17);
        coll.add(app18);
        coll.add(app19);
        coll.add(app20);


        for(ApplicationDTO dto:coll)
        {
            System.out.println("Application Name :"+dto.getName()+"-- Application Company Name :"+dto.getCompanyName());
        }

        System.out.println("===================================================================================");


        for(ApplicationDTO dto:coll)
        {
            System.out.println("Application Name :"+dto.getName()+"-- Application version :"+dto.getVersion()+"/Application size :"+dto.getSize());
        }

        System.out.println("===================================================================================");

        for(ApplicationDTO dto:coll)
        {
            if (dto.getAppType().equals("E-commerce")) {
                System.out.println(dto);
            }
        }
    }
}
