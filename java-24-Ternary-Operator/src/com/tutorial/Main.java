package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Ternary Operator
        int input,x;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");
        input = inputUser.nextInt();

//        Variable x = ekspresi ? statemet_true : statement_false;

        x = (input==10) ? (input*input) : (input/2);
        System.out.println("Hasilnya = " + x);
    }
}
