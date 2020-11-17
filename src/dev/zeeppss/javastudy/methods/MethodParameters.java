package dev.zeeppss.javastudy.methods;

/*
Informasi dapat diteruskan ke metode sebagai parameter. Parameter bertindak sebagai variabel di dalam metode.

Parameter ditentukan setelah nama metode, di dalam tanda kurung. Anda dapat menambahkan parameter sebanyak yang Anda inginkan, cukup pisahkan dengan koma.

Contoh berikut memiliki metode yang mengambil String yang disebut fname sebagai parameter. Ketika metode ini dipanggil, kami meneruskan nama depan, yang digunakan di dalam metode untuk mencetak nama lengkap:
*/

public class MethodParameters {
    static void myMethod(String nama) {
        System.out.println(nama + " Love");
    }

    public static void main(String[] args) {
        myMethod("Lxnser");
        myMethod("Vensiee");

        /*
        Mencetak > Lxnser Love
        Mencetak > Vensiee Love
        */
    }
}

class MultipleParameters {
    static void myMethod(String nama, int age) {
        System.out.println(nama + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Zeeppss", 15);
        myMethod("Unknown", 14);

        /*
        Mencetak > Zeeppss is 15
        Mencetak > Unknown is 14
        */
    }
}

class ReturnValues {
    static int myMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5));
        /*
        x = 5
        5 + x(5) = Mencetak > 10
        */
    }
}
