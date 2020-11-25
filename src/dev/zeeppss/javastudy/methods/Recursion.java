package dev.zeeppss.javastudy.methods;

/*
Rekursi adalah teknik membuat pemanggilan fungsi itu sendiri. Teknik ini memberikan cara untuk memecah masalah yang rumit menjadi masalah sederhana yang lebih mudah dipecahkan.

Rekursi ini mungkin agak sulit dipahami. Cara terbaik untuk mengetahui cara kerjanya adalah dengan bereksperimen dengannya, contoh:
*/

public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
