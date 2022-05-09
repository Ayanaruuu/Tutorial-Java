package com.tutorial;

public class Main {
    public static void main(String[] args) {
//        Program untuk konversi data
        int nilaiInt = 450; //32 bit
        System.out.println("Nilai Int = " + nilaiInt);

//        Memperluas rentang tipe ke yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai Long = " + nilaiLong);

//        Memperkecil nilai ke tipe data yang kecil
        byte nilaiByte = (byte)nilaiInt;
        System.out.println("Nilai Byte = " + nilaiByte);
        System.out.println("Nilai Max Byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min Byte = " + Byte.MIN_VALUE);

//        Casting Pembagian
        float a = 10;
        int b = 4;
        float c = a/b;

        System.out.printf("%f / %d = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float)x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
