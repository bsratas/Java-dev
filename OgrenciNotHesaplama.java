//kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)

import java.util.Scanner;

public class OgrenciNotHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç öğrenci bilgisi gireceksiniz? ");
        int ogrenciSayisi = input.nextInt();

        double toplamNot = 0;

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("\nÖğrenci #" + i + " bilgilerini girin:");
            System.out.print("Adı: ");
            String ad = input.next();
            System.out.print("Soyadı: ");
            String soyad = input.next();
            System.out.print("1. Sınav Notu: ");
            double s1 = input.nextDouble();
            System.out.print("2. Sınav Notu: ");
            double s2 = input.nextDouble();
            System.out.print("3. Sınav Notu: ");
            double s3 = input.nextDouble();

            double ortalama = (s1 + s2 + s3) / 3;
            toplamNot += ortalama;

            System.out.println("Ortalama: " + ortalama);
        }

        double sinifOrtalamasi = toplamNot / ogrenciSayisi;
        System.out.println("\nSınıf Ortalaması: " + sinifOrtalamasi);

        input.close();
    }
}