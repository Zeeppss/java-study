package dev.zeeppss.javastudy;

/*
Statement 1 = dieksekusi (satu kali) sebelum eksekusi blok kode.
Statement 2 = mendefinisikan kondisi untuk mengeksekusi blok kode.
Statement 3 = dieksekusi (setiap saat) setelah blok kode dieksekusi.
Contoh di bawah ini akan mencetak angka 0 sampai 4:
*/

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // Ada juga "for-each" loop, yang digunakan secara eksklusif untuk melakukan loop melalui elemen dalam array:
        String[] ceo = {"FacedApollo", "ItzStormz", "FatK"};
        for (String i : ceo) {
            System.out.println(i);
        }
    }
}
