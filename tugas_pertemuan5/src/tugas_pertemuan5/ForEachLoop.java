package tugas_pertemuan5;

public class ForEachLoop {
    public static void main(String[] args) {
        
        String[] buah = {"Apel", "Jeruk", "Mangga", "Alpukat"};
        int[] num = {10, 20, 30, 40, 50};
        char[] nama = {'S', 'Y', 'A', 'H', 'M', 'A', 'N'};
        
        System.out.println("String: ");
        for(String i : buah){
            System.out.println(i);
        }
        
        System.out.println("");
        
        System.out.println("Integer: ");
        for(int i : num){
            System.out.println(i);
        }
        
        System.out.println("");
        
        System.out.println("Char: ");
        for(char i : nama){
            System.out.print(i);
        }
        System.out.println("    ");
    }
}
