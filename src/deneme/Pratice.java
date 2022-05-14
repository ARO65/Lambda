package deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Pratice {
    public static void main(String[] args) {
        List<String> l= new ArrayList<>(Arrays.asList("küşleme", "adana", "trileçe", "havucDilim", "buryan",
                "yaglama", "kokareç", "arabAşı", "güveç", "waffle", "welemen", "cacix"));
        lsteElmnlrAlftkBykTkrsrsz(   l);
        System.out.println("\n******1");
        lsteElmnlrKarektrSysTersirali( l);
        System.out.println("\n******2");
        lsteElmnlrKarektrSysGorKtenBYSirali( l);
        System.out.println("\n******3");
        sonHrfBkSirala( l);
        System.out.println("\n******4");
        charKaresiCiftElSirala(l);
        System.out.println("\n******5");
        harfSayisi7denAzKontrol(l);
        System.out.println("\n******6");
        wIleBaslayanElKontrol(l);
        System.out.println("\n******7");
        xIleBitenElKontrol( l);
        System.out.println("\n******8");
        enBykElmn(l);
        System.out.println("\n******9");
        ilkElHarcSonHrfSiraliPrint(l);
        System.out.println("\n******10");

    }
    // Task 1: List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

    public static void lsteElmnlrAlftkBykTkrsrsz(  List<String> l){
       l .//akıs kaynagı
                stream().//akısa girdi
                //map(t->t.toUpperCase()).//Jamb.Ex  elemanlar buyuk harf update edildi
                        map(String::toUpperCase).//Meth.Ref elemanlar buyuk harf update edildi
                sorted().//alafabetik(natural dogal) sıra yapıldı
                distinct().// benzersiz: tekrarsız hale getirildi
                forEach(t -> System.out.print(t + " "));//print
      //2,yol(       ********* mustafaca)
                //   l.stream().sorted().map(String::toUpperCase).distinct().forEach(t->System.out.print(t+" "));

    }
    // Task 2: list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void lsteElmnlrKarektrSysTersirali(List<String> l){
        l.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(t->System.out.print(t+" "));
    }
    //Task3 : List elemanlarini character sayisina gore kckten byk e gore print ediniz..

    public static void lsteElmnlrKarektrSysGorK (List<String> l){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      tenBYSirali(List<String> l)

            l.stream().sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t + " "));

        }
        // Task 4: list elemanlarinin son harfine gore ters sirali print ediniz.

    public static void sonHrfBkSirala(List<String> l){
        l.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).forEach(t ->System.out.print(t+" "));


    }



    // Task 5: listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

    public static void  charKaresiCiftElSirala(List<String> l){
        l.
                stream().//akısa alndı
                map(t -> t.length() * t.length()).//akısdaki string elemanları boyutlarının karesine update edildi
                filter(t->t%2==0).//cift elelmalar filtrelendi
                distinct().//tekrarsız yapıldı
                sorted(Comparator.reverseOrder()).//ters b->k sıra yapıldı
                forEach(t->System.out.print(t+" "));// print edildi
    }



    //Task 6: List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void harfSayisi7denAzKontrol(List<String> l){
      System.out.println(l.stream().allMatch(t -> t.length() <= 7) ? "yes" : "no");


    }
    public static void wIleBaslayanElKontrol(List<String> l) {


        // Task 7: List elelmanlarinin "W" ile baslamasını kontrol ediniz.

        System.out.println(l.stream().map(String::toUpperCase).noneMatch(t -> t.startsWith("w")) ? "yes" : "no");
    }

    // Task 8: List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xIleBitenElKontrol(List<String> l) {
        System.out.println(l.stream().anyMatch(t -> t.endsWith("x")) ? "vardır" : "yoktur");


    }

    // Task 9: Karakter sayisi en buyuk elemani yazdiriniz.
    public static void enBykElmn(List<String> l) {
        System.out.println(l.stream().max(Comparator.comparing(String::length)).get());


    }

    // Task 10: list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

    public static void ilkElHarcSonHrfSiraliPrint(List<String> l) {

       l.stream().sorted(Comparator.comparing(t -> t.toString().charAt(t.length() - 1))).skip(1).forEach(t ->System.out.print(t+" "));

    }


}

