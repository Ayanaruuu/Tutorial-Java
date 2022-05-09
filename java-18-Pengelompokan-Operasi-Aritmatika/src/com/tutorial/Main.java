package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Pekalian dan pembagian akan dikerjakan terlebih dahulu
//        Jika ada perkalian dan pembagian akan dikerjakan dari kiri

        int hasil = 2*5+10;
        System.out.println("Hasil = " + hasil);
        hasil = 10+20/5;
        System.out.println("Hasil = " + hasil);

//        Menggunakan pengelompokkan operasi dengan ()
        hasil = (10+20)/5;
        System.out.println("Hasil = " + hasil);

        Scanner userInput = new Scanner(System.in);
//        Perhitungan persamaan kuadarat
        System.out.println("===MENGHITUNG PERSAMAAN KUADRAT===");

        int m,x,c;

        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradient m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("Nilai Y = " + y);
    }
}
