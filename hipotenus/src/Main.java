import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değerler
        int a,b,c;
        double u,alan;
        //Kullanıcıdan bilgi al
        Scanner input=new Scanner(System.in);

        System.out.print(" 1. kenar değeri= ");
        a=input.nextInt();
        System.out.print(" 2. kenar değeri= ");
        b=input.nextInt();
        System.out.print(" 3. kenar değeri= ");
        c=input.nextInt();

        //Hipotenüs hesapla
        //c= Math.sqrt(a*a + b*b);

        //Alan hesapla
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        //Sonucu yazdır
        System.out.println(" Üçgenin alanı= " + alan);
        //System.out.println(" Üçgenin hiponetüs kenarı= " + c);

    }
}