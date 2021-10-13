package Lab1;
import java.util.Scanner;
public class Task3 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);  //Создается класс Scanner, который позволяет пользователю взять input из консоли.
            System.out.print("Введите число: ");//Вывод
            int x = in.nextInt();                 //Счет х с клавиатуры
            if (x>0) {                            //Число меньше 0?
                System.out.println("Ответ: " + (x + 1));  //Вывод х+1
            } else {
                System.out.println("Ответ: " + x);        //Вывод х
            }
        }
    }

