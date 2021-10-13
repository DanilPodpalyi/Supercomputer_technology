package Lab1;
import java.util.Scanner;
public class Task6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in); //Создается класс Scanner, который позволяет пользователю взять input из консоли
            System.out.print("Введите число: "); //Вывод сообщения
            int x = in.nextInt();                //Счет числа с клавиатуры
            if (x == 0)          //х=0?
                System.out.println("Нулевое число");
            else if (x > 0 && x % 2 == 0)    //х>0 и х кратно 2?
                System.out.println("Положительное четное число");
            else if (x > 0 && x % 2 != 0)    //х>0 и х некратно 2?
                System.out.println("Положительное нечетное число");
            else if (x < 0 && x % 2 == 0)    //х<0 и х кратно 2?
                System.out.println("Отрицательное четное число");
            else if (x < 0 && x % 2 != 0)    //х<0 и х некратно 2?
                System.out.println("Отрицательное нечетное число");
        }
}
