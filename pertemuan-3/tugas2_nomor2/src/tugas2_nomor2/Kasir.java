/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_nomor2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/**
 *
 * @author SYAHMAN
 */
public class Kasir {

    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out);
        
        
        output.writeBytes("Nama : ");
        output.flush();
        String nama = input.readLine();
        
        output.writeBytes("Total Belanja : ");
        output.flush();
        double totalBelanja = Double.parseDouble(input.readLine());
        
        output.writeBytes("Diskon (%): ");
        output.flush();
        double diskon = Double.parseDouble(input.readLine());
        
        double potongan = totalBelanja * (diskon / 100);
        
        double total = totalBelanja - potongan;
        
        output.writeBytes("Total : " + total + "\n");
        output.flush();
        
        output.writeBytes("Bayar : ");
        output.flush();
        double bayar = Double.parseDouble(input.readLine());
        
        double kembalian = bayar - total;
        
        output.writeBytes("Kembalian : " + kembalian + "\n");
        output.flush();
        
        
        input.close();
        output.close();
    }
    
}
