import java.util.Scanner;
import java.util.InputMismatchException;

public class Class_Scanner_7_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = inputName(scanner);
        int age = validationAge(scanner);
        boolean isMarried = validationBoolean(scanner, "Apakah Anda sudah menikah ? (true/false): ");

        System.out.println("Hallo " + name);
        System.out.println("Usia mu " + age + " tahun");
        System.out.print("Dan kamu ");
        if (isMarried) {
            System.out.print("sudah ");
        } else {
            System.out.print("belum ");
        }
        System.out.print("menikah");
    }

    public static String inputName(Scanner scanner) {
        System.out.print("Masukkan nama Anda : ");
        return scanner.nextLine(); // Membaca baris teks dari input pengguna
    }

    public static int validationAge(Scanner scanner) {
        // Error handling untuk input umur
        while (true) {
            try {
                System.out.print("Masukkan umur Anda : ");
                return scanner.nextInt(); // Membaca nilai integer dari input pengguna
            } catch (InputMismatchException e) {
                // Jika terjadi InputMismatchException pada input umur, tangkap dan cetak pesan kesalahan
                System.out.println("Input yang Anda berikan bukan angka. Coba lagi.");
                scanner.nextLine(); // Membaca karakter newline yang tersisa
            }
        }
    }

    public static boolean validationBoolean(Scanner scanner, String message) {
        // Error handling untuk input isMarried
        while (true) {
            try {
                System.out.print("Apakah Anda sudah menikah ? (true/false): ");
                return scanner.nextBoolean(); // Membaca nilai boolean dari input pengguna
            } catch (InputMismatchException e) {
                // Jika terjadi InputMismatchException pada input isMarried, tangkap dan cetak pesan kesalahan
                System.out.println("Input yang Anda berikan bukan true/false. Coba lagi.");
                scanner.nextLine(); // Membaca karakter newline yang tersisa
            }
        }
    }
}
