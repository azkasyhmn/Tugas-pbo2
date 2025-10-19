/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_nomor5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author SYAHMAN
 */
public class HitungTotalBuah {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Jumlah mangga : ");
        int mangga = Integer.parseInt(br.readLine());
        
        System.out.print("Mangga yang busuk : ");
        int manggaBusuk = Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah tetangga yang diberi jambu : ");
        int jumlahTetangga = Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah jambu per tetangga : ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());
        
        int sisaMangga = mangga - manggaBusuk;
        
        int totalJambu = jumlahTetangga * jambuPerTetangga;
        
        int totalBuah = sisaMangga + totalJambu;
        
        System.out.println("Total seluruh buah : " + totalBuah);
    }
    
}
