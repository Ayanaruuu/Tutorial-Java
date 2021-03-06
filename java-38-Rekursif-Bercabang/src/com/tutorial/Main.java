package com.tutorial;

import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai ke n - ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "daun atas");
        System.out.println("Nilai Fibonacci ke - " + nilai + " adalah " + nilai_fibonacci);
    }

    private static int fibonacci (int n, String daun) {
        System.out.println("Daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n -1, "daun kiri") + fibonacci(n -2, "daun kanan");
        }
    }
}
