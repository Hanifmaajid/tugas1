/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HANIF MAAJID
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Tugas Pertemuan 1 ==");
        System.out.print("\nMasukkan Nama      : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM       : ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Alamat    : ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan Nilai UTS : ");
        float uts = scanner.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        float uas = scanner.nextFloat();
        float nilai=0;
        
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, nim, alamat, uts, uas, nilai);
        
        
        int menu = 0;
        do{
            System.out.println("\n\nMenu");
            System.out.println("1. Lihat Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            menu = scanner.nextInt();
            scanner.nextLine();
            
            switch(menu){
                case 1 :
             
                    
                    System.out.println("\n\nNama    : " + mahasiswa1.getNama());
                    System.out.println("NIM     : " + mahasiswa1.getNim());
                    System.out.println("Alamat  : " + mahasiswa1.getAlamat());
                    System.out.println("Jurusan : Sistem Informasi" );
                    System.out.println("Nilai   : " + mahasiswa1.getNilai());
                    
                    break;
                case 2 : 
                    System.out.println("\n\nEdit Data");
                    
                    System.out.print("\nMasukkan Nama      : ");
                    nama = scanner.nextLine();
                    mahasiswa1.setNama(nama);
                    System.out.print("Masukkan NIM       : ");
                    nim = scanner.nextLine();
                    mahasiswa1.setNim(nim);
                    System.out.print("Masukkan Alamat    : ");
                    alamat = scanner.nextLine();
                    mahasiswa1.setAlamat(alamat);
                    System.out.print("Masukkan Nilai UTS : ");
                    uts = scanner.nextFloat();
                    mahasiswa1.setUts(uts);
                    System.out.print("Masukkan Nilai UAS : ");
                    uas = scanner.nextFloat();
                    mahasiswa1.setUas(uas);
                    mahasiswa1.setNilai(nilai);
                    break;
                case 3 :
                    break;
            }
        }while(menu != 3);
     
   
    }
    
}
