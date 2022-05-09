package com.tutorial;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            total = total + nilaiAwal;
            System.out.println("Ditambahkan " + nilaiAwal + " hasilnya" + total);
        }
    }
}
