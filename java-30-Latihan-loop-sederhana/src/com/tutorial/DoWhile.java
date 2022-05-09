package com.tutorial;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int nilaiAwal,nilaiAkhir,total;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        do {
            total = total + nilaiAwal;
            System.out.println("Ditambahkan " + nilaiAwal + " hasilnya" + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);
    }
}
