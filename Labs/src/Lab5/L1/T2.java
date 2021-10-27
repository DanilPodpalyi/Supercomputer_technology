package Lab5.L1;

import java.util.ArrayList;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        removeDups(n);
    }
    public static void removeDups(String str1){
        ArrayList<Character> set=new ArrayList<Character>();
        char[] str=str1.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(!set.contains(str[i])){
                set.add(str[i]);
            }
        }
        for(char e:set)
        {
            System.out.print(e);
        }
    }
}
