package dev.zeeppss.javastudy;

/*
String = menyimpan teks seperti "halo", dan nilai string diapit nilai kutip ganda
int = menyimpan bilangan bulat tanpa desimal, seperti 123 atau -123
float = menyimpan angka floating point(titik) dengan desimal, seperti 19,99 atau -19,99
char = menyimpan karakter tunggal, seperti 'a' atau 'B'.
boolean = menyimpan nilai dengan dua status: true or false
 */

public class Variables {
    public static void main(String[] args) {
        String nama = "Zeeppss";
        System.out.println("Nama: " + nama);

        int umur = 15;
        System.out.println("Umur: " + umur);

        float kecepatan = 1F;
        System.out.println("Kecepatan: " + kecepatan);

        char angka = 'Z';
        System.out.println("Inisial: " + angka);

        boolean baik  = true;

        /* Note: bisa juga:
        int nomor;
        nomor = 5;
        System.out.println(nomor);
        */
    }
}
