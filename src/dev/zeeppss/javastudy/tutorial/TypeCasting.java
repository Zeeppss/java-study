package dev.zeeppss.javastudy.tutorial;

/*
Widening Casting (automatically) = mengonversi jenis yang lebih kecil ke ukuran jenis yang lebih besar
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) = mengonversi jenis yang lebih besar ke jenis ukuran yang lebih kecil
double -> float -> long -> int -> char -> short -> byte
*/

public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = myInt; // Transmisi otomatis: int menjadi ganda

        System.out.println(myInt); // Mencetak > 10
        System.out.println(myDouble); // Mencetak > 10.0

        double myDouble2 = 10.78;
        int myInt2 = (int) myDouble; // Pengecoran manual: double ke int

        System.out.println(myDouble2); // Mencetak > 10.78
        System.out.println(myInt2); // Mencetak > 10
    }
}