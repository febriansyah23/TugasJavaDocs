/**
 * Kelas ini merepresentasikan entitas Mahasiswa dalam sistem penilaian.
 *
 * <p>Setiap Mahasiswa memiliki nama dan nilai ujian.
 * Kelas ini juga menyediakan metode untuk mengambil dan mengubah data tersebut.</p>
 *
 * @author salem
 * @version 1.0
 * @since 2025-10-20
 */
public class Mahasiswa {
    private String nama;
    private double nilai;

    /**
     * Membuat objek Mahasiswa baru.
     *
     * @param nama nama lengkap mahasiswa
     * @param nilai nilai ujian mahasiswa
     */
    public Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    /**
     * Mengambil nama mahasiswa.
     *
     * @return nama mahasiswa
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil nilai ujian mahasiswa.
     *
     * @return nilai ujian mahasiswa
     */
    public double getNilai() {
        return nilai;
    }

    /**
     * Mengatur nilai ujian mahasiswa.
     *
     * @param nilai nilai baru untuk mahasiswa
     */
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
