package Lab1;
    import java.util.Scanner;
public class Task5 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);//Создается класс Scanner, который позволяет пользователю взять input из консоли.
            System.out.print("Введите a: ");
            int x1 = in.nextInt();                //Счет х с клавиатуры
            System.out.print("Введите b: ");
            int x2 = in.nextInt();                //Счет х с клавиатуры
            System.out.print("Введите c: ");
            int x3 = in.nextInt();                //Счет х с клавиатуры
            int min = x1;
            if (x1<x2){
                min = x1;
            }
            else {
                min = x2;
            }
            if (x3<min){
                min = x3;
            }
            System.out.print("Наименьшее число = " + min);
        }
}
