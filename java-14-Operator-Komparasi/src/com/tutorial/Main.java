package com.tutorial;

public class Main {
    public static void main(String[] args) {
//        Operator komparasi akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

//        Operator Equal (Persamaan)
        System.out.println("===PERSAMAAN===");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 9;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ---> %s\n",a,b, hasilKomparasi);

//        Operator not Equal (Pertidaksamaan)
        System.out.println("===PERTIDAKSAMAAN===");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 9;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ---> %s\n",a,b, hasilKomparasi);

//        Operator Less Than (Kurang Dari)
        System.out.println("===KURANGDARI===");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 9;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ---> %s\n",a,b, hasilKomparasi);

//        Operator Greater Than (Lebih Dari)
        System.out.println("===LEBIHDARI===");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 9;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ---> %s\n",a,b, hasilKomparasi);

//        Operator Less Than Equal (Kurang Dari Sama Dengan)
        System.out.println("===KURANGDARISAMADENGAN===");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 9;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s\n",a,b, hasilKomparasi);

//        Operator Greater Than Equal (Lebih Dari Sama Dengan)
        System.out.println("===LEBIHDARISAMADENGAN===");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s\n",a,b, hasilKomparasi);

        a = 10;
        b = 9;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s\n",a,b, hasilKomparasi);

    }
}
