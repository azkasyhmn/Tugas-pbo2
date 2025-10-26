package tugas_pertemuan4;
import java.util.Scanner;

public class ProgramTentukanHarii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int kode;
        
        System.out.println("PROGRAM MENENTUKAN HARI BERDASARKAN KODE BERUPA ANGKA (1-7)");
        System.out.println("1: Senin");
        System.out.println("2: Selasa");
        System.out.println("3: Rabu");
        System.out.println("4: Kamis");
        System.out.println("5: Jum'at");
        System.out.println("6: Sabtu");
        System.out.println("7: Minggu");
        
        System.out.print("Masukkan kode/angka : ");
        kode = input.nextInt();
        
        if (kode <= 7){
            System.out.println("Kode: " + kode);
        }
        
        switch(kode){
            case 1:
                System.out.println(kode + " adalah hari Senin");
                break;
            case 2:
                System.out.println(kode + " adalah hari Selasa");
                break;
            case 3:
                System.out.println(kode + " adalah hari Rabu");
                break;
            case 4:
                System.out.println(kode + " adalah hari Kamis");
                break;
            case 5:
                System.out.println(kode + " adalah hari Jum'at");
                break;
            case 6:
                System.out.println(kode + " adalah hari Sabtu");
                break;
            case 7:
                System.out.println(kode + " adalah hari Minggu");
                break;
            default:
                System.out.println("Input tidak valid.");
                System.out.println("Masukkan angka dari 1 sampai 7.");
                break;
        }
    }
}
