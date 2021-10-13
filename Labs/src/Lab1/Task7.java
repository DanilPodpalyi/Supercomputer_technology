package Lab1;
import java.util.Scanner;
public class Task7 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Коды городов: 905-Москва, 194-Ростов, 491-Краснодар, 800-Киров");
            System.out.print("\nВведите код города:");
            int x = in.nextInt();
            if (x == 905) {
                System.out.println("Москва. Стоимость разговора:" + (4.15*10));
            } else if (x == 194) {
                System.out.println("Ростов. Стоимость разговора:" + (1.98*10));
            } else if (x == 491) {
                System.out.println("Краснодар. Стоимость разговора:" + (2.69*10));
            } else if (x == 800) {
                System.out.println("Киров. Стоимость разговора:" + (5*10));
            } else {
                System.out.println("Ошибка");
            }
        }
}
