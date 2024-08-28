package com.mycompany.bab7soal2;

import java.util.Scanner; // Import the Scanner class

public class Bab7soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA : ");
        String nama = scanner.nextLine();
        
        System.out.print("TAHUN : ");
        int tahun = scanner.nextInt();
        scanner.nextLine();  // Consume newline character left by nextInt()
        
        System.out.print("PILIH PEMINATAN (M/T/P) : ");
        char peminatan = scanner.nextLine().toUpperCase().charAt(0); // Convert input to uppercase and get the first character
        
        // Process based on year and specialization
        switch (tahun) {
            case 3:
                switch (peminatan) {
                    case 'M':
                        System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + " memilih peminatan Manajemen.");
                        break;
                    case 'T':
                        System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + " memilih peminatan Teknik.");
                        break;
                    case 'P':
                        System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + " memilih peminatan Pendidikan.");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                        break;
                }
                break;
            default:
                System.out.println("PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2");
                break;
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
}


