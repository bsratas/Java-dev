// Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner nesne = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int sayi = nesne.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }

        if (sayi == toplam) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }
        nesne.close();
    }
}