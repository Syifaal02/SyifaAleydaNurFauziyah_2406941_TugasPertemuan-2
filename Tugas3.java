package com.mycompany.Tugas3;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        
        char karakter1 = '1';
        char karakter2 = '2';
        
        int ascii1 = (int) karakter1;
        int ascii2 = (int) karakter2;
        
        int penjumlahan = ascii1 + ascii2;
        
        System.out.println("=== HASIL PENJUMLAHAN ASCII ===");
        System.out.println("Karakter Pertama : " +karakter1);
        System.out.println("Karakter Kedua : " +karakter2);
        System.out.println();
        System.out.println("Kode ASCII karakter pertama : " +ascii1);
        System.out.println("Kode ASCII karakter kedua : " +ascii2);
        System.out.println("Hasil Penjumlahan = " +penjumlahan);
        
        myObj.close();
    }
}
