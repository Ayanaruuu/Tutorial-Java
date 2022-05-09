package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama = ");
        input = inputUser.next();

//        Switch Case ekspresinya berupa satuan (int, long, byte, short), String atau enum.

        switch (input) {
            case "otong":
                System.out.println("Hadir cuy");
                break;
            case "ucup":
                System.out.println("Hadir cuk");
                break;
            case "mario":
                System.out.println("Hadir pak");
                break;
            default:
                System.out.println(input + " tidak hadir");
        }
        System.out.println("Akhir Program");
    }
}
