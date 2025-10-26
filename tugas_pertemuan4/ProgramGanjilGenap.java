
package tugas_pertemuan4;

import java.util.Scanner;

public class ProgramGanjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("== Program untuk menentukan bilangan ganjil atau genap ==");
        
        System.out.print("Masukkan bilangan bulat : ");
        int angka = input.nextInt();
        
        if (angka % 2 == 0 ) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        }
    }
    
}
