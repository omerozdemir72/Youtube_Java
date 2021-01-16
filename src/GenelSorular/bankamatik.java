package GenelSorular;

import java.util.Scanner;

public class bankamatik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bakiye = 1000;

        int islem;

        System.out.println("1. Bakiye Görüntüle");
        System.out.println("2.Para Yatırma");
        System.out.println("3.Para Çekme");
        System.out.println("4.Sistemden Çıkış");

        islem= sc.nextInt();


        switch (islem){ //eğer işlem,
            case 1:
                System.out.println("Bakiyeniz :  " + bakiye   + " TL");
            break;
            case 2:
                System.out.println("Ne kadar para yatıracaksınız ?");
                int miktar =sc.nextInt();
                bakiye+=miktar;   // bakiye = bakiye + miktar
                System.out.println("Yeni bakiye :   " + bakiye + " TL");

                break;
            case 3:
                System.out.println("Ne kadar para çekeceksiniz ?");
                miktar=sc.nextInt();
                bakiye-=miktar; //bakiye = bakiye - miktar

                System.out.println("Yeni bakiye : " + bakiye + " TL");
                break;

            case 4:
                System.out.println("Sistemden çıkılıyor............");
                break;

            default:
                System.out.println("HATALI TUŞLAMA YAPTINIZ :(");
        }



    }
}
