package Lab5.L1;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args){
        System.out.print("Введите строки: ");
        Scanner console = new Scanner (System.in);
        String s = console.next();
        String t = console.next();
        permutation1(s,t);
    }
    public static void permutation1(String s, String t) {
        if (s.length() != t.length()) {
            System.out.print(false);
        } else {
            int[] letters = new int[256];

            char[] s_array = s.toCharArray();
            for (char c : s_array) {
                letters[c]++;
            }

            for (int i = 0; i < t.length(); i++) {
                int c = (int) t.charAt(i);
                if (--letters[c] < 0) {
                    System.out.print(false);
                }
                else{
                    System.out.print(true);
                }
            }


        }
    }
}
