import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int taban,us,sonuc=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değeri giriniz:");
        taban=input.nextInt();
        System.out.print("Üs değeri giriniz:");
        us=input.nextInt();
        System.out.println("Sonuç: " + usdeger(taban,us));

    }

    static int usdeger(int t,int u) {

        if(u==0)
        {
            return 1;

        }else if(t==1)
        {
            return 1;
        }else {
            return t*usdeger(t,u-1);
        }


    }

}