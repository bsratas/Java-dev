//String metotlarını araştırınız. Her bir metot için örnek yapınız.

import java.util.Arrays;

public class Stringler {
    public static void main(String[] args) {

        //charAt(): Belirtilen sıradaki karakteri alır. Örneğin:
        String metin = "Merhaba";
        char karakter = metin.charAt(1);
        System.out.println("Sonuc: " + karakter);

        //codePointAt(): Belirtilen sıradaki karakterin Unicode değerini döndürür. Örneğin:
        String metin2 = "Hello";
        int unicode = metin2.codePointAt(2);
        System.out.println("Sonuc: " + unicode);

        //codePointBefore(): Belirtilen sıradaki karakterin önceki karakterin Unicode değerini döndürür. Örneğin:
        String metin3 = "Hello";
        int unicode2 = metin3.codePointBefore(2); 
        System.out.println("Sonuc: " + unicode2);

        //codePointCount(): Belirtilen metin aralığındaki Unicode karakter sayısını döndürür. Örneğin:
        String metin4 = "Merhaba";
        int karakterSayisi = metin4.codePointCount(1, 5);
        System.out.println("Sonuc: " + karakterSayisi);

        //compareTo(): İki dizgeyi sözlükbilimsel olarak karşılaştırır. Sonuç, büyükse pozitif, eşitse 0, küçükse negatif olur. Örneğin:
        String a = "abc";
        String b = "abd";
        int sonuc = a.compareTo(b);
        System.out.println("Sonuc: " + sonuc);

        //compareToIgnoreCase(): Büyük/küçük harf farkını göz ardı ederek iki dizgeyi karşılaştırır. Örneğin:
        String x = "Merhaba";
        String y = "merhaba";
        int sonuc2 = x.compareToIgnoreCase(y);
        System.out.println("Sonuc: " + sonuc2);
    
        //concat(): Bir dizgenin sonuna başka bir karakter ekler. Örneğin:
        String ilk = "Merhaba";
        String ikinci = " Dünya";
        String birlesik = ilk.concat(ikinci);
        System.out.println("Sonuc: " + birlesik);
    
        //contains(): Bir dizgenin belirli bir karakter dizisini içerip içermediğini kontrol eder. Örneğin:
        String metin5 = "Bu bir örnek metindir.";
        boolean icindeVarMi = metin5.contains("örnek");
        System.out.println("Sonuc: " + icindeVarMi);
    
        //contentEquals(): Bir dizgenin belirtilen CharSequence veya StringBuffer ile aynı karakter dizisini içerip içermediğini kontrol eder. Örneğin:
        String metin6 = "Merhaba";
        boolean esitMi = metin6.contentEquals(new StringBuffer("Merhaba"));
        System.out.println("Sonuc: " + esitMi);
    
        //copyValueOf(): Karakter dizisinin karakterlerini temsil eden bir dizi döndürür. Örneğin:
        char[] karakterler = {'H', 'e', 'l', 'l', 'o'};
        String metin7 = String.copyValueOf(karakterler);
        System.out.println("Sonuc: " + metin7);

        //toLowerCase() ve toUpperCase(): Bu metodlar, karakterleri büyük harf yapmak veya küçültmek için kullanılır. Örneğin:
        String metin8 = "Merhaba Dünya";
        String kucukHarfli = metin8.toLowerCase();
        String buyukHarfli = metin8.toUpperCase();
        System.out.println("Sonuc: " + kucukHarfli);
        System.out.println("Sonuc: " + buyukHarfli);

        //indexOf() ve lastIndexOf(): Bu metodlar, bir karakteri veya alt dizesini arar ve bulduğu indeksi döndürür. Örneğin:
        String metin9 = "Merhaba Dünya";
        int ilkIndex = metin9.indexOf('a'); 
        int sonIndex = metin9.lastIndexOf('a'); 
        System.out.println("Sonuc: " + ilkIndex);
        System.out.println("Sonuc: " + sonIndex);

       //equals() ve equalsIgnoreCase(): İki dizgeyi karşılaştırır. equals(): Büyük/küçük harf duyarlıdır. equalsIgnoreCase(): Büyük/küçük harf farkını göz ardı eder.Örneğin:
       String c = "elma";
       String d = "Elma";
       boolean esitMi2 = c.equals(d); 
       boolean esitMiIgnoreCase = c.equalsIgnoreCase(d);
       System.out.println("Sonuc: " + esitMi2);
       System.out.println("Sonuc: " + esitMiIgnoreCase);

        //substring(): Bir dizgenin belirli bir bölümünü alır.Örneğin:
        String ornekMetin = "Bu bir örnek metindir.";
        String altDizi = ornekMetin.substring(3);
        System.out.println("Sonuc: " + altDizi);

        //endsWith(): Bu metot, bir dize (string) belirli bir alt dize (substring) ile bitip bitmediğini kontrol eder. Örneğin:
        String text = "Hello, World!";
        boolean endsWithExclamation = text.endsWith("!");
        System.out.println("Sonuc: " + endsWithExclamation);

        //format(): Bu metot, bir dizeyi belirli bir biçimde (format) düzenler. Örneğin:
        String formatted = String.format("Merhaba benim adım %s ve ben %d yaşındayım", "Büşra", 27);
        System.out.println("Sonuc: " + formatted);

        //getBytes(): Bu metot, bir dizeyi baytlara dönüştürür. Örneğin:
        String text2 = "Hello World!";
        byte[] byteArray = text2.getBytes();
        System.out.println("Sonuc: " + byteArray);

        //getChars(): Bu metot, belirli bir dizenin karakterlerini bir karakter dizisine kopyalar. Örneğin:
        String text3 = "Hello World!";
        char[] charArray = new char[5];
        text3.getChars(0, 5, charArray, 0);
        System.out.println("Sonuc: " + new String(charArray));

        //hashCode(): Bu metot, bir dizenin karma değerini döndürür. Örneğin:
        String text4 = "Hello World!";
        int hash = text4.hashCode();
        System.out.println("Sonuc: " + hash);

        //intern(): Bu metot, bir dizeyi havuzda (string pool) arar ve varsa referansını döndürür. Örneğin:
        String yazi = "Hello World!";
        String internedText = yazi.intern();
        System.out.println("Sonuc: " + internedText);

        //isEmpty(): Bu metot, bir dizenin boş olup olmadığını kontrol eder. Örneğin:
        String yazi2 = " ";
        boolean isEmpty = yazi2.isEmpty();
        System.out.println("Sonuc: " + isEmpty);

        //length(): Bu metot, bir dizenin karakter sayısını döndürür. Örneğin:
        String yazi3 = "Hello World!";
        int length = yazi3.length();
        System.out.println("Sonuc: " + length);

        //matches(): Bu metot, bir dizenin belirli bir düzeni (regex) karşılayıp karşılamadığını kontrol eder. Örneğin:
        String text5 = "MerhabaDünya";
        boolean matches = text5.matches("[A-Za-z]+");
        System.out.println("Dize harf karakterlerinden mi oluşuyor? " + matches);

        //offsetByCodePoints(): Bu metot, bir dizenin belirli bir kod noktasından itibaren kaç karakter ilerlediğini hesaplar. Örneğin:
        String text6 = "MerhabaDünya";
        int offset = text6.offsetByCodePoints(0, 5); 
        System.out.println("Sonuc: " + offset);

        //regionMatches(): Bu metod, iki dize bölgesinin eşit olup olmadığını test eder. Bir dize içindeki bir alt dizeyi, başka bir dize içindeki başka bir alt dizeyle karşılaştırır. Örneğin:
        String s1 = "Bu bir örnek metindir.";
        String s2 = "örnek";
        boolean esitMi3 = s1.regionMatches(true, 7, s2, 0, 5);
        System.out.println("S1 ile S2'nin karşılaştırılması sonucu: " + esitMi3);

        //replace(): Bu metod, bir dizede belirli bir karakteri veya alt dizesini başka bir karakter veya alt dizesiyle değiştirir. Örneğin:
        String original = "Merhaba, dünya!";
        String replaced = original.replace("dünya", "Java");
        System.out.println("Değiştirilmiş dize: " + replaced);

        //replaceFirst(): Bu metod, bir dizede ilk bulunan belirli bir alt dizeyi başka bir alt dizeyle değiştirir. Örneğin:
        String text7 = "Merhaba, dünya! Dünya harika.";
        String replacedFirst = text7.replaceFirst("dünya", "Java");
        System.out.println("İlk bulunan 'dünya' değiştirildi: " + replacedFirst);

        //replaceAll(): Bu metod, bir dizede tüm bulunan belirli alt dizeleri başka bir alt dizeyle değiştirir. Örneğin:
        String text8 = "Merhaba, dünya! Dünya harika.";
        String replacedAll = text8.replaceAll("dünya", "Java");
        System.out.println("Tüm 'dünya'lar değiştirildi: " + replacedAll);

        //split(): Bu metod, bir dizeyi belirli bir ayraç karakterine göre böler ve alt dize dizisi olarak döndürür. Örneğin:
        String sentence = "Bu bir örnek cümle.";
        String[] words = sentence.split(" ");
        System.out.println("Kelimeler: " + Arrays.toString(words));

        //startsWith(): Bu metod, bir dizenin belirli bir alt dizeyle başlayıp başlamadığını kontrol eder. Örneğin:
        String text9 = "Merhaba, dünya!";
        boolean startsWithHello = text9.startsWith("Merhaba");
        System.out.println("Metin 'Merhaba' ile başlıyor mu? " + startsWithHello);

        //subSequence(): Bu metod, bir dizenin belirli bir alt dizisini alt dize olarak döndürür. Örneğin:
        String original2 = "Bu bir örnek metindir.";
        CharSequence sub = original2.subSequence(7, 12);
        System.out.println("Alt dize: " + sub);

        //substring(): Bu metod, bir dizenin belirli bir alt dizesini kesip çıkarır. Örneğin:
        String original3 = "Bu bir metindir.";
        String subString = original3.substring(7, 12);
        System.out.println("Alt dize: " + subString);

        //toCharArray(): Bu metod, bir dizeyi karakter dizisine dönüştürür. Örneğin:
        String yazi4 = "Merhaba, dünya!";
        char[] charArray2 = yazi4.toCharArray();
        System.out.println("Karakter dizisi: " + Arrays.toString(charArray2));

        //toString(): Bu metod, bir nesnenin dize temsilini döndürür. Örneğin:
        int number = 42;
        String numberString = Integer.toString(number);
        System.out.println("Sayının dize temsili: " + numberString);

        //trim(): Bu metod, bir dizenin başındaki ve sonundaki boşlukları kaldırır. Örneğin:
        String yazi5 = "   Bu bir örnek metindir.   ";
        String trimmed = yazi5.trim();
        System.out.println("Kesilmiş dize: " + trimmed);

        //valueOf(): Bu metod, farklı veri türlerini dizeye dönüştürür. Örneğin:
        int number2 = 42;
        String numberString2 = String.valueOf(number2);
        System.out.println("Sayının dize temsili: " + numberString2);

    }
}
