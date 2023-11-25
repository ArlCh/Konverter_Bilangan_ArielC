package konverter.bilangan;
import java.util.Scanner;

public class KonverterBilangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("=========================================");
            System.out.println("Pilih konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("9. Exit");
            System.out.println("=========================================");
            System.out.println("Keterangan:");
            System.out.println("- Hanya masukkan angka '0' dan '1'\n  untuk bilangan biner");
            System.out.println("- Hanya masukkan angka '1-9' dan alfabet\n  'A,B,C,D,E,F' untuk bilangan Hexa");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda\t\t: ");
            
            int pilihan = in.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan bilangan biner\t\t: ");
                    String biner = in.next();
                    int panjang = biner.length();
                    int total = 0;
                    int urutan;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = biner.charAt(i);
                        if (angka == '1') {
                            urutan = (int) Math.pow(2, panjang - i - 1);
                            total += urutan;
                        }
                    }
                    System.out.println("Hasil konversi\t\t\t: " + total);
                }
                case 2 -> {
                    System.out.print("Masukkan bilangan desimal\t: ");
                    int desimal = in.nextInt();
                    String biner = "";
                    while (desimal > 0) {
                        int sisa = desimal % 2;
                        biner = sisa + biner;
                        desimal = desimal / 2;
                    }
                    System.out.println("Hasil konversi\t\t\t: " + biner);
                }
                case 3 -> {
                    System.out.print("Masukkan bilangan biner\t\t: ");
                    String biner = in.next();
                    int panjang = biner.length();
                    int total = 0;
                    int urutan;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = biner.charAt(i);
                        if (angka == '1') {
                            urutan = (int) Math.pow(2, panjang - i - 1);
                            total += urutan;
                        }
                    }
                    int desimal = total;
                    String heksa = "";
                    while (desimal > 0) {
                        int sisa = desimal % 16;
                        char hexhuruf = (sisa < 10) ? (char) (sisa + '0') : (char) ('A' + sisa - 10);
                        heksa = hexhuruf + heksa;
                        desimal = desimal / 16;
                    }
                    System.out.println("Hasil konversi\t\t\t: " + heksa);
                }
                case 4 -> {
                    System.out.print("Masukkan bilangan Heksadesimal\t: ");
                    String heksa = in.next();
                    int panjang = heksa.length();
                    int total = 0;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = heksa.charAt(i);
                        int digit;
                        if (Character.isDigit(angka)) {
                            digit = angka - '0';
                        } else {
                            digit = angka - 'A' + 10;
                        }
                        int urutan = (int) Math.pow(16, panjang - i - 1);
                        total += digit * urutan;
                    }
                    int desimal = total;
                    String biner = "";
                    while (desimal > 0) {
                        int sisa = desimal % 2;
                        biner = sisa + biner;
                        desimal = desimal / 2;
                    }
                    System.out.println("Hasil konversi\t\t\t: " + biner);
                }
                case 5 -> {
                    System.out.print("Masukkan bilangan desimal\t: ");
                    int desimal = in.nextInt();
                    String heksa = "";
                    while (desimal > 0) {
                        int sisa = desimal % 16;
                        char hexhuruf = (sisa < 10) ? (char) (sisa + '0') : (char) ('A' + sisa - 10);
                        heksa = hexhuruf + heksa;
                        desimal = desimal / 16;
                    }
                    System.out.println("Hasil konversi\t\t\t: " + heksa);
                }
                case 6 -> {
                    System.out.print("Masukkan bilangan Heksadesimal\t: ");
                    String heksa = in.next();
                    int panjang = heksa.length();
                    int total = 0;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = heksa.charAt(i);
                        int digit;
                        if (Character.isDigit(angka)) {
                            digit = angka - '0';
                        } else {
                            digit = angka - 'A' + 10;
                        }
                        int urutan = (int) Math.pow(16, panjang - i - 1);
                        total += digit * urutan;
                    }
                    System.out.println("Hasil konversi\t\t\t: " + total);
                }
                case 9 ->{
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println("=========================================");
        }
    }
}