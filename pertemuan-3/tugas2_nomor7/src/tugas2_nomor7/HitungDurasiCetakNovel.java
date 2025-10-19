/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_nomor7;
import java.util.Scanner;
/**
 *
 * @author SYAHMAN
 */
public class HitungDurasiCetakNovel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input jumlah novel yang akan dicetak : ");
        int jumlahNovel = input.nextInt();
        
        System.out.print("Input jumlah lembar per novel : ");
        int jmlhLembarPerNovel = input.nextInt();
        
        long totalLembarNovel = jumlahNovel * jmlhLembarPerNovel;
        
        long totalDetik = totalLembarNovel * 1;
        
        long hari = totalDetik / 86400;
        long sisaDetikSehabisHari = totalDetik % 86400;
        
        long jam = sisaDetikSehabisHari / 3600;
        long sisaDetikSehabisJam = sisaDetikSehabisHari % 3600;
        
        long menit = sisaDetikSehabisJam / 60;
        long detik = sisaDetikSehabisJam % 60;
        
        System.out.println("Waktu yang dibutuhkan untuk mencetak seluruh novel : " + hari + " Hari " + jam + " Jam " + menit + " Menit " + detik + " Detik");        
    }
    
}
