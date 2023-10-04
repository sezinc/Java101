import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int sayi){
        int temp=sayi,reverseNo=0,lastNo;
        while (temp!=0){
            lastNo=temp%10;
            reverseNo=(reverseNo*10) + lastNo;
            temp/=10;

        }
       // System.out.println(reverseNo);
        if (sayi==reverseNo)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi=input.nextInt();
        if(isPalindrom(sayi))
            System.out.println("Sayı palindrom bir sayıdır.");
        else
            System.out.println("Sayı palindrom bir sayı değildir.");
    }
}