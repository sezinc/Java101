/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü

C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        double nF=1,rF=1,nMinusrF=1;

        Scanner input=new Scanner(System.in);

        System.out.print("n:");
        n=input.nextInt();
        System.out.print("r:");
        r=input.nextInt();

        // n! / (r! * (n-r)!)
        for(int i=1;i<=n;i++){
              nF*=i;
        }
        for(int i=1;i<=r;i++){
            rF*=i;
        }
        for(int i=1;i<=(n-r);i++){
            nMinusrF*=i;
        }
        System.out.println("C(n,r):"+ nF/(rF*nMinusrF));

    }
}

