package forLoop;

import java.util.Scanner;

public class _4_Break {
    public static void main(String[] args) {

        /*
        Döngümüz devam ederken istedigimiz bir durumda döngüyü bitirmesi,döngünün dışına atması
         */

        for (int i = 0; i < 10; i++) {

            System.out.println(i);

            if (i==5){//eğer i 5 değerini alırsa döngüden dışarı cıkart.
                break;
            }
        }


        Scanner sc = new Scanner(System.in);


        for (; ;){//sonsuz döngü

            System.out.print("Yazı giriniz :");

            String yazi = sc.nextLine();

            System.out.println(yazi);

            if (yazi.contains("a")){

                break;
            }
        }


    }
}
