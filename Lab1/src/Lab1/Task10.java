package Lab1;

public class Task10 {
    public static void main(String[] args) {
        int mas[] = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};  //Массив
        System.out.print("Исходный массив: [ "); //Исходник
        for (int i : mas) {
            System.out.print(i + " ");
        }
        System.out.println(" ]"); //Закрыть и перевести
        int a = mas.length;
        int i = 0;
        int j = 0;
        while (i < a) {
            if (mas[i] != 0) { //Ловим ненули
                mas[j++] = mas[i]; //Перекидываем не нули, либо на то же место, либо на отстающее место
            }
            i = i + 1;
        }
        while (j < a) {
            mas[j++] = 0;  //Добиваем нехватку
        }
        System.out.print("Измененный массив: [ ");

        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ]");
    }
}