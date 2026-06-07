package bagian3.perpustakaan;

public class main {
        public static void main(String[] args) {

        perpustakaan perpus = new perpustakaan();

        buku b1 = new buku(
                "Laskar Pelangi",
                "Andrea Hirata",
                2005);

        buku b2 = new buku(
                "Sang Pemimpi",
                "Andrea Hirata",
                2006);

        buku b3 = new buku(
                "Bumi",
                "Tere Liye",
                2014);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);

        System.out.println("=== PINJAM BUKU ===");
        perpus.pinjamBuku("Laskar Pelangi");

        System.out.println("\n=== KEMBALIKAN BUKU ===");
        perpus.kembalikanBuku("Laskar Pelangi");

        System.out.println("\n=== CARI PENULIS ===");
        perpus.cariPenulis("Andrea Hirata");
    }
}