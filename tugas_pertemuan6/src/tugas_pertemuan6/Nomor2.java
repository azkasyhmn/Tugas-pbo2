package tugas_pertemuan6;

public class Nomor2 {
    public static void main(String[] args) {
        
        
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        
        System.out.println("Sebelum nilai array diubah: \n");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println(("Data Mobil ke-" + (i + 1)) + ": " + mobil[i]);
        }
        
        mobil[1] = "Chevrolet";
        
        System.out.println("\nSetelah nilai array diubah: \n");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println(("Data Mobil ke-" + (i + 1)) + ": " + mobil[i]);
        }
        
        System.out.println("Nilai indeks yang diubah : " + mobil[1]);
        
    }
}
