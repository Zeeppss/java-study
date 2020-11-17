package dev.zeeppss.javastudy.tutorial;

/*
String digunakan untuk menyimpan teks
Variabel String berisi kumpulan karakter yang diapit tanda kutip ganda.
*/

public class Strings {
    public static void main(String[] args) {
        String salam = "Halo";
        System.out.println("Salam: " + salam); // Mencetak > Halo

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Panjang txt: " + txt.length()); // Mencetak > 26

        String txt2 = "Halo Dunia";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase()); /*
                                                Mencetak:
                                                HALO DUNIA
                                                halo dunia
                                                */

        String txt3 = "Silakan cari di mana 'lokasi' terjadi!";
        System.out.println(txt3.indexOf("locate")); // Mencetak -1
    }
}
