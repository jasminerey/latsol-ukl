import java.util.Scanner;
public class PAKETT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Volume Benda====");
        System.out.println("Panjang (cm): ");
        int panjang = input.nextInt();
        System.out.println("Lebar (cm): ");
        int lebar = input.nextInt();
        System.out.println("Tinggi (cm): ");
        int tinggi = input.nextInt();
        int volumePaket = panjang * lebar * tinggi;
        System.out.println("Volume Paket: " + volumePaket + " cm3");

        int biayaTambahan;
        if (volumePaket > 100) {   // <-- remove stray semicolon here
            biayaTambahan = 50000;
        } else {
            biayaTambahan = 0;
        }
        System.out.println("Biaya Tambahan: Rp " + biayaTambahan);

        System.out.println("====Jarak Tempuh====");
        System.out.println("Jarak Tempuh");
        int jarakTempuh = input.nextInt();
        System.out.println("Jarak Tempuh Paket: " + jarakTempuh + " km");

        int biayaPerKg;
        if (jarakTempuh <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }
        System.out.println("Biaya Per Kg: Rp " + biayaPerKg);

        System.out.println("===Rincian Biaya===");
        System.out.println("Volume Paket :" + volumePaket);
        System.out.println("Biaya Tambahan :" + biayaTambahan);
        System.out.println("Jarak Tempuh Paket :" + jarakTempuh);
        System.out.println("Biaya Per Kg :" + biayaPerKg);

        System.out.println("===================");
        System.out.println("Total :" + (biayaTambahan + biayaPerKg));
        System.out.println("Semoga Paket Anda Sampai Tujuan Dengan Selamat");



    }
}