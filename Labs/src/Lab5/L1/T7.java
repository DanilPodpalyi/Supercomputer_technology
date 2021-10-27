package Lab5.L1;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args){
        String s = "1234";
        System.out.println("Указанная последовательность символов: "+s);
        Scanner console = new Scanner (System.in);
        System.out.print("Введите строку: ");
        String t = console.next();
        System.out.println(s.equals(t));
    }
}
