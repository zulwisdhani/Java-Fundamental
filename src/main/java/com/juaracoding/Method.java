package com.juaracoding;

public class Method {
    public static void main(String[] args) {
    double luas = hitungkotak(5);
        System.out.println(luas);
        System.out.println(hitungkotak(10));
        drawKotak(5);
        drawKotak(10);
        Math.pow(2,5);
        System.out.println(isResult("Java"));
    }

    static int hitungkotak(int sisi){
        return sisi*sisi;
    }
    static void drawKotak(int sisi){

        for (int i = 1; i <= sisi; i++){
            for (int j = 1; j <= sisi; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    static boolean isResult(String nama){
        return nama.equals("Java");
    }
}
