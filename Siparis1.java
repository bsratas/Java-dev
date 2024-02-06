//1- Switch case ile müşteriden alınan sipariş numarasına göre hangi ürünün sipariş edildiğini belirleyen algoritma yazınız.Input için Scanner kullanınız

import java.util.Scanner;

public class Siparis1 {
    public static void main(String[] args) {
        Scanner nesne = new Scanner(System.in);
       
        System.out.print("Sipariş numarasını girin: ");
        int siparisNumarasi = nesne.nextInt();

        String urun;

        switch (siparisNumarasi) {
            case 1:
                urun = "T-shirt";
                break;
            case 2:
                urun = "Kot Pantolon";
                break;
            case 3:
                urun = "Spor Ayakkabı";
                break;
            case 4:
                urun = "Akıllı Telefon";
                break;
            case 5:
                urun = "Saat";
                break;
            default:
                urun = "Geçersiz Sipariş Numarası";
                break;
    }

    System.out.println("Sipariş edilen ürün: " + urun);
    nesne.close();
}
}
