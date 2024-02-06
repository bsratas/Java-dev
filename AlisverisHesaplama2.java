// kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.(Input için Scanner ve döngü için for döngüsü kullanınız)

import java.util.Scanner;

public class AlisverisHesaplama2 {
    public static void main(String[] args) {
        Scanner nesne = new Scanner(System.in);

        System.out.print("Kaç ürün almak istiyorsunuz? ");
        int urunSayisi = nesne.nextInt();

        double toplamTutar = 0.0;

        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print(i + ". ürünün fiyatı: ");
            double urunFiyati = nesne.nextDouble();
            toplamTutar += urunFiyati;
        }

        System.out.println("Toplam alışveriş tutarı: " + toplamTutar + " TL");

        nesne.close();
    }
}
