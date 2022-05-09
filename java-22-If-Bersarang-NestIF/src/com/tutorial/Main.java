package com.tutorial;

public class Main {
    public static void main(String[] args) {

//        Nested If
        int a = 5;
        int b = 10;
        System.out.println("Ini adalah awal program");

        if (a == 5) {
            if (b == 10) {
                System.out.println("Ketika a = 5 dan b = 10");
            } else {
                System.out.println("Ketika b != 10");
            }
        } else {
            System.out.println("Ketika a != 5");
        }
        System.out.println("Ini adalah akhir program");
    }
}
