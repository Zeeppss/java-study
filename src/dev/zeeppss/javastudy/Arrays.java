package dev.zeeppss.javastudy;

/*
Anda mengakses elemen array dengan mengacu pada nomor indeks.

Pernyataan ini mengakses nilai elemen pertama di nama string, contoh:
*/

public class Arrays {
    public static void main(String[] args) {
        // Change an Array Element:
        String[] management = {"Chroma", "BadAccuracyID"};
        management[0] = "komeng";
        System.out.println(management[0]); // Mencetak > komeng

        String[] dev = {"Alviannn", "BadAccuracyID", "Aglerr", "Zunss"};
        System.out.println(dev[0]); // Mencetak > Alviannn

        // Array length
        String[] admin = {"Pulpen", "Xethu", "Ev0lty", "IU_BBIBBI"};
        System.out.println(admin.length); // Mencetak > 4

        // Loop Through an Array
        String[] mod = {"Lxnser", "Shyrest", "SkyTron16", "Atticuss_Rhodes", "Bxgelz"};
        for (int i = 0; i < mod.length; i++) {
            System.out.println(mod[i]); // Mencetak > Lxnser - Bxgelz
        }
    }
}
