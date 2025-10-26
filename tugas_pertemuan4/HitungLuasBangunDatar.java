package tugas_pertemuan4;
import java.util.Scanner;

class Luaspersegi {
    int s;
    
    double hitungLuasPersegi () {
        return s * s;
    }
}

class Luassegitiga {
    int a, t;
    
    double hitungLuasSegitiga() {
    return (0.5 * a * t);
  }
}

class Luaslingkaran {
    double phi = 3.14;
    double r;
    
    double hitungLuasLingkaran() {
        return (phi * r * r);
    }
}

class Luastrapesium {
    int a1,a2, t;
    
    double hitungLuasTrapesium() {
        return (a1 + a2) * t / 2;
    }
}

class Luaslayang2 {
    int d1, d2;
    
    double hitungLuasLayang2() {
        return (d1 * d2) / 2;
    }
}

public class HitungLuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        
        System.out.println("Hitung Luas Bangun Datar");
        
        System.out.println("Mau hitung yang mana: ");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        
        System.out.print("Masukkan Pilihan (1-5): ");
        pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                
                Luaspersegi luasP = new Luaspersegi();
                
                System.out.print("Masukkan sisi : ");
                luasP.s = input.nextInt();
                
                System.out.println("Hasil Luas Persegi : " + luasP.hitungLuasPersegi());
                break;
            case 2:
                
                Luassegitiga luasS = new Luassegitiga();
                
                System.out.print("Masukkan alas : ");
                luasS.a = input.nextInt();
        
                System.out.print("Masukkan tinggi : ");
                luasS.t = input.nextInt();
                
                System.out.println("Hasil Luas Segitiga : " + luasS.hitungLuasSegitiga());
                
                break;
            case 3:
                Luaslingkaran luasL = new Luaslingkaran();
                
                System.out.print("Masukkan Jari-jari : ");
                luasL.r = input.nextDouble();
                
                System.out.println("Hasil Luas Lingkaran : " + luasL.hitungLuasLingkaran());
                
                break;
            case 4:
                
                Luastrapesium luasT = new Luastrapesium();
                
                System.out.print("Masukkan angka 1 : ");
                luasT.a1 = input.nextInt();
                
                System.out.print("Masukkan angka 2 : ");
                luasT.a2 = input.nextInt();
                
                System.out.print("Masukkan tinggi : ");
                luasT.t = input.nextInt();
                
                System.out.println("Hasil Luas Trapesium : " + luasT.hitungLuasTrapesium());
                
                break;
            case 5:
                
                Luaslayang2 luasL2 = new Luaslayang2();
                
                System.out.print("Masukkan angka 1 : ");
                luasL2.d1 = input.nextInt();
                
                System.out.print("Masukkan angka 2 : ");
                luasL2.d2 = input.nextInt();
                
                System.out.println("Hasil Luas Layang Layang : " + luasL2.hitungLuasLayang2());
                
                break;
            default:
                System.out.println("Input tidak valid.");
                System.out.println("Masukkan angka 1 sampai 5");
                break;
        }
           
    }
}
