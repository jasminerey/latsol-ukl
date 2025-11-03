import java.util.Scanner;

public class VolumeTabung {

    static double hitungVolume(double jariJari, double tinggi) {
        double volume = 3.14 * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Volume Tabung ===");
        System.out.print("Masukkan jari-jari (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi (cm): ");
        double t = input.nextDouble();

        // Memanggil fungsi dengan parameter
        double hasil = (3.14 * r * t);
        
        System.out.println();
        System.out.println("Volume tabung adalah: " + hasil + " cm^3");

    }
}
