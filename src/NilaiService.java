/**
 * Kelas ini menyediakan layanan untuk menghitung rata-rata nilai
 * dan menentukan status kelulusan mahasiswa.
 *
 * <p>Kelas ini berisi metode-metode utilitas yang berhubungan
 * dengan perhitungan nilai.</p>
 *
 * @author salem
 * @version 1.0
 * @since 2025-10-20
 */
public class NilaiService {

    /**
     * Konstruktor default untuk kelas {@code NilaiService}.
     * <p>Digunakan untuk membuat objek layanan perhitungan nilai.</p>
     */
    public NilaiService() {
        // Konstruktor default
    }

    /**
     * Menghitung rata-rata dari array nilai mahasiswa.
     *
     * @param nilai array berisi nilai-nilai mahasiswa
     * @return nilai rata-rata dari semua elemen array
     * @throws IllegalArgumentException jika array kosong
     */
    public double hitungRataRata(double[] nilai) {
        if (nilai.length == 0) {
            throw new IllegalArgumentException("Daftar nilai tidak boleh kosong.");
        }

        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }

    /**
     * Menentukan status kelulusan berdasarkan nilai rata-rata.
     *
     * @param rataRata nilai rata-rata mahasiswa
     * @return "Lulus" jika rata-rata ≥ 60, "Tidak Lulus" jika &lt; 60
     */
    public String tentukanStatus(double rataRata) {
        return (rataRata >= 60) ? "Lulus" : "Tidak Lulus";
    }
}
