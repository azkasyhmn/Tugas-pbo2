package tugas_pertemuan6;

import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int jumlahMahasiswa;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMahasiswa = input.nextInt();
        input.nextLine();
        
        String[] nama = new String[jumlahMahasiswa];
        int[] nilai = new int[jumlahMahasiswa];
        String[] status = new String[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println("\nMahasiswa ke-" + (i + 1) + "\n");
            
            System.out.print("Nama mahasiswa: ");
            nama[i] = input.nextLine();
            
            System.out.print("Nilai mahasiswa: ");
            nilai[i] = input.nextInt();
            input.nextLine();

            if (nilai[i] <= 50) {
                status[i] = "Tidak lulus";
                System.out.println("Status: " + status[i]);
            } else {
                status[i] = "Lulus";
                System.out.println("Status: " + status[i]);
            }
        }
        System.out.println();
          
        System.out.printf("%-4s %-25s %-8s %-15s", "No", "Nama", "Nilai", "Status");
        System.out.println();
        
        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.printf("%-4d %-25s %-8d %-15s\n", (i + 1), nama[i], nilai[i], status[i]);
        }
    }
}
