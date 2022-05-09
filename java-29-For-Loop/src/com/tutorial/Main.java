package com.tutorial;

public class Main {

    public static void main(String[] args) {
//        for (insialisai; kondisi; step nilai) {
//
//        aksi;
//
//    }
        System.out.println("Ini awal program");

        System.out.println("For loop pertama");
        for (int nilai = 0; nilai <= 10; nilai++) {
            System.out.println("For loop ke - " + nilai);
        }
        System.out.println("For loop kedua");
        for (int nilai = 0; nilai < 10; nilai++) {
            System.out.println("For loop ke - " + nilai);
        }
        System.out.println("For loop ketiga");
        for (int nilai = 10; nilai >= 1; nilai--) {
            System.out.println("For loop ke - " + nilai);
        }
        System.out.println("Ini akhir program");
    }
}
