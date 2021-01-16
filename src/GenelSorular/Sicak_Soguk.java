package GenelSorular;

import java.util.Random;
import java.util.Scanner;

public class Sicak_Soguk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomSayi = random.nextInt(10); //sayı 0 ile 10 arası random olacaktır.

        int count = 0;
        int count2 = 2;

        while (count<3){

            System.out.print("Tahmin giriniz :   ");
            int tahmin = sc.nextInt();

            if (tahmin<randomSayi){
                System.out.println("Daha büyük düşün !!");
                if (count2==0){ System.out.println("Hakkın kalmadı.");
                } else
                    System.out.println(count2 +" hakkın kaldı..");
            }
            else if (tahmin>randomSayi) {
                System.out.println("Daha küçük düşün !!");
                if (count2 == 0) {
                    System.out.println("Hakkın kalmadı.");
                } else
                    System.out.println(count2 + " hakkın kaldı..");
            }else {
                System.out.println("BİLDİN !!");
                break;
            }
            count++;
            count2--;
        }


        System.out.println("RANDOM SAYI :    " + randomSayi);




    }
}
