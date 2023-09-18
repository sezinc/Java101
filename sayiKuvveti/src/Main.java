
/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

 */

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi=input.nextInt();

       for(int i=1,j=1; i<=sayi; i*=4,j*=5)
        {
            System.out.println(i);
            if(i!=j) System.out.println(j);

        }

    }
}