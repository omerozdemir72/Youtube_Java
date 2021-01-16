package forLoop;

public class yildizKulesi {
    public static void main(String[] args) {


        for (int row = 1; row<=10; row++){

            for (int star =10;star>=1;star--){
                if (star>=row){
                    System.out.print("*");
                }else
                    System.out.print(" ");

            }
            System.out.println();
        }


    }
}
