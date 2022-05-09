package com.tutorial;

public class Main {
    public static void main(String[] args) {

//        while (kondisi) {
//            aksi
//        }

        int a = 0;
        boolean condition = true;

        System.out.println("Awal Program");

        while (condition) {
            System.out.print("While loop ke -> " + a + " ");

            if (a == 100) {
                condition = false;
            }
            a++;
        }

        System.out.println("Akhir Program");
    }
}
