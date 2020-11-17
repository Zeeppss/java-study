package dev.zeeppss.javastudy.methods;

// Dengan metode overloading, beberapa metode dapat memiliki nama yang sama dengan parameter berbeda, contoh:
/*
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
*/

public class MethodOverloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        /*
        Mencetak:
        int: 13
        double: 10.559999999999999
        */
    }
}