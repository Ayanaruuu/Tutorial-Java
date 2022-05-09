package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

//        Sebuah program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan Nilai Tebakan Anda ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah = " + nilaiTebakan);

//        Operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda " + statusTebakan);

//        Operasi aljabar boolean (and/or)
        System.out.print("Masukkan nilai antara 4 dan 9 = ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        System.out.println("Nilai tebakan " + statusTebakan);
    }
}
