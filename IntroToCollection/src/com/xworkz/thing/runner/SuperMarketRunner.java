package com.xworkz.thing.runner;

import com.xworkz.thing.dto.SuperMarketDTO;

import java.util.ArrayList;
import java.util.Collection;

public class SuperMarketRunner {
    public static void main(String[] args) {

        SuperMarketDTO sd1 = new SuperMarketDTO("More", "Rajajinagar", 6, "Chandru");
        SuperMarketDTO sd2 = new SuperMarketDTO("Big Bazaar", "Whitefield", 12, "Ravi");
        SuperMarketDTO sd3 = new SuperMarketDTO("DMart", "Koramangala", 15, "Anita");
        SuperMarketDTO sd4 = new SuperMarketDTO("Reliance Fresh", "Indiranagar", 8, "Kumar");
        SuperMarketDTO sd5 = new SuperMarketDTO("Spar", "Jayanagar", 10, "Lakshmi");
        SuperMarketDTO sd6 = new SuperMarketDTO("Star Bazaar", "HSR Layout", 14, "Ramesh");
        SuperMarketDTO sd7 = new SuperMarketDTO("Nilgiris", "Yeshwanthpur", 5, "Gauri");
        SuperMarketDTO sd8 = new SuperMarketDTO("Nature's Basket", "MG Road", 7, "Priya");
        SuperMarketDTO sd9 = new SuperMarketDTO("Spencer's", "Malleshwaram", 9, "Suresh");
        SuperMarketDTO sd10 = new SuperMarketDTO("HyperCity", "Bellandur", 20, "Meena");
        SuperMarketDTO sd11 = new SuperMarketDTO("More", "Hebbal", 8, "Rajesh");
        SuperMarketDTO sd12 = new SuperMarketDTO("Big Bazaar", "Bannerghatta", 13, "Deepa");
        SuperMarketDTO sd13 = new SuperMarketDTO("DMart", "Electronic City", 16, "Mohan");
        SuperMarketDTO sd14 = new SuperMarketDTO("Reliance Fresh", "Marathahalli", 10, "Anand");
        SuperMarketDTO sd15 = new SuperMarketDTO("Spar", "RT Nagar", 9, "Sunitha");
        SuperMarketDTO sd16 = new SuperMarketDTO("Star Bazaar", "Banashankari", 18, "Shankar");
        SuperMarketDTO sd17 = new SuperMarketDTO("Nilgiris", "Kengeri", 6, "Usha");
        SuperMarketDTO sd18 = new SuperMarketDTO("Nature's Basket", "JP Nagar", 8, "Manoj");
        SuperMarketDTO sd19 = new SuperMarketDTO("Spencer's", "Vijayanagar", 7, "Harish");
        SuperMarketDTO sd20 = new SuperMarketDTO("HyperCity", "Basavanagudi", 12, "Savitha");
        SuperMarketDTO sd21 = new SuperMarketDTO("More", "Hennur", 6, "Narayan");
        SuperMarketDTO sd22 = new SuperMarketDTO("Big Bazaar", "BTM Layout", 11, "Kavitha");
        SuperMarketDTO sd23 = new SuperMarketDTO("DMart", "Kalyan Nagar", 14, "Gopal");
        SuperMarketDTO sd24 = new SuperMarketDTO("Reliance Fresh", "Ulsoor", 8, "Swathi");
        SuperMarketDTO sd25 = new SuperMarketDTO("Spar", "KR Puram", 13, "Ajay");
        SuperMarketDTO sd26 = new SuperMarketDTO("Star Bazaar", "Varthur", 15, "Deepak");
        SuperMarketDTO sd27 = new SuperMarketDTO("Nilgiris", "Nagawara", 5, "Sneha");
        SuperMarketDTO sd28 = new SuperMarketDTO("Nature's Basket", "Richmond Town", 6, "Ganesh");
        SuperMarketDTO sd29 = new SuperMarketDTO("Spencer's", "Frazer Town", 8, "Kiran");
        SuperMarketDTO sd30 = new SuperMarketDTO("HyperCity", "Sadashivanagar", 19, "Rekha");
        SuperMarketDTO sd31 = new SuperMarketDTO("More", "Jalahalli", 7, "Arjun");
        SuperMarketDTO sd32 = new SuperMarketDTO("Big Bazaar", "Mahadevapura", 17, "Leela");
        SuperMarketDTO sd33 = new SuperMarketDTO("DMart", "Peenya", 9, "Vikram");
        SuperMarketDTO sd34 = new SuperMarketDTO("Reliance Fresh", "Lalbagh", 8, "Asha");
        SuperMarketDTO sd35 = new SuperMarketDTO("Spar", "Shivajinagar", 12, "Vijay");
        SuperMarketDTO sd36 = new SuperMarketDTO("Star Bazaar", "Kanakapura", 10, "Divya");
        SuperMarketDTO sd37 = new SuperMarketDTO("Nilgiris", "Basaveshwara Nagar", 6, "Ashok");
        SuperMarketDTO sd38 = new SuperMarketDTO("Nature's Basket", "Brookefield", 7, "Kamal");
        SuperMarketDTO sd39 = new SuperMarketDTO("Spencer's", "Cooke Town", 11, "Rita");
        SuperMarketDTO sd40 = new SuperMarketDTO("HyperCity", "Jigani", 20, "Vimal");
        SuperMarketDTO sd41 = new SuperMarketDTO("More", "Bommanahalli", 7, "Dinesh");
        SuperMarketDTO sd42 = new SuperMarketDTO("Big Bazaar", "Domlur", 10, "Sharada");
        SuperMarketDTO sd43 = new SuperMarketDTO("DMart", "Hosur Road", 14, "Pavan");
        SuperMarketDTO sd44 = new SuperMarketDTO("Reliance Fresh", "Sahakar Nagar", 9, "Sheela");
        SuperMarketDTO sd45 = new SuperMarketDTO("Spar", "Nagamangala", 13, "Raghav");
        SuperMarketDTO sd46 = new SuperMarketDTO("Star Bazaar", "Jeevanbheema Nagar", 16, "Keshav");
        SuperMarketDTO sd47 = new SuperMarketDTO("Nilgiris", "Banaswadi", 5, "Gauri");
        SuperMarketDTO sd48 = new SuperMarketDTO("Nature's Basket", "Cunningham Road", 6, "Aditya");
        SuperMarketDTO sd49 = new SuperMarketDTO("Spencer's", "HBR Layout", 8, "Anjali");
        SuperMarketDTO sd50 = new SuperMarketDTO("HyperCity", "Sarjapur", 18, "Tejas");
        SuperMarketDTO sd51 = new SuperMarketDTO("Reliance Fresh", "RT Nagar", 10, "Anil");
        SuperMarketDTO sd52 = new SuperMarketDTO("Big Bazaar", "MG Road", 15, "Neha");
        SuperMarketDTO sd53 = new SuperMarketDTO("DMart", "Rajajinagar", 8, "Ramesh");
        SuperMarketDTO sd54 = new SuperMarketDTO("Spar", "HSR Layout", 12, "Megha");
        SuperMarketDTO sd55 = new SuperMarketDTO("Star Bazaar", "Electronic City", 14, "Sunil");
        SuperMarketDTO sd56 = new SuperMarketDTO("More", "JP Nagar", 6, "Priyanka");
        SuperMarketDTO sd57 = new SuperMarketDTO("Nature's Basket", "Jayanagar", 9, "Ravi");
        SuperMarketDTO sd58 = new SuperMarketDTO("Nilgiris", "Whitefield", 7, "Swetha");
        SuperMarketDTO sd59 = new SuperMarketDTO("HyperCity", "Indiranagar", 20, "Vikash");
        SuperMarketDTO sd60 = new SuperMarketDTO("Spencer's", "Malleshwaram", 13, "Geetha");
        SuperMarketDTO sd61 = new SuperMarketDTO("More", "Basavanagudi", 11, "Karthik");
        SuperMarketDTO sd62 = new SuperMarketDTO("Big Bazaar", "Koramangala", 16, "Sanjay");
        SuperMarketDTO sd63 = new SuperMarketDTO("DMart", "Hebbal", 12, "Nandini");
        SuperMarketDTO sd64 = new SuperMarketDTO("Spar", "Bellandur", 14, "Kiran");
        SuperMarketDTO sd65 = new SuperMarketDTO("Star Bazaar", "Banashankari", 18, "Meena");
        SuperMarketDTO sd66 = new SuperMarketDTO("Nature's Basket", "Kalyan Nagar", 6, "Rajesh");
        SuperMarketDTO sd67 = new SuperMarketDTO("Nilgiris", "Frazer Town", 9, "Amit");
        SuperMarketDTO sd68 = new SuperMarketDTO("HyperCity", "Lalbagh", 15, "Deepa");
        SuperMarketDTO sd69 = new SuperMarketDTO("Spencer's", "Vijayanagar", 7, "Harish");
        SuperMarketDTO sd70 = new SuperMarketDTO("Reliance Fresh", "Marathahalli", 10, "Usha");
        SuperMarketDTO sd71 = new SuperMarketDTO("More", "RT Nagar", 5, "Manoj");
        SuperMarketDTO sd72 = new SuperMarketDTO("Big Bazaar", "Brookefield", 13, "Rekha");
        SuperMarketDTO sd73 = new SuperMarketDTO("DMart", "Nagawara", 11, "Sneha");
        SuperMarketDTO sd74 = new SuperMarketDTO("Spar", "Cooke Town", 6, "Ganesh");
        SuperMarketDTO sd75 = new SuperMarketDTO("Star Bazaar", "Domlur", 19, "Pooja");
        SuperMarketDTO sd76 = new SuperMarketDTO("Nature's Basket", "Yeshwanthpur", 8, "Kamal");
        SuperMarketDTO sd77 = new SuperMarketDTO("Nilgiris", "Peenya", 7, "Suresh");
        SuperMarketDTO sd78 = new SuperMarketDTO("HyperCity", "Mahadevapura", 17, "Arjun");
        SuperMarketDTO sd79 = new SuperMarketDTO("Spencer's", "Hosur Road", 14, "Meera");
        SuperMarketDTO sd80 = new SuperMarketDTO("Reliance Fresh", "Sarjapur", 10, "Prakash");
        SuperMarketDTO sd81 = new SuperMarketDTO("More", "HBR Layout", 6, "Dinesh");
        SuperMarketDTO sd82 = new SuperMarketDTO("Big Bazaar", "BTM Layout", 9, "Sharada");
        SuperMarketDTO sd83 = new SuperMarketDTO("DMart", "Bannerghatta", 15, "Ajay");
        SuperMarketDTO sd84 = new SuperMarketDTO("Spar", "Richmond Town", 12, "Divya");
        SuperMarketDTO sd85 = new SuperMarketDTO("Star Bazaar", "Sadashivanagar", 13, "Ramesh");
        SuperMarketDTO sd86 = new SuperMarketDTO("Nature's Basket", "Hennur", 5, "Kavya");
        SuperMarketDTO sd87 = new SuperMarketDTO("Nilgiris", "KR Puram", 11, "Shankar");
        SuperMarketDTO sd88 = new SuperMarketDTO("HyperCity", "Nagamangala", 16, "Deepak");
        SuperMarketDTO sd89 = new SuperMarketDTO("Spencer's", "Banaswadi", 8, "Keshav");
        SuperMarketDTO sd90 = new SuperMarketDTO("Reliance Fresh", "Jigani", 10, "Kiran");
        SuperMarketDTO sd91 = new SuperMarketDTO("More", "Jeevanbheema Nagar", 6, "Anjali");
        SuperMarketDTO sd92 = new SuperMarketDTO("Big Bazaar", "Kanakapura", 18, "Rajiv");
        SuperMarketDTO sd93 = new SuperMarketDTO("DMart", "Kengeri", 14, "Tejas");
        SuperMarketDTO sd94 = new SuperMarketDTO("Spar", "Varthur", 12, "Aditya");
        SuperMarketDTO sd95 = new SuperMarketDTO("Star Bazaar", "Basaveshwara Nagar", 9, "Gauri");
        SuperMarketDTO sd96 = new SuperMarketDTO("Nature's Basket", "Ulsoor", 6, "Vimal");
        SuperMarketDTO sd97 = new SuperMarketDTO("Nilgiris", "Shivajinagar", 5, "Uday");
        SuperMarketDTO sd98 = new SuperMarketDTO("HyperCity", "Bommanahalli", 20, "Anita");
        SuperMarketDTO sd99 = new SuperMarketDTO("Spencer's", "Kumaraswamy Layout", 11, "Lakshmi");
        SuperMarketDTO sd100 = new SuperMarketDTO("Reliance Fresh", "Doddanekundi", 7, "Vinod");
        SuperMarketDTO sd101 = new SuperMarketDTO("More", "Koramangala", 8, "Ajay");
        SuperMarketDTO sd102 = new SuperMarketDTO("Big Bazaar", "Whitefield", 15, "Meena");
        SuperMarketDTO sd103 = new SuperMarketDTO("DMart", "Jayanagar", 12, "Ramesh");
        SuperMarketDTO sd104 = new SuperMarketDTO("Reliance Fresh", "Indiranagar", 10, "Anitha");
        SuperMarketDTO sd105 = new SuperMarketDTO("Spar", "Rajajinagar", 9, "Vikram");
        SuperMarketDTO sd106 = new SuperMarketDTO("Star Bazaar", "Malleshwaram", 18, "Deepa");
        SuperMarketDTO sd107 = new SuperMarketDTO("Nature's Basket", "Electronic City", 6, "Kavya");
        SuperMarketDTO sd108 = new SuperMarketDTO("Nilgiris", "RT Nagar", 7, "Manoj");
        SuperMarketDTO sd109 = new SuperMarketDTO("HyperCity", "Marathahalli", 20, "Shankar");
        SuperMarketDTO sd110 = new SuperMarketDTO("Spencer's", "HSR Layout", 13, "Sneha");
        SuperMarketDTO sd111 = new SuperMarketDTO("More", "Banashankari", 11, "Rajesh");
        SuperMarketDTO sd112 = new SuperMarketDTO("Big Bazaar", "Basavanagudi", 16, "Anil");
        SuperMarketDTO sd113 = new SuperMarketDTO("DMart", "Hebbal", 14, "Sunil");
        SuperMarketDTO sd114 = new SuperMarketDTO("Reliance Fresh", "Bellandur", 8, "Geetha");
        SuperMarketDTO sd115 = new SuperMarketDTO("Spar", "JP Nagar", 9, "Ravi");
        SuperMarketDTO sd116 = new SuperMarketDTO("Star Bazaar", "Yeshwanthpur", 17, "Lakshmi");
        SuperMarketDTO sd117 = new SuperMarketDTO("Nature's Basket", "Brookefield", 5, "Nandini");
        SuperMarketDTO sd118 = new SuperMarketDTO("Nilgiris", "Nagawara", 7, "Tejas");
        SuperMarketDTO sd119 = new SuperMarketDTO("HyperCity", "Kalyan Nagar", 12, "Dinesh");
        SuperMarketDTO sd120 = new SuperMarketDTO("Spencer's", "Frazer Town", 10, "Aditya");
        SuperMarketDTO sd121 = new SuperMarketDTO("More", "Cunningham Road", 6, "Vimal");
        SuperMarketDTO sd122 = new SuperMarketDTO("Big Bazaar", "Peenya", 14, "Leela");
        SuperMarketDTO sd123 = new SuperMarketDTO("DMart", "Shivajinagar", 15, "Ajith");
        SuperMarketDTO sd124 = new SuperMarketDTO("Reliance Fresh", "Kanakapura", 10, "Divya");
        SuperMarketDTO sd125 = new SuperMarketDTO("Spar", "Lalbagh", 11, "Suresh");
        SuperMarketDTO sd126 = new SuperMarketDTO("Star Bazaar", "Richmond Town", 18, "Priya");
        SuperMarketDTO sd127 = new SuperMarketDTO("Nature's Basket", "BTM Layout", 7, "Ganesh");
        SuperMarketDTO sd128 = new SuperMarketDTO("Nilgiris", "Bannerghatta", 9, "Rekha");
        SuperMarketDTO sd129 = new SuperMarketDTO("HyperCity", "Hennur", 20, "Uday");
        SuperMarketDTO sd130 = new SuperMarketDTO("Spencer's", "Sadashivanagar", 13, "Asha");
        SuperMarketDTO sd131 = new SuperMarketDTO("More", "Doddanekundi", 8, "Arjun");
        SuperMarketDTO sd132 = new SuperMarketDTO("Big Bazaar", "Domlur", 10, "Pooja");
        SuperMarketDTO sd133 = new SuperMarketDTO("DMart", "Hosur Road", 16, "Kiran");
        SuperMarketDTO sd134 = new SuperMarketDTO("Reliance Fresh", "Jigani", 12, "Raghav");
        SuperMarketDTO sd135 = new SuperMarketDTO("Spar", "Cooke Town", 9, "Neha");
        SuperMarketDTO sd136 = new SuperMarketDTO("Star Bazaar", "Bommanahalli", 19, "Vijay");
        SuperMarketDTO sd137 = new SuperMarketDTO("Nature's Basket", "Banaswadi", 6, "Rajiv");
        SuperMarketDTO sd138 = new SuperMarketDTO("Nilgiris", "Vijayanagar", 7, "Deepak");
        SuperMarketDTO sd139 = new SuperMarketDTO("HyperCity", "Sarjapur", 15, "Sharada");
        SuperMarketDTO sd140 = new SuperMarketDTO("Spencer's", "HBR Layout", 11, "Rita");
        SuperMarketDTO sd141 = new SuperMarketDTO("More", "Jalahalli", 5, "Ashok");
        SuperMarketDTO sd142 = new SuperMarketDTO("Big Bazaar", "Mahadevapura", 12, "Leena");
        SuperMarketDTO sd143 = new SuperMarketDTO("DMart", "Basaveshwara Nagar", 14, "Meena");
        SuperMarketDTO sd144 = new SuperMarketDTO("Reliance Fresh", "Ulsoor", 8, "Pavan");
        SuperMarketDTO sd145 = new SuperMarketDTO("Spar", "Nagamangala", 10, "Sneha");
        SuperMarketDTO sd146 = new SuperMarketDTO("Star Bazaar", "Varthur", 18, "Keshav");
        SuperMarketDTO sd147 = new SuperMarketDTO("Nature's Basket", "Kengeri", 6, "Sunitha");
        SuperMarketDTO sd148 = new SuperMarketDTO("Nilgiris", "RT Nagar", 7, "Praveen");
        SuperMarketDTO sd149 = new SuperMarketDTO("HyperCity", "Malleshwaram", 20, "Dilip");
        SuperMarketDTO sd150 = new SuperMarketDTO("Spencer's", "HSR Layout", 13, "Shweta");
        SuperMarketDTO sd151 = new SuperMarketDTO("More", "Whitefield", 9, "Rakesh");
        SuperMarketDTO sd152 = new SuperMarketDTO("Big Bazaar", "Indiranagar", 12, "Anjali");
        SuperMarketDTO sd153 = new SuperMarketDTO("DMart", "Koramangala", 10, "Suresh");
        SuperMarketDTO sd154 = new SuperMarketDTO("Reliance Fresh", "Jayanagar", 8, "Neha");
        SuperMarketDTO sd155 = new SuperMarketDTO("Spar", "Malleshwaram", 14, "Vikas");
        SuperMarketDTO sd156 = new SuperMarketDTO("Star Bazaar", "Electronic City", 18, "Ravi");
        SuperMarketDTO sd157 = new SuperMarketDTO("Nature's Basket", "Banashankari", 7, "Priya");
        SuperMarketDTO sd158 = new SuperMarketDTO("Nilgiris", "Hebbal", 6, "Manoj");
        SuperMarketDTO sd159 = new SuperMarketDTO("HyperCity", "Marathahalli", 16, "Meena");
        SuperMarketDTO sd160 = new SuperMarketDTO("Spencer's", "Basavanagudi", 11, "Karthik");
        SuperMarketDTO sd161 = new SuperMarketDTO("More", "RT Nagar", 8, "Pooja");
        SuperMarketDTO sd162 = new SuperMarketDTO("Big Bazaar", "Bellandur", 9, "Sanjay");
        SuperMarketDTO sd163 = new SuperMarketDTO("DMart", "Rajajinagar", 13, "Kavya");
        SuperMarketDTO sd164 = new SuperMarketDTO("Reliance Fresh", "BTM Layout", 10, "Ramesh");
        SuperMarketDTO sd165 = new SuperMarketDTO("Spar", "Bannerghatta", 12, "Arjun");
        SuperMarketDTO sd166 = new SuperMarketDTO("Star Bazaar", "Kalyan Nagar", 15, "Lakshmi");
        SuperMarketDTO sd167 = new SuperMarketDTO("Nature's Basket", "JP Nagar", 7, "Amit");
        SuperMarketDTO sd168 = new SuperMarketDTO("Nilgiris", "Yeshwanthpur", 5, "Anita");
        SuperMarketDTO sd169 = new SuperMarketDTO("HyperCity", "Brookefield", 18, "Ganesh");
        SuperMarketDTO sd170 = new SuperMarketDTO("Spencer's", "Frazer Town", 11, "Rekha");
        SuperMarketDTO sd171 = new SuperMarketDTO("More", "Cooke Town", 9, "Tejas");
        SuperMarketDTO sd172 = new SuperMarketDTO("Big Bazaar", "Peenya", 8, "Leela");
        SuperMarketDTO sd173 = new SuperMarketDTO("DMart", "Shivajinagar", 14, "Ajay");
        SuperMarketDTO sd174 = new SuperMarketDTO("Reliance Fresh", "Vijayanagar", 10, "Deepa");
        SuperMarketDTO sd175 = new SuperMarketDTO("Spar", "Sadashivanagar", 12, "Harish");
        SuperMarketDTO sd176 = new SuperMarketDTO("Star Bazaar", "Hosur Road", 16, "Dinesh");
        SuperMarketDTO sd177 = new SuperMarketDTO("Nature's Basket", "Sarjapur", 7, "Megha");
        SuperMarketDTO sd178 = new SuperMarketDTO("Nilgiris", "Nagawara", 6, "Shivani");
        SuperMarketDTO sd179 = new SuperMarketDTO("HyperCity", "Richmond Town", 20, "Anil");
        SuperMarketDTO sd180 = new SuperMarketDTO("Spencer's", "Banaswadi", 13, "Kiran");


        Collection<SuperMarketDTO> coll=new ArrayList<>();
        coll.add(sd1);
        coll.add(sd2);
        coll.add(sd3);
        coll.add(sd4);
        coll.add(sd5);
        coll.add(sd6);
        coll.add(sd7);
        coll.add(sd8);
        coll.add(sd9);
        coll.add(sd10);
        coll.add(sd11);
        coll.add(sd12);
        coll.add(sd13);
        coll.add(sd14);
        coll.add(sd15);
        coll.add(sd16);
        coll.add(sd17);
        coll.add(sd18);
        coll.add(sd19);
        coll.add(sd20);
        coll.add(sd21);
        coll.add(sd22);
        coll.add(sd23);
        coll.add(sd24);
        coll.add(sd25);
        coll.add(sd26);
        coll.add(sd27);
        coll.add(sd28);
        coll.add(sd29);
        coll.add(sd30);
        coll.add(sd31);
        coll.add(sd32);
        coll.add(sd33);
        coll.add(sd34);
        coll.add(sd35);
        coll.add(sd36);
        coll.add(sd37);
        coll.add(sd38);
        coll.add(sd39);
        coll.add(sd40);
        coll.add(sd41);
        coll.add(sd42);
        coll.add(sd43);
        coll.add(sd44);
        coll.add(sd45);
        coll.add(sd46);
        coll.add(sd47);
        coll.add(sd48);
        coll.add(sd49);
        coll.add(sd50);
        coll.add(sd51);
        coll.add(sd52);
        coll.add(sd53);
        coll.add(sd54);
        coll.add(sd55);
        coll.add(sd56);
        coll.add(sd57);
        coll.add(sd58);
        coll.add(sd59);
        coll.add(sd60);
        coll.add(sd61);
        coll.add(sd62);
        coll.add(sd63);
        coll.add(sd64);
        coll.add(sd65);
        coll.add(sd66);
        coll.add(sd67);
        coll.add(sd68);
        coll.add(sd69);
        coll.add(sd70);
        coll.add(sd71);
        coll.add(sd72);
        coll.add(sd73);
        coll.add(sd74);
        coll.add(sd75);
        coll.add(sd76);
        coll.add(sd77);
        coll.add(sd78);
        coll.add(sd79);
        coll.add(sd80);
        coll.add(sd81);
        coll.add(sd82);
        coll.add(sd83);
        coll.add(sd84);
        coll.add(sd85);
        coll.add(sd86);
        coll.add(sd87);
        coll.add(sd88);
        coll.add(sd89);
        coll.add(sd90);
        coll.add(sd91);
        coll.add(sd92);
        coll.add(sd93);
        coll.add(sd94);
        coll.add(sd95);
        coll.add(sd96);
        coll.add(sd97);
        coll.add(sd98);
        coll.add(sd99);
        coll.add(sd100);
        coll.add(sd101);
        coll.add(sd102);
        coll.add(sd103);
        coll.add(sd104);
        coll.add(sd105);
        coll.add(sd106);
        coll.add(sd107);
        coll.add(sd108);
        coll.add(sd109);
        coll.add(sd110);
        coll.add(sd111);
        coll.add(sd112);
        coll.add(sd113);
        coll.add(sd114);
        coll.add(sd115);
        coll.add(sd116);
        coll.add(sd117);
        coll.add(sd118);
        coll.add(sd119);
        coll.add(sd120);
        coll.add(sd121);
        coll.add(sd122);
        coll.add(sd123);
        coll.add(sd124);
        coll.add(sd125);
        coll.add(sd126);
        coll.add(sd127);
        coll.add(sd128);
        coll.add(sd129);
        coll.add(sd130);
        coll.add(sd131);
        coll.add(sd132);
        coll.add(sd133);
        coll.add(sd134);
        coll.add(sd135);
        coll.add(sd136);
        coll.add(sd137);
        coll.add(sd138);
        coll.add(sd139);
        coll.add(sd140);
        coll.add(sd141);
        coll.add(sd142);
        coll.add(sd143);
        coll.add(sd144);
        coll.add(sd145);
        coll.add(sd146);
        coll.add(sd147);
        coll.add(sd148);
        coll.add(sd149);
        coll.add(sd150);
        coll.add(sd151);
        coll.add(sd152);
        coll.add(sd153);
        coll.add(sd154);
        coll.add(sd155);
        coll.add(sd156);
        coll.add(sd157);
        coll.add(sd158);
        coll.add(sd159);
        coll.add(sd160);
        coll.add(sd161);
        coll.add(sd162);
        coll.add(sd163);
        coll.add(sd164);
        coll.add(sd165);
        coll.add(sd166);
        coll.add(sd167);
        coll.add(sd168);
        coll.add(sd169);
        coll.add(sd170);
        coll.add(sd171);
        coll.add(sd172);
        coll.add(sd173);
        coll.add(sd174);
        coll.add(sd175);
        coll.add(sd176);
        coll.add(sd177);
        coll.add(sd178);
        coll.add(sd179);
        coll.add(sd180);

        for(SuperMarketDTO dto:coll)
        {
            if(dto.getLocation().equals("Basaveshwara Nagar"))
            {
                System.out.println(dto);
            }
        }

        System.out.println("/////////////////////////////////////////////////////////////////");


        for(SuperMarketDTO dto:coll)
        {
            if(dto.getTotalStaff()>10)
            {
                System.out.println(dto);
            }
        }

        System.out.println("/////////////////////////////////////////////////////////////////");

        for(SuperMarketDTO dto:coll)
        {
            if(dto.getLocation().equals("Jayanagar") && dto.getTotalStaff()>10)
            {
                System.out.println(dto);
            }
        }

        System.out.println("/////////////////////////////////////////////////////////////////");


        for(SuperMarketDTO dto:coll)
        {
                System.out.println("Manager Names :"+dto.getManagerName());
        }

        System.out.println("/////////////////////////////////////////////////////////////////");

        for(SuperMarketDTO dto:coll)
        {
            System.out.println("SuperMarket Names :"+dto.getName());
        }

        System.out.println("/////////////////////////////////////////////////////////////////");






    }
}
