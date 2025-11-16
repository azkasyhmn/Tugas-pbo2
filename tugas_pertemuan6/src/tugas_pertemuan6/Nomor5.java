
package tugas_pertemuan6;

import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int jumlahBaris = 0;
        int jumlahKolom = 0;

        System.out.print("Masukkan jumlah baris: ");
        jumlahBaris = input.nextInt();
        
        System.out.print("Masukkan jumlah kolom: ");
        jumlahKolom = input.nextInt();
        input.nextLine();

        int[][] matriksA = new int[jumlahBaris][jumlahKolom];
        int[][] matriksB = new int[jumlahBaris][jumlahKolom];
        int[][] hasilMatriks = new int[jumlahBaris][jumlahKolom];

        System.out.println("\nMasukkan elemen matriks A: ");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen matriks B");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                hasilMatriks[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\nMatriks A: ");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriks B: ");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nHasil penjumlahan matriks a dan b: ");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(hasilMatriks[i][j] + " ");
            }
            System.out.println();
        }

    }
}
