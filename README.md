# TugasJavaDocs 📝
## Sistem Nilai Mahasiswa - Dokumentasi JavaDocs

[![JavaDocs](https://img.shields.io/badge/JavaDocs-HTML-brightgreen)](docs/index.html)

---

### Deskripsi
Aplikasi Java minimalis ini bertugas menghitung nilai rata-rata mahasiswa dan menentukan status kelulusan mereka. Untuk memfasilitasi perawatan, pengembangan lebih lanjut, dan kerja sama tim, dokumentasi kode telah dihasilkan melalui JavaDocs.

---

### Fitur
- Menghitung rata-rata nilai mahasiswa.
- Menentukan status kelulusan.
- Dokumentasi kode lengkap menggunakan JavaDocs.

---

### Struktur Folder Proyek
TugasJavaDocs/
├─ src/ → File sumber Java (.java)
│ ├─ MainApp.java → Kelas utama untuk menjalankan program
│ ├─ Mahasiswa.java → Model data mahasiswa
│ └─ NilaiService.java → Logika perhitungan nilai dan status
├─ bin/ → File hasil kompilasi (.class)
├─ docs/ → Hasil dokumentasi JavaDocs (HTML)
└─ README.md → Panduan proyek


---

### Cara Menjalankan Program
1. Buka terminal di VS Code.
2. Kompilasi file Java:

```bash
javac src/*.java
javac -d bin src/*.java
3. Jalankan program:
java -cp bin MainApp

Output yang diharapkan:
=== Sistem Nilai Mahasiswa ===
Andi - Nilai: 75.0
Budi - Nilai: 55.0
Citra - Nilai: 80.0
------------------------------
Rata-rata nilai: 70.0
Status kelas: Lulus

Cara Membuat Dokumentasi (JavaDocs):
javadoc -d docs src/*.java

Folder docs/ akan berisi dokumentasi HTML.
Buka docs/index.html di browser untuk melihat dokumentasi.

