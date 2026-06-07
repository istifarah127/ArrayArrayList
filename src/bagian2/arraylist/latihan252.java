package bagian2.arraylist;

import java.util.ArrayList;
public class latihan252 {
        public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(12);
        angka.add(45);
        angka.add(8);
        angka.add(67);
        angka.add(23);

        int terbesar = angka.get(0);

        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
    }
}
