package com.mycompany.Tugas2;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Jumlah Uang : ");
        int uang = myObj.nextInt();
        
        System.out.println("Apakah hari ini hujan (true/false) : ");
        boolean hujan = myObj.nextBoolean();
        
        boolean beligorengan = (uang > 5000) && (!hujan);

        System.out.println("\n=== HASIL KONDISI ===");
        System.out.println("Jumlah uang : " +uang);
        System.out.println("Apakah hari ini hujan : " +hujan);
        System.out.println();
        System.out.println("Bisa keluar membeli gorengan : " +beligorengan);
        myObj.close();
    }
}
