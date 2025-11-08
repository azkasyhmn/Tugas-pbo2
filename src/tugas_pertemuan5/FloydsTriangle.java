package tugas_pertemuan5;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int barisAngka;
        
        System.out.print("Masukkan banyak baris: ");
        barisAngka = input.nextInt();
        
        int num = 1;
        for(int baris = 1; baris <= barisAngka; baris++){
            for(int kolom = 1; kolom <= baris; kolom++){
                System.out.format("%-5d", num++);
            }
            
            System.out.println("");
        }
    }
}
