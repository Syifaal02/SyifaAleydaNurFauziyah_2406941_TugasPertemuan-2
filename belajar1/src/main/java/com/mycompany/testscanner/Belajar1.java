package com.mycompany.belajar1;

import java.util.Scanner;

public class Belajar1 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = myObj.nextLine();

        System.out.println("Enter age:");
        int age = myObj.nextInt();

        System.out.println("Enter salary:");
        double salary = myObj.nextDouble();

        System.out.println("\n=== OUTPUT ===");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);

        // contoh cetak angka
        System.out.println("\n80");
        System.out.println("80 * 6 = " + (80 * 6));

        // contoh variabel
        String namaDepan = "Chut";
        String namaTengah = "Nyak";
        String namaBelakang = "Dien";

        System.out.println("Nama lengkap: " 
                + namaDepan + " " 
                + namaTengah + " " 
                + namaBelakang);

        myObj.close();
    }
}
