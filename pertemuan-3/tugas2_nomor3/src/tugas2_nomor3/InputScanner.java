/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_nomor3;
import java.util.Scanner;
/**
 *
 * @author SYAHMAN
 */

class luassegitiga {
    int a, t;
    
double hitungluas() {
    return (0.5 * a * t);
  }
}

public class InputScanner {

    public static void main(String[] args) {
        
     // Input menggunakan Scanner
     Scanner input = new Scanner(System.in);
     
     luassegitiga luas = new luassegitiga();
     
        System.out.print("Masukkan alas : ");
        luas.a = input.nextInt();
        
        System.out.print("Masukkan tinggi : ");
        luas.t = input.nextInt();
        
        System.out.println("Hasil Luas Segitiga : " + luas.hitungluas());
        
    }
    
}
