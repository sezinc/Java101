import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        String artik=" artık bir yıldır !",artikDegil=" artık bir yıl değildir !";

        Scanner input=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil=input.nextInt();

        if(yil%4 ==0 ) {                         //4'e bölünebiliyorsa
            if(yil%100==0){
                if(yil%400==0) System.out.println(yil + artik);
                else System.out.println(yil + artikDegil);
            }else System.out.println(yil + artik);

        }else {
            System.out.println(yil + artikDegil);
        }
    }
}