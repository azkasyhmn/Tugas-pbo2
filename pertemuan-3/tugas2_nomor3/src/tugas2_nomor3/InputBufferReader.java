/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_nomor3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
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

public class InputBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        luassegitiga l = new luassegitiga();
        
        System.out.print("Input alas : ");
        l.a = Integer.parseInt(br.readLine());
        
        System.out.print("Input tinggi : ");
        l.t = Integer.parseInt(br.readLine());
        
        System.out.println("Hasil : " + l.hitungluas());
    }
}
