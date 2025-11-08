package tugas_pertemuan5;

import java.util.Scanner;

public class HitungGanjil {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int angka;
        int total = 0;
        
        System.out.print("Masukkan banyak angka: ");
        angka = input.nextInt();
        
        for(int i = 1; i <= angka; i +=2){
            System.out.format(i + " ");
            total += i;
        }
        
        System.out.println("\nTotal Penjumlahan: " + total);
        
    }
}
