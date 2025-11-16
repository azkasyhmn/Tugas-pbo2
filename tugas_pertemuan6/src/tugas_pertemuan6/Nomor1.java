package tugas_pertemuan6;

import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); 
        
        System.out.println("Array ukuran tetap:");
        int[] a = new int[3];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        
        System.out.println("\nArray deklarasi langsung:");
        int[] b = {10, 30, 50};
        
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        
        System.out.println("\nArray multidimensi");
        int[][] matriks = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };
        
        for (int i = 0; i < matriks.length; i++){
            for (int j = 0; j < matriks[i].length; j++){
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
     
    }
    
}
