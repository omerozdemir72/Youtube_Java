package GenelSorular;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int faktoriyel =1;

        System.out.print("Bir sayı giriniz :  ");
        int sayi = sc.nextInt();

        while (sayi>0){
            faktoriyel*=sayi;    //faktoriyel = faktoriyel * sayi
            /*
            5
            20
            60
            120

             */
            sayi--;

        }

        System.out.println("Faktoriyel :   " + faktoriyel);

    }
}
