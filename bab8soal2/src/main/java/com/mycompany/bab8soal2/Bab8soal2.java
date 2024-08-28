package com.mycompany.bab8soal2;

import java.util.Scanner; // Import the Scanner class

public class Bab8soal2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Request input for the end year and start year
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();

        // Validate input
        if (tahunAwal > tahunAkhir) {
            System.out.println("Tahun Awal harus lebih kecil atau sama dengan Tahun Akhir.");
        } else {
            // Loop to display years from end year to start year in descending order
            for (int i = tahunAkhir; i >= tahunAwal; i--) {
                System.out.println(i);
            }
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
}
