package tugas_pertemuan4;
import java.util.Scanner;

public class HitungPendapatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalPenjualan, uangJasa = 0, uangKomisi = 0;
        
        System.out.print("Masukkan total pendapatan : ");
        totalPenjualan = input.nextDouble();
        
        if (totalPenjualan <= 2000000) {
            uangJasa = 100000;
            uangKomisi = 0.1 * totalPenjualan;
        }
        else if (totalPenjualan > 2000000 && totalPenjualan <= 5000000) {
            uangJasa = 200000;
            uangKomisi = 0.15 * totalPenjualan;
        }
        else if (totalPenjualan > 5000000) {
            uangJasa = 300000;
            uangKomisi = 0.20 * totalPenjualan;
        }
        
        double totalPendapatan = uangJasa + uangKomisi;
        
        System.out.println("Total penjualan : " + totalPenjualan);
        System.out.println("Uang jasa : " + uangJasa);
        System.out.println("Uang Komisi : " + uangKomisi);
        System.out.println("Total pendapatan : " + totalPendapatan);
        
    }
}
