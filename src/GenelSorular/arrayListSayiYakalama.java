package GenelSorular;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListSayiYakalama {

    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();

        int count = 0;
        for (int i = 0; i <10 ; i++) {

            a.add((int) (Math.random() * 100 + 1)); //100 e kadar random eleman ekle
            if (a.get(i) < 20) {
                System.out.println("20 den küçük olanlar :   " + a.get(i));
                count++;
            }
        }
        Collections.sort(a);

        if (count==0){

            System.out.println("20 den küçük sayı yoktur.");
        }

        System.out.println();
        System.out.println(a);






    }
}
