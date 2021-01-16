package forLoop;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {

        /*
        Bir sayı gir  ve o sayıya kadar olan sayılar yazdırılsın.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");

        int num=sc.nextInt();

        for (int i =0;i <=num;i++){

            System.out.println(i);
        }


    }
}
