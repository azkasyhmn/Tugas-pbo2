package tugas_pertemuan6;


public class Nomor3 {
    public static void main(String[] args) {
        
        int size = 5;
        int[] arr = new int[size];

        arr[0] = 20;
        arr[1] = 45;
        arr[2] = 37;
        arr[3] = 15;
        arr[4] = 10;
        
        System.out.print("Array asli: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        
        // Tampilkan nilai terbesar dan terkecil
        int max = 0;
        int min = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                max = arr[i];
                min = arr[i];
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min){
                    min = arr[i];
                }
            }
        }
        
        System.out.println("\n\nNilai terbesar dan terkecil array: \n");
        System.out.println("Angka terbesar : " + max);
        System.out.println("Angka terkecil : " + min);
        
        
        // Jumlahkan semua data array dan cari nilai rata-rata nya
        int total = 0;
        double rata_rata = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            total += arr[i];

            rata_rata = total / size;
        }
        
        System.out.println("\nJumlah total array dan rata_rata: \n");
        System.out.println("Jumlah nilai array : " + total);
        System.out.println("Rata-rata nilai array : " + rata_rata);

        // Jumlahkan data array hanya index genap (NPM ganjil)
        int totalGenap = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                totalGenap += arr[i];
            }
        }
        
        // Cek hasil penjumlahan 
        System.out.println("\nHasil penjumlahan (indeks genap): " + totalGenap);
        
        // Urutkan elemen array
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print("Array setelah diurutkan : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
