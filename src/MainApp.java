/**
 * Kelas utama yang menjalankan program Sistem Nilai Mahasiswa.
 * Program ini menampilkan daftar mahasiswa, menghitung rata-rata,
 * dan menentukan status kelulusan menggunakan kelas NilaiService.
 *
 * @author salem
 * @version 1.0
 * @since 2025-10-20
 */
public class MainApp {

    /**
     * Konstruktor default untuk kelas MainApp.
     */
    public MainApp() {
        // Konstruktor default
    }

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("=== Sistem Nilai Mahasiswa ===");

        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Andi", 75),
            new Mahasiswa("Budi", 55),
            new Mahasiswa("Citra", 80)
        };

        NilaiService service = new NilaiService();

        double[] nilaiArray = new double[daftarMahasiswa.length];
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            nilaiArray[i] = daftarMahasiswa[i].getNilai();
        }

        double rataRata = service.hitungRataRata(nilaiArray);
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m.getNama() + " - Nilai: " + m.getNilai());
        }

        System.out.println("------------------------------");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Status kelas: " + service.tentukanStatus(rataRata));
    }
}
