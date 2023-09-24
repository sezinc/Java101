import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password,userName;
        int hak = 3,select,balance=1500;

        Scanner input=new Scanner(System.in);
        while(hak>0) {
            System.out.print("Kullanıcı Adı:");
            userName = input.nextLine();

            System.out.print("Parola:");
            password = input.nextLine();

            if (userName.equals("sezin") && password.equals("111")) {
                System.out.println("Sisteme Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        int pricecek = input.nextInt();
                        if(balance>pricecek){
                            balance -= pricecek;
                        }else{
                            System.out.println("Yeterli bakiyeniz yoktur.");
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    default:
                        System.out.println("Hoşçakalın!");
                }
                //System.out.println("Bakiyeniz : " + balance);
                break;

            } else {
                hak--;
                if(hak==0){
                    System.out.println("Giriş hakkınız bitti.");
                }else{
                System.out.println("Sisteme giremediniz."+ hak+" hakkınız daha var");
                }
            }
        }
    }
}