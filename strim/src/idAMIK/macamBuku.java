/*
 tugas 2 after uts jum'at Maret 2019
  IO
 */
package idAMIK;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class macamBuku {

    public static void addbuk() {
        
        try (FileOutputStream file = new FileOutputStream("AlamatBuku.dat", true)) {
            Scanner input = new Scanner(System.in);

            System.out.printf("Input Nama : ");
            String Nama_ = input.nextLine() + "\n";
            System.out.printf("Input Alamat: ");
            String Alamat_ = input.nextLine() + "\n";
            System.out.printf("Input No Telp: ");
            String TEL = input.nextLine() + "\n";
            System.out.printf("Input Email: ");
            String Email = input.nextLine() + "\n";
            file.write(Nama_.getBytes(Nama_));
            file.write(Alamat_.getBytes(Alamat_));//
            file.write(TEL.getBytes(TEL));
            file.write(Email.getBytes(Email));//
            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        
        do {
            
             System.out.println("|>>>>>>>>>>>[ MENU ]<<<<<<<<<<<<|");
             System.out.println("|   1. MENAMBAHKAN DATA BUKU    |");
             System.out.println("|   2. MENAMPILKAN DATA BUKU    |");
             System.out.println("|   3. KELUAR                   |");
             System.out.println("|===============================|");
             System.out.print("\nMASUKAN PILIHAN [1-3]:");
            
            int alif = input.nextInt();
            
            switch (alif) {
                case 1:
                    addbuk();
                    break;
                case 2:
                    openbuk();
                    break;
                case 3:
                    System.exit(00);
                    break;
                default:
                    System.out.println("file not found/ Tidak ditemukan");
                    break;
            }
            System.out.println();
        } while (true);
    }
    public static void openbuk() throws IOException {
        try (FileInputStream export = new FileInputStream("AlamatBuku.dat")) {
            byte siklus;
            while ((siklus = (byte) export.read()) != -1) {
                System.out.println((char) siklus);
            }
            export.close();
        } catch (FileNotFoundException e) {
            System.out.println("alamat tidak di input");
        }
    }

}