public class StringBuilder_Kullanimi {
    /*
            Immutable Class nedir?
            degismeyen duragan demek
            String Class'la String olusturdugunuzda degisime kapali oluyor.

            Mutable Class nedir?
            degisime acik demek


            String str = "Java"; ==> bu degisime kapali

            StringBuilder strb = new StringBuilder ("Java"); ==> bu degisime acik

*/
    public static void main(String[] args) {

        //StringBuilder nasil olusturulur?

        //1.yol
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);



        //2.yol
        StringBuilder strb2 = new StringBuilder();

        //yol a
        strb2.append("Java");//Java
        strb2.append(" is easy");//Java is easy
        strb2.append("!!!");//Java is easy!!!
        System.out.println(strb2);

        //yol b
        strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain (Method Zinciri)
        System.out.println(strb2);//Java is easy!!! Learn Java earn money.



        //StringBuilder'larda character sayisi nasil bulunur? ==> lenght() method'u ile bulunur.
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Her sen ");
        strb3.append("cok calismalisin");
        int karakterSayisi =  strb3.length();
        System.out.println(karakterSayisi);//24



        //Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar.
        int capacity = strb3.capacity();//stabil deger her zaman 16 dan baslar
        System.out.println(capacity);//34


        strb3.setCharAt(2,'y');// ==> Index 2'de ki character'i "r" ye cevirir.
        System.out.println(strb3);//Hey sen cok calismalisin


        //delete(3,18) ==> Index 3(dahil) den index (18) haric e kadar tum characterleri siler.
        strb3.delete(0,8);
        System.out.println(strb3);//cok calismalisin


        //deleteCharAt(2) ==> Index 2 deki characteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);//co calismalisin


        //reverse() method'u StringBuilder'i ters cevirir. Ali ==> ilA
        //"mutable" larda sadece method kullanmak orijinal degeri degistirmek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3);//nisilamsilac oc


        //"Immutable" larda orijinal degeri degistirmek icin
        // method'u kullanmak yeterli olmaz bir de " atama islemi" yapmalisiniz.
        String abc ="Java";
        abc.replace("a", "i");
        System.out.println(abc);//Java


        //atama yaptiktan sonra yazdirirsaniz jivi yazdirir
        String abcd ="Java";
        abcd = abcd.replace("a", "i");
        System.out.println(abcd);//Jivi


        //toString() method'u StringBuilder'lari String'e cevirir.
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);//nisilamsilac oc
        //(parantezin icine . koyun data tipinin degistigini goreceksiniz. append() methodu gozukmeyecek)


        //String'den de StringBuilder'a asagidaki gibi donebilirsiniz.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);//nisilamsilac oc
        //parantez icine nokta koyup append'ler oldugunu gorurseniz StringBuilderdir.


        //insert (3, "XXXX"); 3. character'den sonra "XXXX" leri koyar
        strb4.insert(3,"BBBB");
        System.out.println(strb4);//nisBBBBilamsilac oc


        //inser (3, ""KLMOPQRSTU", 5, 8) ==> 3. character'den sonra "KLMOPQRSTU" String'inin index 5,6,7 deki character'lerini yerlestirir.
        strb4.insert(3, "KLMOPQRSTU", 5,8);
        System.out.println(strb4);//xxxQRSBBBBxxxxxxxxxxxxxaC


        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");


        //a.compareTo(b); method'u
        //i)StringBuilder'lar tamamiyla ayni ise 0 verir.
        //ii) a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir.
        //iii) a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir.
        int sonuc = a.compareTo(b);
        System.out.println("sonuc = " + sonuc);//0


    }

    /*
        1)StringBuffer Java'da bir class'dir be String olusturmaya yarar.
        2)StringBuffer Class, StringBuilder Class gibi "mutable" dir.

        StringBuffer ile StringBuilder in farki nedir?
        1)StringBuffer "thread-safe" dir.
        2)StringBuffer "syncronized" dir.

        Senaryolar
        1)Deistirilemez data icin "String Class" kullanilir.
        2)Degistirilebilir ama "multi-thread" gerekmeyen durumlar icin "String Builder" kullanilir.
        3)Degistirelebilir ve "multi-thread" gereken durumlar icin "StringBuffer" kullanilir.




     */

}
