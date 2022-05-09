package com.tutorial;

public class Main {
    public static void main(String[] args) {

//        do {
//            aksi
//        } while ();
        int a = 0;
        boolean kondisi = true;

        System.out.println("Ini awal program");

        do {
            a++;
            System.out.println("Do while ke - " + a);

            if (a==10) {
                kondisi = false;
            }
        } while (kondisi);

        System.out.println("Ini akhir program");
    }
}
