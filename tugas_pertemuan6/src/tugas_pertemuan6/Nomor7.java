package tugas_pertemuan6;

public class Nomor7 {
    public static void main(String[] args) {
        
        ThreadBaru threadBaru = new ThreadBaru();
        threadBaru.start();
        
        try {
            threadBaru.join();
        } catch (Exception e) {
            System.out.println("Thraad main diinterupsi.");
        }
        System.out.println("Keluar dari thread.");
    } 
}

class ThreadBaru extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            try {
                System.out.println("Thread Baru: " + (i + 1));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thraad baru diinterupsi.");
            }
        }
    }
}
