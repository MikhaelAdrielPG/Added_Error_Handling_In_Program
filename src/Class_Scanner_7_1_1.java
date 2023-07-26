import java.util.Scanner;
import java.util.InputMismatchException;

public class Class_Scanner_7_1_1 {
    public static void main(String[] args) {
        /*
        * Metode nextLine() di java sering digunakan untuk membaca input dari pengguna saat pengguna harus dapat memasukkan lebih dari satu kata.
        *  Misalnya, jika Anda ingin meminta pengguna untuk memasukkan alamat mereka,
        *  Anda dapat menggunakan metode nextLine() untuk membaca input dari pengguna baris demi baris.
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama Anda : ");
        String name = scanner.nextLine(); // Membaca baris teks dari input pengguna

        int age = 0; // Inisialisasi umur dengan nilai default 0
        boolean isMarried = false; // Inisialisasi isMarried dengan nilai default false



        // Error handling untuk input isMarried
        while (true) {
            try {
                System.out.println("Apakah Anda sudah menikah ? (true/false): ");
                isMarried = scanner.nextBoolean(); // Membaca nilai boolean dari input pengguna
                break; // Keluar dari loop jika input isMarried valid
            } catch (InputMismatchException e) {
                // Jika terjadi InputMismatchException pada input isMarried, tangkap dan cetak pesan kesalahan
                System.out.println("Input yang Anda berikan bukan true/false. Coba lagi.");
                scanner.nextLine(); // Membaca karakter newline yang tersisa
            }
        }

        System.out.println("Hallo " + name);
        System.out.println("Usia mu " + age + " tahun");
        System.out.println("Dan kamu ");
        if (isMarried) {
            System.out.println("sudah ");
        } else {
            System.out.println("belum ");
        }
    }
}
