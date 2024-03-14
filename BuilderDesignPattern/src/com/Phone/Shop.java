package com.Phone;

public class Shop {
    public static void main(String[] args) {
//        we have to pass all the middle parameters and they have to strictly follow the order of occurence
        Phone p = new Phone("Android", 2, "QualComm", 5.5, 3100);

        System.out.println(p);

//        With PhoneBuilder you can now create an object with only required parameter constructor and they can be in any order
        Phone p2=new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        System.out.println(p2);
    }
}