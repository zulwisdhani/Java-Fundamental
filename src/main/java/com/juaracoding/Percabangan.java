package com.juaracoding;

public class Percabangan {
    public static void main(String[] args) {
        if (5<= 5){
            System.out.println("Percabangan");
        }
        if (!false){
            System.out.println("Bogor");
        }else {
            System.out.println("Tanggerang");
        }
        int platMotot = 11;
        // Program bil ganjil genap
        if (false)
            System.out.println("Text");

        //nested if
        int x = 102;
        if (x%2 == 0)
            if (x/100 != 0)
                System.out.println(x + "bilangan genap lebih dari seratus");
            else if (x/10 != 0)
                System.out.println(x + "bilangan genao lebih dari Sepuluh");
            else {
                System.out.println(x + "bilangan ganjil");

            }

    }

}
