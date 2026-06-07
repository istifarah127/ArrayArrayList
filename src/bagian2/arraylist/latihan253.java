package bagian2.arraylist;

import java.util.ArrayList;
public class latihan253 {
        public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Jeno");
        nama.add("Taeyong");
        nama.add("Jisung");
        nama.add("Jaemin");
        nama.add("Mark");
        nama.add("Yuta");

        System.out.println("Nama yang diawali huruf J:");

        for (String n : nama) {
            if (n.startsWith("J")) {
                System.out.println(n);
            }
        }
    }
}
