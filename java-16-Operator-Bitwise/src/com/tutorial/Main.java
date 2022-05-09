package com.tutorial;

public class Main {
    public static void main(String[] args) {

//        Operator Bitwise ---> operator untuk melakukan operasi pada nilai bit

        byte a = 2;
        byte b,c;
        String a_bits, b_bits, c_bits;

//        Operator Shift Left
        System.out.println("===SHIFTLEFT===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);

//        Operator Shift Right
        System.out.println("===SHIFTRIGHT===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte)(a >> 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);

//        Operator OR Bitwise
        System.out.println("===ORBITWISE (|)===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("----------------OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)). replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);

//        Operator AND Bitwise
        System.out.println("===ANDBITWISE (&)===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("----------------AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)). replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);

//        Operator XOR Bitwise
        System.out.println("===XORBITWISE (^)===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("----------------XOR");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)). replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);

//        Operator NOT Bitwise
        System.out.println("===NOTBITWISE (~)===");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        System.out.println("----------------NOT");
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n",b_bits,b);
    }
}
