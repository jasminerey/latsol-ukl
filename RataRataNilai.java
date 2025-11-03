import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Rekapitulasi Nilai Produktif RPL ===");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai; 
        }

        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n=== Hasil Rekapitulasi ==="); 
        System.out.println("Jumlah Siswa: " + jumlahSiswa);
        System.out.println("Total Nilai : " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}
