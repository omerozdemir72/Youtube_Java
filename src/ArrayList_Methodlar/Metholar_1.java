package ArrayList_Methodlar;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Metholar_1 {
    public static void main(String[] args) {


        ArrayList<String> str = new ArrayList<>();
        ArrayList<Integer> intAr = new ArrayList<>();

        System.out.println("--------Eleman Ekleme  --------- \n");

        str.add("Ömer");
        str.add("Ahmet");
        str.add("Sema");
        str.add("Hüseyin");
        str.add("Fatih");


        intAr.add(1);
        intAr.add(2);
        intAr.add(3);
        intAr.add(4);
        intAr.add(5);

        System.out.println("String arraylistim :   " + str);
        System.out.println("integer ArrayListim  :" + intAr);

        /*
        Teker teker elemanları yazdırmak istiyorsak:
         */
//        for (int i =0; i<str.size();i++){
//
//            System.out.println(str.get(i));
//        }

        System.out.println("-----------Arraylist uzunlugunu bulma ----------- \n");


        System.out.println("Str 'nin eleman sayısı:   " + str.size());
        System.out.println("IntArr 'in eleman sayısı:   " +intAr.size());


        System.out.println("---------Indeksteki elemanı çağırma ------------- \n");


        System.out.println("Str -- 2. indeksteki elemanı ver :  " + str.get(2));
        System.out.println("IntArr - 4. indeksteki elemanı ver :  " + intAr.get(4));


        System.out.println("-------------Indeksteki elemanı değiştirme  ----------- \n");



        str.set(2,"Mehmet");
        System.out.println("Yeni hali :  " + str) ;


        intAr.set(2,9999);
        System.out.println("Yeni hali :   " + intAr);


        System.out.println("Arraylist'in boş olup olmadıgını check etme --------VE LİSTEYİ TEMİZLEME-----------------");


        System.out.println("1. liste boş mu ? " +  str.isEmpty());//true verirse boştur, false verirse bos degildir.

     //   str.clear();

        System.out.println("Liste boş mu ? "+ str.isEmpty()) ;
        System.out.println(str);


        System.out.println(" \n ----------              BİR ELEMANIN İNDEKSİNİ BULMA     ---------   \n" ); //0'dan başlar
        intAr.add(4,2);
        System.out.println("ilk hali :  " + intAr);




        System.out.println("'2' elemanı kacıncı indekste ?   " + intAr.indexOf(2));


        System.out.println("2 elemanını sondan ara :   " + intAr.lastIndexOf(2));

        System.out.println();


        System.out.println("-----------------ELEMAN SİLME --------------- \n");


        str.remove(3);

        System.out.println(str);


        System.out.println("2 ayrı listeyi birbirinden cıkarmak -------------------- \n");

        ArrayList<String> a = new ArrayList<>();
        ArrayList<String > b = new ArrayList<>();

        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");

        System.out.println("a arraylisti :   " + a);

        b.add("C");
        b.add("D");
        b.add("E");
        b.add("F");


        System.out.println("b arraylisti = " + b);




        a.removeAll(b); //A'dan b yi çıkart.

        System.out.println(a);




    }



}
