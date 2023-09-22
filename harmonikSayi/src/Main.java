import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner input=new Scanner(System.in);
        System.out.println("N sayısını giriniz:");
        N=input.nextInt();
        double result=0.0;
        for(double i=1.0;i<=N;i++){
            result+=(1/i);
        }
        System.out.println(result);

    }
}