package com.xworkz.thing.runner;

import com.xworkz.thing.dto.IplTeamDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplTeamRunner {

    public static void main(String[] args) {

        IplTeamDto iplTeamDto1 = new IplTeamDto("RoyalChallengersBengaluru", 25, "United Spirits", "Happilo", 83.4);
        IplTeamDto iplTeamDto2 = new IplTeamDto("MumbaiIndians", 24, "Reliance Industries", "Slice", 89.7);
        IplTeamDto iplTeamDto3 = new IplTeamDto("ChennaiSuperKings", 22, "India Cements", "Gulf Oil", 91.2);
        IplTeamDto iplTeamDto4 = new IplTeamDto("KolkataKnightRiders", 23, "Red Chillies Entertainment", "MyFab11", 85.6);
        IplTeamDto iplTeamDto5 = new IplTeamDto("DelhiCapitals", 21, "JSW Group", "DP World", 78.3);
        IplTeamDto iplTeamDto6 = new IplTeamDto("RajasthanRoyals", 20, "Emerging Media", "Reliance Jio", 81.7);
        IplTeamDto iplTeamDto7 = new IplTeamDto("SunrisersHyderabad", 24, "Sun TV Network", "Cars24", 79.8);
        IplTeamDto iplTeamDto8 = new IplTeamDto("PunjabKings", 22, "Mohit Burman, Ness Wadia", "EbixCash", 77.9);
        IplTeamDto iplTeamDto9 = new IplTeamDto("LucknowSuperGiants", 23, "RPSG Group", "Cred", 82.5);
        IplTeamDto iplTeamDto10 = new IplTeamDto("GujaratTitans", 23, "CVC Capital Partners", "Ather Energy", 86.1);

        //print all name
        //find all iplDto By Budget
        //find all iplDto by sponsorName
        //find all iplDto by ownerName and sponsorName
        //find all iplDto by teamSize
        //print name and teamSize
        //print name and budget

        Collection<IplTeamDto> coll=new ArrayList<>();
        coll.add(iplTeamDto1);
        coll.add(iplTeamDto2);
        coll.add(iplTeamDto3);
        coll.add(iplTeamDto4);
        coll.add(iplTeamDto5);
        coll.add(iplTeamDto6);
        coll.add(iplTeamDto7);
        coll.add(iplTeamDto8);
        coll.add(iplTeamDto9);
        coll.add(iplTeamDto10);


        Iterator<IplTeamDto> iterator= coll.iterator();
        while(iterator.hasNext())
        {
            IplTeamDto value=iterator.next();
            if(value.getTeamBudget()<80)
            {
                iterator.remove();
                System.out.println("Removed Teams :"+value);
            }
        }
        System.out.println("/////////////////////////////////////////////////////////////////");

        Iterator<IplTeamDto> iterator1= coll.iterator();
        while (iterator1.hasNext())
        {
            IplTeamDto value1=iterator1.next();
            if(value1.getSponsorName().equals("Reliance Jio"))
            {
                iterator1.remove();
                System.out.println("Removed value :"+value1);
            }
        }

        System.out.println("/////////////////////////////////////////////////////////////////");

        Iterator<IplTeamDto> iterator2= coll.iterator();
        while (iterator2.hasNext())
        {
           IplTeamDto value2=iterator2.next();
           if(value2.getTeamSize()<23)
           {
               iterator2.remove();
               System.out.println("Removed Values :"+value2);
           }
        }
        System.out.println("///////////////////////////////////////////////////////////////");

        for(IplTeamDto dto:coll)
        {
            System.out.println("Team Names :"+dto.getName());
        }
        System.out.println("///////////////////////////////////////////////////////////");


        for(IplTeamDto dto:coll)
        {
            if(dto.getTeamBudget()>80)
            {
                System.out.println("Teams budget is greater than 80cr :"+dto.getName()+"\tBudget :"+dto.getTeamBudget());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////");
        for(IplTeamDto dto:coll)
        {
            if(dto.getSponsorName().equals("Happilo"))
            {
                System.out.println(dto);
            }
        }
        System.out.println("///////////////////////////////////////////////////////////");
        for(IplTeamDto dto:coll)
        {
            if(dto.getSponsorName().equals("Happilo") && dto.getOwnerName().equals("United Spirits"))
            {
                System.out.println(dto);
            }
        }

        System.out.println("///////////////////////////////////////////////////////////");
        for(IplTeamDto dto:coll)
        {
            if(dto.getTeamSize()>=24)
            {
                System.out.println(dto);
            }
        }
        System.out.println("///////////////////////////////////////////////////////////");
        for(IplTeamDto dto:coll)
        {
            System.out.println("Team Name :"+dto.getName()+" Number of Players :"+dto.getTeamSize());
        }

        System.out.println("///////////////////////////////////////////////////////////");
        for(IplTeamDto dto:coll)
        {
            System.out.println("Team Name :"+dto.getName()+" Team Budget :"+dto.getTeamBudget());
        }



    }
}
