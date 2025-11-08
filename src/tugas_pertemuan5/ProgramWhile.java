package tugas_pertemuan5;

public class ProgramWhile {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        
        while(i++ < 10){ // 'i' sampai 10
            System.out.println("i++: " + i);
        }
        
        System.out.println("");

        while(++j < 10){ // 'i' hanya sampai 9
            System.out.println("++i: " + j);
            
        }
    }
}
