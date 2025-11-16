package tugas_pertemuan6;

import java.util.ArrayList;

public class Nomor10 {
    public static void main(String[] args) {
        
        ArrayList<Object> data = new ArrayList<>();
        
        data.add(19);
        data.add(0.2);
        data.add('C');
        data.add("Java");
        data.add(true);
        
        
        System.out.println("Tampilkan semua data: ");
        for (Object tampil : data) {
            System.out.println(tampil);
        }
        
        System.out.println("\nTampilkan satu persatu: ");
        System.out.println("Integer : " + data.get(0));
        System.out.println("Float/Double : " + data.get(1));
        System.out.println("Char : " + data.get(2));
        System.out.println("String : " + data.get(3));
        System.out.println("Boolean : " + data.get(4));
        
    }  
}
