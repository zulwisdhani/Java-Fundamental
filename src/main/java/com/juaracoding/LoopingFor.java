package com.juaracoding;

public class LoopingFor {
    public static void main(String[] args) {
        String nama = "Juara";
        System.out.println("Length: " + nama.length());
        for (int i = 0; i < nama.length(); i++) {
            System.out.println(i);
        }
        //  4 3 2 1
        for (int i = 4; i >= 0; i--) {
            System.out.println();
        }
        //Deret bil ganjil
        for (int i = 1; i < 10; i += 2) {
            //if (i % 2 == 1) {
            //System.out.printf(i + " ");
            System.out.println(i);
        }

        //*****
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //segitiga siku
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //segitiga siku kebalik

        n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//}


