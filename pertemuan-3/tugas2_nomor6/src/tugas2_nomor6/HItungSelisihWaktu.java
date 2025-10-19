/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_nomor6;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
/**
 *
 * @author SYAHMAN
 */
public class HItungSelisihWaktu {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan waktu pertama (hh:mm) : ");
        String waktuPertama = input.nextLine();
        
        System.out.print("Masukkan waktu kedua (hh:mm) : ");
        String waktuKedua = input.nextLine();
        
        LocalTime waktu1 = LocalTime.parse(waktuPertama);
        LocalTime waktu2 = LocalTime.parse(waktuKedua);
        
        Duration selisihWaktu = Duration.between(waktu1, waktu2);
        
        long jam = selisihWaktu.toHours();
        long menit = selisihWaktu.toMinutes() % 60;
        
        System.out.println("Selisih Waktu : " + jam + " jam " + menit + " menit");
    }
    
}
