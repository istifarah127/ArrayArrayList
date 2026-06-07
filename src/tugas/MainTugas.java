/* Nama  : Istifarah Indrasasi Awal
   NPM   : 2410010256
   Kelas : 4A TI Nonreg BJM */

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Nomor 4
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        // Minimal 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("Carmen", "23001", 80));

        kelas.tambahMahasiswa(
                new Mahasiswa("Yuta", "23002", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Karina", "23003", 75));

        kelas.tambahMahasiswa(
                new Mahasiswa("Ian", "23004", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Sehun", "23005", 45));

        kelas.tampilkanSemua();

        // Nomor 5
        System.out.println("Rata-rata nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah lulus : "
                + kelas.jumlahLulus());

        // Nomor 6
        kelas.tambahMahasiswa(
                new Mahasiswa("Seulgi", "23006", 88));

        System.out.println(
                "Jumlah mahasiswa setelah ditambah: "
                + kelas.jumlahMahasiswa());
        
    }
}