package dev.zeeppss.javastudy.tutorial;

/*
Anda telah melihat pernyataan "break" yang digunakan di bab awal tutorial ini. Itu digunakan untuk "melompat keluar" dari pernyataan "switch".

Pernyataan "break" juga dapat digunakan untuk melompat keluar dari loop.

Contoh ini melompat keluar dari loop ketika i sama dengan 4, contoh:
*/

public class BreakNContinue {
    public static void main(String[] args) {
        for (int i = 5; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        // Java Continue
/*
Pernyataan "continue" memecah satu iterasi (dalam perulangan), jika kondisi tertentu terjadi, dan berlanjut dengan iterasi berikutnya dalam perulangan.

Contoh ini melewatkan nilai 4, contoh:
*/
        for (int o = 5; o < 10; o++) {
            if (o == 4) {
                continue;
            }
            System.out.println(o);
        }
        // Break and Continue in While Loop
        // Anda juga dapat menggunakan break dan melanjutkan sementara loop:
        // Break contoh:
        int u = 0;
        while (u < 10) {
            System.out.println(u);
            u++;
            if (u == 4) {
                break;
            }
        }
        // Continue contoh:
        int a = 0;
        while (a < 10) {
            if (a == 4) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
