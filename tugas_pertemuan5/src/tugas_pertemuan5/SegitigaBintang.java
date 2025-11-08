package tugas_pertemuan5;

public class SegitigaBintang {
    public static void main(String[] args) {
        
        int n = 5;

// Half triangle

    System.out.println("Half Triangle: ");
    for (int i = 1; i <= n; i++){
        for(int j = i; j <= n; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        for (int j = 1; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
        System.out.println();
        
// Full Triangle

    System.out.println("Full Triangle: ");
    for (int i = 1; i < n; i++){
        for(int j = i; j <= n; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        for (int j = 1; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(" ");
        }
        for(int j = i; j <= n; j++){
            System.out.print("*");
        }
        for (int j = i + 1; j <= n; j++){
            System.out.print("*");
        }
        System.out.println();
      }

    }
}


