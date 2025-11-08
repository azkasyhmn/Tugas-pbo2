package tugas_pertemuan5;

import java.util.Scanner;

public class Rata2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int angka;
        int total = 0;
        double rata_rata;
        
        System.out.print("Berapa banyak angka yang ingin dijumlahkan?: ");
        angka = input.nextInt();
        
        for (int i = 0; i < angka; i++){
            System.out.print("Masukkan angka: ");
            total += input.nextInt();
        }
        
        rata_rata = total / angka;
        
        System.out.println("Total bilangan: " + total);
        System.out.println("Rata-rata bilangan: " + rata_rata);
        
    }
  
}
