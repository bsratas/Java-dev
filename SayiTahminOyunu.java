//Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.(While döngüsü ile yapınız ve rastgele sayı üretmek için Random sınıfını kullanınız)

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner nesne = new Scanner(System.in);
        Random rastgele = new Random();
        int rastgele_sayi = 1 + rastgele.nextInt(10);

        System.out.println("Rastgele sayı 1 ile 10 arasındadır.");
        int tahmin, sayac = 0;

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            tahmin = nesne.nextInt();

            if (tahmin > rastgele_sayi) {
                System.out.println("Sayıyı küçültün.");
            } else if (tahmin < rastgele_sayi) {
                System.out.println("Sayıyı büyütün.");
            } else {
                System.out.println("Tebrikler! " + sayac + ". denemede sayıyı buldunuz.");
                break;
            }

            sayac++;
        }
        nesne.close();
    }
   
}