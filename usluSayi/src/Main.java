import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,sayi,sonuc=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı:");
        sayi=input.nextInt();
        System.out.print("Üs:");
        n=input.nextInt();

        for(int i =1;i<=n;i++)
        {
            sonuc*=sayi;
        }

        System.out.println("Sonuç:"+sonuc);
    }
}