package Lab5.L2;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        HEHE(n);
    }

    public static void HEHE(String n){
        String back = "";
        String front = "";
        front = front + n.charAt(0)+n.charAt(1);
        int i = n.length()-1;
        back = back + n.charAt(i-1)+n.charAt(i);
        if (front.equals(back))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
