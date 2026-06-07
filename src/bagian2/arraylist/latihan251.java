package bagian2.arraylist;

import java.util.ArrayList;
public class latihan251 {
        public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        // Menghapus item ke-2 (indeks 1)
        belanja.remove(1);

        System.out.println("Isi daftar belanja:");
        for (String item : belanja) {
             System.out.println(item);
        }

        System.out.println("Jumlah item akhir: " + belanja.size());
    }
}
