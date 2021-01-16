package GenelSorular;

import java.util.Scanner;

public class tekMi_CiftMi {

    public static void main(String[] args) {

        /*
        Eğer bir sayının 2'ye bölümünden kalanı 0 ise,  > çift
        2'ye bölümünden kalanı 1 ise >tek
         */

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count<3) { //eğer sonsuz döngü istiyorsak count'ları yoruma alıp while içine 'true' yazmanız yeterli.

            System.out.print("Bir sayı giriniz :   ");
            int sayi = scanner.nextInt();

            if (sayi % 2 == 0) {//2'ye bölümünden kalan 0 ise,

                System.out.println("Sayı çifttir..");
            } else
                System.out.println("Sayı tektir.");


           count++; //count'u 1 arttır. ve döngünün başına dön.

        }
    }
}
