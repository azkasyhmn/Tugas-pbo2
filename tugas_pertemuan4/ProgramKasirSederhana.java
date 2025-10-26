package tugas_pertemuan4;
import java.util.Scanner;

public class ProgramKasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String statusMember;
        double totalBelanja, bayar, diskon = 0;
        
        System.out.println("STRUK PEMBAYARAN");
        
        System.out.print("Apakah anda memiliki member? (ya/tidak) : ");
        statusMember = input.nextLine();
        
        System.out.print("Total belanjaan : ");
        totalBelanja = input.nextDouble();
        
        System.out.print("Uang bayar : ");
        bayar = input.nextDouble();
        
        if (statusMember.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            }
            else if (totalBelanja > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        }
        else if (statusMember.equalsIgnoreCase("tidak")) {
            if (totalBelanja > 100000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        } else {
            System.out.println("Input tidak valid. Ketik 'ya' atau 'tidak'.");
        }
        
        double totalBayar = totalBelanja - diskon;
        double kembalian = bayar - totalBayar;
        
        System.out.println("Status Member : " + statusMember);
        System.out.println("Total belanja : " + totalBelanja);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar : " + totalBayar);
        System.out.println("Uang Bayar : " + bayar);
        System.out.println("Kembalian : " + kembalian);
    }
}
