import java.util.Scanner;

/*
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/
public class Main {
    public static void main(String[] args) {

        int havaDerece;
        Scanner input=new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz= ");
        havaDerece=input.nextInt();

        if(havaDerece>25)                        //25'den büyük olma durumu
        {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
        else                                     //25'den küçük olma durumu
        {
            if(havaDerece>15)                    //25'den küçük ve 15'den büyük olma durumu
            {
                System.out.println("Pikniğe gidebilirsiniz");
            }
            else                                 //25'den küçük ve 15'den küçük olma durumu
            {
                if(havaDerece>5)                //15'den küçük ve 5'den büyük olma durumu(25'den küçük aynı zamanda)
                {
                    System.out.println("Sinemaya gidebilirsiniz");
                }
                else                           //5'den küçük olma durumu
                {
                    System.out.println("Kayak yapmaya gidebilirsiniz");
                }
            }


        }
    }
}