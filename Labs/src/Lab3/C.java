package Lab3;

public class C {
    public static void main(String[] vma) {

    }

    void printInfo(Car car){
        System.out.println("Марка автомобиля: " + car.mark + "Класс автомобиля: " + car.clas + "Вес автомобиля: " + car.weight + "Двигатель автомобиля: " + car.motor.eff + " " + car.motor.pow);
    }

    public abstract class Car{

        String mark;
        String clas;
        int weight;
        Engine motor;

        abstract void start();
        abstract void stop();

        void turnLeft(){
            System.out.println("Поворот налево");
        }

        void turnRight(){
            System.out.println("Поворот направо");
        }
    }

    public static class Engine{
        int pow;
        int eff;
    }

    public class Lorry extends Car {

        String maxWiegth;

        @Override
        void start(){
            System.out.println("Грузовик поехал");
        }

        @Override
        void stop(){
            System.out.println("Грузовик остановился");
        }

    }

    public class SportCar extends Car {

        String maxWSpeed;

        @Override
        void start(){
            System.out.println("SportCar поехал");
        }

        @Override
        void stop(){
            System.out.println("SportCar остановился");
        }

    }
}
