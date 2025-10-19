/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_nomor4;
import java.util.Scanner;

class Hitung {
    
    double m, v, r;
    
double hitungGaya(){
    return (m * v * v) /r;
    }
}

public class HitungGayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Hitung gaya = new Hitung();
        
        System.out.print("Input massa benda : ");
        gaya.m = input.nextDouble();
        
        System.out.print("Input Kecepatan : ");
        gaya.v = input.nextDouble();
        
        System.out.print("Input Jari-jari : ");
        gaya.r = input.nextDouble();
        
        System.out.println("Hasil Gaya Sentripental : " + gaya.hitungGaya() + " N");
        
        
    }
    
}
