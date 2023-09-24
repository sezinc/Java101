import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,ebob=0,ekok=0;
        Scanner input=new Scanner(System.in);

        System.out.print("İlk sayı:");
        a=input.nextInt();

        System.out.print("İkinci sayı:");
        b=input.nextInt();

       /* for(int i=1;i<a;i++){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                ebob=i;

            }
        }
        for(int j=a;j>1;j--){
            if(a%j==0 && b%j==0){
                ebob=j;
                break;
            }
        }*/
        int j =a;
        while(j>1){
            if(a%j==0 && b%j==0){
                ebob=j;
                break;
            }
            j--;
        }
/*
        for(int i =1;i<=(a*b);i++){
            if(i%a == 0 && i % b ==0){
                ekok=i;
                break;
            }
        }*/
        int i =1;
        while (i<=(a*b)){
            if(i%a == 0 && i % b ==0){
                ekok=i;
                break;
            }
            i++;
        }
        System.out.println("ebob:"+ebob);
        System.out.println("ekok:"+ekok);

    }
}