package tugas_pertemuan6;

public class Nomor8 {
    public static void main(String[] args) {
        
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (Exception e) {
            System.out.println("Thraad main diinterupsi.");
        }
        System.out.println("Keluar dari thread.");
    } 
}

class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            try {
                System.out.println("Thread baru : " + (i + 1));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thraad baru diinterupsi.");
            }
        }

    }
}
