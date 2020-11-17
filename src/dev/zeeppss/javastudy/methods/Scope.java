package dev.zeeppss.javastudy.methods;


/* Java Scope
Di Java, variabel hanya dapat diakses di dalam region tempat variabel dibuat. Ini disebut ruang lingkup.
*/

/* Method Scope
Variabel yang dideklarasikan secara langsung di dalam metode tersedia di mana saja dalam metode mengikuti baris kode tempat mereka dideklarasikan:
*/

public class Scope {
    public static void main(String[] args) {
        // Kode di sini tidak bisa menggunakan x

        int x = 100;

        // Kode disini bisa menggunakan x

        System.out.println(x); // Mencetak > 100
    }
}

class BlockScope {
    public static void main(String[] args) {

        // Kode disini tidak bisa menggunakan y

        { // Ini satu blok

            // Kode disini tidak bisa menggunakan y

            int y = 200;

            // Kode disini bisa menggunakan y
            System.out.println(y); // Mencetak > 200

        } // Blok itu terakhir disini

        // Kode disini tidak bisa menggunakan y

    }
}