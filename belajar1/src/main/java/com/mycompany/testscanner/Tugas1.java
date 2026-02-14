package com.mycompany.Tugas1;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukan Bilangan 1:");
        int bil1 = myObj.nextInt();
        
        System.out.println("Masukan Bilangan 2:");
        int bil2 = myObj.nextInt();
        
        System.out.println("Masukan Bilangan 3:");
        int bil3 = myObj.nextInt();
        
        int penjumlahan = bil1 + bil2 + bil3;
        int pengurangan = bil1 - bil2 - bil3;
        int perkalian = bil1 * bil2 * bil3;
        int pembagian = bil1 / bil2 / bil3;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Bilangan 1 : " + bil1);
        System.out.println("Bilangan 2 : " + bil2);
        System.out.println("Bilangan 3 : " + bil3);
        System.out.println();
        System.out.println("Hasil Penjumlahan = " + penjumlahan);
        System.out.println("Hasil Pengurangan = " + pengurangan);
        System.out.println("Hasil Perkalian = " + perkalian);
        System.out.println("Hasil Pembagian = " + pembagian);
        

        myObj.close();
    }
}
