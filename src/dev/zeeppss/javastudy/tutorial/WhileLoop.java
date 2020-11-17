package dev.zeeppss.javastudy.tutorial;

// Pada contoh di bawah ini, kode dalam loop akan berjalan, berulang kali, selama variabel (i) kurang dari 5:

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {                        // > Java WhileLoop
            System.out.println(i);
            i++;
        }
// The Do/WhileLoop adalah varian dari loop sementara. Loop ini akan mengeksekusi blok kode satu kali, sebelum memeriksa apakah kondisinya benar, maka akan mengulang loop selama kondisinya benar, contoh:
        int o = 5;
        do {
            System.out.println(o);
            o++;
        }
        while (o < 5);
    }
}
