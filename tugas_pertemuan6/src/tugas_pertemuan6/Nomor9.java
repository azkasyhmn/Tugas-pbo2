package tugas_pertemuan6;

public class Nomor9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};
        
        //tampilkan menggunakan for
        System.out.println("Tampilkan array (for loop): ");
        for (int i = 0; i < age.length; i++){
            System.out.print(age[i] + " ");
        }
        
        //tampilkan menggunakan foreach
        System.out.println("\nTampilkan array (foreach loop): ");
        for (int umur : age) {
            System.out.print(umur + " ");
        }
        
    }
}
