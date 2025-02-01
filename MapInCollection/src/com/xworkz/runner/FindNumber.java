package com.xworkz.runner;

import java.util.HashMap;
import java.util.Map;

public class FindNumber {

    public static void main(String[] args) {

        int[] arr={1,2,2,3,4,5,5,1,2,3,4,5};
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;



        for(int i=0;i<arr.length;i++)
        {
            if(1==i)
                count1++;

            if(2==i)
                count2++;

            if(3==i)
                count3++;

            if(4==i)
                count4++;

            if (5==i)
                count5++;
        }




    }
}
