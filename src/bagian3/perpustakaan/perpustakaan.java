package bagian3.perpustakaan;

import java.util.ArrayList;
public class perpustakaan {
        private ArrayList<buku> daftarBuku;

    public perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(buku buku) {
        daftarBuku.add(buku);
    }

    public void pinjamBuku(String judul) {
        for (buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.setDipinjam(true);
                System.out.println(judul + " berhasil dipinjam.");
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    public void kembalikanBuku(String judul) {
        for (buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.setDipinjam(false);
                System.out.println(judul + " berhasil dikembalikan.");
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    public void cariPenulis(String penulis) {
        System.out.println("\nDaftar buku karya " + penulis + ":");

        boolean ditemukan = false;

        for (buku buku : daftarBuku) {
            if (buku.getPenulis().equalsIgnoreCase(penulis)) {
                buku.info();
                System.out.println();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku dari penulis tersebut.");
        }
    }
}
