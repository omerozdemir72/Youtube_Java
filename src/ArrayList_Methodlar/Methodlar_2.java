package ArrayList_Methodlar;

import java.util.ArrayList;
import java.util.Collections;

public class Methodlar_2 {
    public static void main(String[] args) {


        ArrayList<Integer> sayi=new ArrayList<>();
        sayi.add(5);
        sayi.add(88);
        sayi.add(4);
        sayi.add(23);

        System.out.println("-----------SIRAYA DİZME ------------- \n");
        System.out.println("ilk hali :   " + sayi);

       Collections.sort(sayi);

        System.out.println("Sıralı hali : " + sayi);


        System.out.println("--------------MAX - MİN DEĞER BULMA -------------- \n");


        System.out.println("max :  " + Collections.max(sayi));
        System.out.println("min  :  " + Collections.min(sayi));



        System.out.println("--------------Tersten yazdırma -------------- \n");

        Collections.reverse(sayi);
        System.out.println("Tersten yazdırma  : " + sayi);


        System.out.println("----------------------Listeyi belli bir eleman ile doldurma --------------- \n");


        Collections.fill(sayi,99);

        System.out.println(sayi);
    }
}
