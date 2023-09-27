import java.util.Scanner;

/*Java ile klavyeden girilen N tane sayma sayısından
 en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.*/
public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?:");
        n = input.nextInt();
        int enBuyuk = 0, enKucuk = 0;

        for (int i = 1; i <= n; i++) {
            int sayi;
            System.out.print(i + ". sayıyı giriniz:");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            } else if (enKucuk > sayi) {
                enKucuk = sayi;
            }
            //System.out.println(sayi);
        }

        System.out.println("En büyük sayı:" + enBuyuk);
        System.out.println("En küçük sayı:" + enKucuk);
    }


}