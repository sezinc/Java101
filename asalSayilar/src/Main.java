public class Main {
    public static void main(String[] args) {
        boolean check=false;

        for (int sayi=2;sayi<=100;sayi++) {

         // System.out.println(sayi+ "sayısının carpanları");
            int sayac=0;
          for (int i = 2; i <= 100; i++) {

                if (sayi % i == 0) {
                 //   System.out.println(i + ",");
                    sayac++;
                }

              //System.out.println(sayac);
            }
            //System.out.println(sayac);
            if(sayac==1)System.out.print(sayi+" ");
        }
    }
}
