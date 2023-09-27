import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi=input.nextInt();

        for(int i=1;i<=sayi;i++){
            if(sayi%i==0)
            {
                if(sayi!=i) {
                    toplam = toplam + i;
                   // System.out.print("i:" + i);
                   // System.out.println("toplam:" + toplam);
                }
            }
        }
        if(toplam==sayi){
        System.out.println(sayi+" Mükemmel Sayıdır!");
        }else {
            System.out.println(sayi + " Mükemmel Sayı Değidir!");
        }
    }
}