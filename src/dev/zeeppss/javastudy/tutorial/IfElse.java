package dev.zeeppss.javastudy.tutorial;

/*
> = lebih besar                    |  If = untuk menentukan blok kode yang akan dieksekusi, jika kondisi yang ditentukan benar
>= = lebih besar sama dengan       |  else = untuk menentukan blok kode yang akan dieksekusi, jika kondisi yang sama salah
< = lebih kecil                    |  else if = untuk menentukan kondisi baru yang akan diuji, jika kondisi pertama salah
<= = lebih kecil sama dengan       |  switch = untuk menentukan banyak blok kode alternatif yang akan dieksekusi
== = sama dengan                   |
!= = tidak sama dengan             |
*/

public class IfElse {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("10 lebih besar dari 5!"); // Mencetak > 10
        }
        int x = 10;
        int y = 5;
        if (x < y) {
            System.out.println("y lebih kecil dari x"); // Mencetak > y = 5
        }
        int waktu = 10;
        if (waktu > 5) {
            System.out.println("Selamat pagi!");
        } else {
            System.out.println("Selamat malam!"); // Mencetak > Selamat pagi!
        }
        int waktu2 = 10;
        String hasil = (waktu2 < 5) ? "Selamat pagi!" : "Selamat malam!";
        System.out.println(hasil); // Mencetak > Selamat malam!
    }
}
