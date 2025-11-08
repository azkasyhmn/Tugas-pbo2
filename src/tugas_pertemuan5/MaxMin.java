package tugas_pertemuan5;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka, max = 0, min = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Angka ke-" + i + ": ");
            angka = input.nextInt();
            
            if (i == 1) {
                max = angka;
                min = angka;
            } else {
                if (angka > max) {
                    max = angka;
                }
                if (angka < min) {
                    min = angka;
                }
            } 
        }
        
        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);
    }
    
}
