package Lab1;

public class Task8 {
    public static void main(String[] args) {
        int mas[] = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2}; //Массив
        System.out.print("Массив: [ ");
        for (int i: mas){
            System.out.print(i + " ");
        }
        System.out.print(" ]");
        int Max = 0;
        int SumP = 0;
        int SumNC = 0;
        int CountP = 0;
        int SumM = 0;
        int CountN = 0;
        for (int elem : mas) {
            if (elem > Max) {
                Max=elem;
            }
            if (elem > 0){
                SumP+=elem;
                CountP+=1;
            }
            if (elem < 0){
                if( elem % 2 == 0){
                    SumNC+=elem;
                }
                CountN+=1;
                SumM+=elem;
            }
        }
        System.out.println();
        System.out.println("Максимальное значение = " + Max);
        System.out.println("Сумма положительных элемнтов = " + SumP);
        System.out.println("Сумма четных отрицательных элементов = " + SumNC);
        System.out.println("Количество положительных элементов = " + CountP);
        System.out.println("Среднее арифметическое отрицательных элементов = " + (SumM/CountN));
    }
}
