package Lab1;
import java.util.Scanner;
public class Task2 {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in); //Создается класс Scanner, который позволяет пользователю взять input из консоли.
            System.out.print("Введите число: "); //Вывод
            int x = in.nextInt();                //Счет х с клавиатуры
            System.out.println("Ответ: " + (x%10 + x/10%10 + x/100)); //Сумма чисел
        }
    }
