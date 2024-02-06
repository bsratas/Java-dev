// Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.

//While Döngüsü: While döngüsü, belirli bir koşul sağlandığı sürece bir kod bloğunu tekrar tekrar çalıştırır. Döngü başladığında, koşul kontrol edilir.

public class DoWhileDongusu {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
        System.out.print(i + " ");
        i++;
        }


        //Do-While döngüsü, koşulun döngü sonunda kontrol edildiği bir yapıdır.İlk olarak kod bloğu çalıştırılır, ardından koşul kontrol edilir.

        int a = 1;
        do {
        System.out.print(a + ",");
        a++;
        } while (a <= 5);
    }


}
