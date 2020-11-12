package dev.zeeppss.javastudy;

/* Note:
default = maka akan berubah seperti semula dan apapun itu jalannya akan terpilih default!
*/

public class Switch {
    public static void main(String[] args) {
        int hari = 4;
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break; // Mencetak > Kamis
        }
        int hari2 = 2;
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Akhir pekan");
        }
    }
}
