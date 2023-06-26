package com.juaracoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 /*       int qty = scan.nextInt();
        float harga = scan.nextFloat();
        float jumlah = qty*harga;
        System.out.println("Qty: " +qty);
        System.out.println("Harga: " +harga );
        System.out.println("Jumlah: " +jumlah);
*/

/*        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean hasil;
        hasil = a != b;
        System.out.println("Hasil: " +hasil);
*/
    //nomor 8 fiks

  /*  String x = scan.nextLine();
        System.out.println(x.length());
        String besar = x.toUpperCase();
        System.out.println(besar);
        String kecil = x.toLowerCase();
        System.out.println(kecil);
    String str1 = x.substring(x.length() -3);
        System.out.println(str1);
*/
// nomor 9
/*
        String bil = scan.nextLine();
        switch (bil){
            case ("Weekday") :
                System.out.println("Senin Selasa Rabu Kamis Jum'at");
                break;
            case ("Weekend"):
                System.out.println("Sabtu Minggu");
                break;
           case("111"):
           System.out.println("Invalid input");
                break;
        }

 */
// nomor 10

       /* int batas = scan.nextInt();
        for(int angka =1; angka <= batas ; angka++) {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
            }
        } */
    int sum = 0;
    int item = 0;
    while (item < 5){
        item++;
        if (item == 2) continue;
        System.out.print(item + " ");
        sum+= item;
    }
        System.out.println();
        System.out.println("The sum is " +sum);

    }
}
