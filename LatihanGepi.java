import java.util.Scanner;

public class LatihanGepi {
    public static void main(String[] args) {
        Scanner Meow  = new Scanner(System.in);

        String pengisi, hewan, nama, jenis, umur;

        System.out.println("_________________________________________________________________");
        System.out.println("   ");


        System.out.println("Silakan diisi ya ;D !!");

        System.out.print("Pengisi: ");
        pengisi = Meow.nextLine();

        System.out.print("Hewan peliharaan: ");
        hewan = Meow.nextLine();

        System.out.print("Nama: ");
        nama = Meow.nextLine();

        System.out.print("Jenis: ");
        jenis = Meow.nextLine();

        System.out.println("_________________________________________________________________");
        System.out.println("   ");

        System.out.println("Haloo "+ pengisi + "!, anda terdaftar memiliki "+ hewan + " bernama "+ nama +" dengan jenis " + jenis );
        
        System.out.println("_________________________________________________________________");
        System.out.println("    ");

    }
}
