/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_nomor1;

import java.util.Scanner;

/**
 *
 * @author SYAHMAN
 */
public class HitungGajiPegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nomor Induk Karyawan : ");
        String nik = input.nextLine();

        System.out.print("Nama Karyawan : ");
        String namaKaryawan = input.nextLine();
        
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        
        System.out.println("Jabatan : Manajer");
        
        int p1 = 2000000;
        int p2 = 300000;
        int p3 = 200000;
        int p4 = 150000;
        
        System.out.println("Gaji Pokok : " + p1);
        System.out.println("Tunjangan Jabatan : " + p2);
        System.out.println("Tunjangan Istri : " + p3);
        System.out.println("Tunjangan anak : " + p4);
        
        

        int total = p1 + p2 + p3 + p4;
        
        System.out.println("Total Gaji : " + total);
        
        double pajakPenghasilan = 0.1 * (p1 + p2 + p4);
        
        System.out.println("Pajak Penghasilan : " + pajakPenghasilan);
        
        double gajiBersih = total - pajakPenghasilan;
        
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
    
}
