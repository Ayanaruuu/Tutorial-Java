package com.tutorial;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int f_n, f_n_1, f_n_2, n, i;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Fibonacci ke - ");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        i = 0;

        while (i <= n) {
            i++;
            System.out.println("Nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
    }
}
