package GenelSorular;


import java.util.Scanner;

public class VucudKitleIndeksi {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        System.out.print("Boy :  (Metre cinsinden) örn: 1,70 >>>   ");

        float boy = sc.nextFloat();

        System.out.print("Kilo : >>>>>   ");
        float kilo = sc.nextFloat();

        float kitle = kilo/(boy * boy);

        System.out.println("Vücud kitle indeksiniz :   " + kitle);


        if (kitle<18.5){
            System.out.println("Vücud kitle indeksinize göre durumunuz : Zayıf.");
        }else if (kitle>=18.5 && kitle<=24.9){

            System.out.println("Vücud kitle indeksinize göre durumunuz: Normal");
        }else if (kitle>24.9 && kitle<=29.9){//iki kosulun da saglanması zorunludur.
            System.out.println("Vücud kitle indeksinize göre durumunuz: Kilolu :(");
        }else if (kitle>29.9 && kitle<=34.9){
            System.out.println("Vücud kitle indeksinize göre durumunuz : 1. Derece Obez" );
        }




    }

}
