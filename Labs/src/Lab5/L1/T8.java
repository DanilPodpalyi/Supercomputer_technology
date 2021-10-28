package Lab5.L1;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args){
        System.out.print("Введите первую строку: ");
        Scanner console = new Scanner (System.in);
        String s = console.next();
        System.out.print("Введите вторую строку: ");
        String t = console.next();
        String reverse = "";
        for ( int i = t.length() - 1;i>=t.length()-s.length() ; i-- ) {
            reverse = t.charAt(i)+reverse ;
        }
        System.out.println(s.equals(reverse));
    }

}
