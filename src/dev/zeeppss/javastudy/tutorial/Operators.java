package dev.zeeppss.javastudy.tutorial;

/*
+ = Penambahan
- = Pengurangan
* = Perkalian
/ = Pembagian
% = Penyisahan
++ = Kenaikan
-- = Terkurangan

Kamu bisa menyimpelkan "." diganti oleh "_" agar lebih jelas dibaca*
*/

public class Operators {
    public static void main(String[] args) {
        int penambahan = 500_000;
        System.out.println(penambahan + penambahan); // Mencetak > 1000000

        int pengurangan = 1_000_000;
        int pengurangan2 = 500_000;
        System.out.println(pengurangan - pengurangan2); // Mencetak > 500000

        int perkalian = 50;
        int perkalian2 = 2;
        System.out.println(perkalian * perkalian2); // Mencetak > 100

        int pembagian = 100;
        int pembagian2 = 2;
        System.out.println(pembagian / pembagian2); // Mencetak > 50

        int penyisahan = 100;
        int penyisahan2 = 10;
        System.out.println(penyisahan % penyisahan2); // Mencetak > 0

        int kenaikan = 9;
        System.out.println(++kenaikan); // Mencetak > 10

        int terkurangan = 2;
        System.out.println(--terkurangan); // Mencetak > 1
    }
}