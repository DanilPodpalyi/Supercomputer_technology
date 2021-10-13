package Lab1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //Создается класс Scanner, который позволяет пользователю взять input из консоли.
        System.out.print("Введите число: "); //Вывод сообщения
        int x = in.nextInt();              //Создается класс x, в который записывается число с клавиатуры
        System.out.print(x%10);            //Выводится остаток от деления х на 10
    }
}