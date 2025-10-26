package tugas_pertemuan4;
import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nik, nama, statusPernikahan = null;
        int kodeGolongan, jumlahAnak;
        double gajiPokok = 0, 
        gajiBersih = 0, 
        tunjangan = 0, 
        tunjanganPasangan = 0,
        tunjanganAnak = 0;
        
        System.out.println("PROGRAM HITUNG GAJI BERSIH KARYAWAN");
        
        System.out.print("NIK (Nomor Induk Karyawan): ");
        nik = input.nextLine();
        
        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();
        
        System.out.println("Kode golongan (menentukan status pernikahan): "); 
        
        System.out.println("1. Menikah");
        System.out.println("2. Belum Menikah");
        System.out.println("3. Cerai");
        System.out.println("4. Sudah Menikah dan Punya anak");
        
        System.out.print("Masukkan kode Golongan (1-4) : ");
        kodeGolongan = input.nextInt();
        input.nextLine();
            
        if (kodeGolongan == 1) {
            statusPernikahan = "Menikah";
                
                gajiPokok = 1200000;
                
                tunjanganPasangan = 0.1 * gajiPokok;
                tunjanganAnak = 0;
            }
        
        else if (kodeGolongan == 2) {
            statusPernikahan = "Belum Menikah";
                
                gajiPokok = 1500000;
                
                tunjanganPasangan = 0;
                tunjanganAnak = 0;
            }
        
        else if (kodeGolongan == 3) {
            statusPernikahan = "Cerai";
                gajiPokok = 1750000;
                
                tunjanganPasangan = 0;
                
                System.out.print("Apakah karyawan sudah memiliki anak? : ");
                String statusAnak = input.nextLine();
                
                String jawaban = statusAnak;
                
                if (jawaban.equalsIgnoreCase("Sudah")) {

                    System.out.print("Masukkan Jumlah Anak : ");
                    jumlahAnak = input.nextInt();

                    tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

                } else {
                    tunjanganAnak = 0;
                }  
            }
        
            else if (kodeGolongan == 4) {
            statusPernikahan = "Sudah Menikah dan punya anak"; 
                gajiPokok = 2000000;
                
                tunjanganPasangan = 0.1 * gajiPokok;
                
                System.out.print("Masukkan Jumlah Anak : ");
                jumlahAnak = input.nextInt();
                tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
                
            } 
            
            if (kodeGolongan >=1 && kodeGolongan <= 4) {
                tunjangan = tunjanganPasangan + tunjanganAnak;
                gajiBersih = gajiPokok + tunjangan;
        
                System.out.println("\n");
                
                System.out.println("NIK: " + nik);
                System.out.println("Nama: " + nama);
                System.out.println("Status Pernikahan: " + statusPernikahan);
                System.out.println("Gaji Pokok : " + gajiPokok);
                System.out.println("Tunjangan Pasangan : " + tunjanganPasangan);
                System.out.println("Tunjangan Anak: " + tunjanganAnak);
                System.out.println("Total Tunjangan : " + tunjangan);
                System.out.println("Gaji Bersih : " + gajiBersih);
            } else {
                System.out.println("Input tidak valid.");
                System.out.println("Masukkan angka dari 1 sampai 4.");
        }
    }
}
