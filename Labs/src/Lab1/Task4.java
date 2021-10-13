package Lab1;
import java.util.Scanner;
public class Task4 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);//Создается класс Scanner, который позволяет пользователю взять input из консоли.
            System.out.print("Введите число: ");//Вывод
            int x = in.nextInt();  //Счет х с клавиатуры
            if (x>0) {
                System.out.println("Ответ: " + (x + 1));
            } else if (x<0){
                System.out.println("Ответ: " + (x - 2));
            } else {
                System.out.println("Ответ: 10");
            }
        }
}
