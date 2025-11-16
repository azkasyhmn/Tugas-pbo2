
package tugas_pertemuan6;

import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        
        int jumlahAngka = 0;
        int total = 0;
        double rata_rata = 0;

    while (true) {    
        try { 
            System.out.print("Masukkan jumlah angka yang ingin di rata-rata kan: ");
            jumlahAngka = input.nextInt();
            
            if (jumlahAngka <= 0) {
                System.out.println("Jumlah Angka harus lebih dari nol.");
                continue;
            }
            break;
        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan angka / bilangan bulat");
            input.nextLine();
         } 
      }    

        int[] angka = new int[jumlahAngka];
   
        for (int i = 0; i < jumlahAngka; i++){
            while (true) {
                try {
                    System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                    angka[i] = input.nextInt();
                    break;
                    
                } catch (Exception e) { 
                    System.out.println("Input tidak valid. Masukkan angka / bilangan bulat");
                    input.nextLine();
                    
                }
            }
        }
            for (int j = 0; j < jumlahAngka; j++) {
                    total += angka[j];
            }
        
            rata_rata = (double) total / jumlahAngka;
                
            // output
            System.out.println("Total angka: " + total);
            System.out.println("Rata-rata: " + rata_rata);  
            
   }
}
