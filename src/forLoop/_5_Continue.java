package forLoop;

import javax.swing.plaf.IconUIResource;

public class _5_Continue {
    public static void main(String[] args) {

        /*
        Bir döngüde belirtilen bir durumu atlamaj, yok saymak

         */

        int toplamVeri = 20;

        for (int i = 0; i <toplamVeri ; i++) {

            if (i==15){
                continue;
            }
            System.out.println("Verilerim :  " + i);

        }


        for (int i = 20; i >=0 ; i--) {

            if (i==12){
                continue; //12 yi atla
            }
            if (i==4){
                break;
            }

            System.out.println(i);
        }

    }
}
