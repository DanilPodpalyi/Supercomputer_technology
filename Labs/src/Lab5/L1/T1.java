package Lab5.L1;
import java.util.Scanner;
public class T1 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        Printpalindrome(n);

    }

    public static void Printpalindrome(String n){
        String reverse = "";
        for ( int i = n.length() - 1; i >= 0; i-- ) {
            reverse = reverse + n.charAt(i);
        }
        if (n.equals(reverse))
            System.out.println("Введенная строка - палиндром.");
        else
            System.out.println("Введенная строка - не палиндром.");
    }
}
