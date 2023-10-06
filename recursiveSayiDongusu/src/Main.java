import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,sayac=1;
        boolean kontrol=false;

        Scanner input =new Scanner(System.in);
        sayi = input.nextInt();

        dizin(sayi,sayac,kontrol);

    }

    static void dizin(int num,int i,boolean checkZero){//checkZero kontrol if number is again bigger than zero than continue adding 5

        System.out.print(num+" ");

        if(num >0 && !checkZero) {
            i++;
            dizin(num - 5, i,false);

        }else {
            i--;
            if(i>0){
               // System.out.print("i("+i+")");
                dizin(num +5,i,true);
            }
        }
    }
}