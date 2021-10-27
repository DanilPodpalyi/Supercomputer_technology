package Lab5.L2;

import java.util.Scanner;

public class T3 {
    static final int NOOFCHARS = 256;
    static char get2ndMostFreq(String str1) {
        int[] ctr = new int[NOOFCHARS];
        int i;
        for (i = 0; i < str1.length(); i++)
            (ctr[str1.charAt(i)]) ++;
        int ctr_first = 0, ctr_second = 0;
        for (i = 0; i < NOOFCHARS; i++) {
            if (ctr[i] > ctr[ctr_first]) {
                ctr_second = ctr_first;
                ctr_first = i;
            } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
                ctr_second = i;
        }
        return (char) ctr_second;
    }
    public static void main(String args[]) {
        System.out.print("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String str1  = console.next();
        char res = get2ndMostFreq(str1);
        if (res !='\0')
            System.out.println("Второй по популярности символ: " + res);
        else
            System.out.println("Нет, его тут нет.");
    }
}