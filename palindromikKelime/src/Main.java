import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static String isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String kelime;
        Scanner input=new Scanner(System.in);
        kelime=input.nextLine();
        if(isPalindrome(kelime))
            System.out.println("\'"+kelime+"\'"+" kelimesi palindromiktir.");
        else{

            System.out.println("\'"+kelime+"\'"+" kelimesi palindromik değildir.");

            System.out.println("Çünkü tersten yazılışı: "+"\'"+isPalindrome2(kelime)+"\'"+" şeklindedir.");

        }

    }
}