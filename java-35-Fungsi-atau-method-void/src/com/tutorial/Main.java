package com.tutorial;

public class Main {
    public static void main(String[] args) {
//        Void itu artinya hampa

        System.out.println(simpel());

        selamatPagi("Ayana");
        fungsiVoid("Asekk");
    }

    private static void selamatPagi(String nama) {
        System.out.println("Selamat Pagi, " + nama);
    }

//    Fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }

//    Fungsi atau method dengan kembalian
//    sehingga menggunakan return untuk mengembalikan nilainya
    private static float simpel() {
        return 10.0f;
    }
}
