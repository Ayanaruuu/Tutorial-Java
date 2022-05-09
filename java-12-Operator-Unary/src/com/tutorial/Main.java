package com.tutorial;

public class Main {
    public static void main(String[] args) {
//        Unary = operasi yang dilakukan pada satu variabel saja

//        Unary + dan -
        int angka = 1;
        System.out.printf("Unary '-', %d menjadi %d\n",angka,-angka);
        System.out.printf("Unary '+', %d menjadi %d\n",angka,+angka);

//        Unary Increment dan Decrement
        int angka2 = 10;
        angka2++;
        angka2++;
        System.out.println("Nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        angka3--;
        System.out.println("Nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("Nilai dengan '++' Prefix menjadi = %d\n ", ++a);
        int b = 5;
        System.out.printf("Nilai dengan '++' Postfix menjadi = %d\n ", b++);
        System.out.printf("Nilai dengan '++' Postfix menjadi = %d\n ", b);

//        Unary Boolean dengan ! untuk negasi

        boolean ucup = true;
        System.out.println("Nilai boolean = " + ucup);
        System.out.println("Nilai boolean = " + !ucup);
    }
}
