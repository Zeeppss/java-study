package dev.zeeppss.javastudy.methods;

/*
myMethod() = nama metode
static = berarti bahwa metode tersebut milik kelas MyClass dan bukan objek dari kelas MyClass.
void = berarti metode ini tidak memiliki nilai pengembalian.
*/

public class Method {
    static void myMethod() {
        System.out.println("method");
    }

    public static void main(String[] args) {
        myMethod(); // Mencetak > Method
        // atau bisa lebih
        myMethod();
        myMethod();
    }
}
