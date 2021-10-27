package Lab3;

public class Fl {
        public static void main(String[] vma){
            Flower black_rose = new Rose("Black", 80);
            Flower red_rose = new Rose("Red", 67);
            Flower white_rose = new Rose("White", 90);
            Flower 	Buttercup = new Buttercup("blue", 50);
            Flower 	Iris = new Iris("white", 35);
            Flower Chrysanthemum = new Chrysanthemum("green", 45);
            Flower[] bouquet1 = {black_rose, Buttercup, Iris};
            Flower[] bouquet2 = {red_rose, red_rose, Chrysanthemum};
            Flower[] bouquet3 ={white_rose, red_rose, red_rose};
            System.out.println(bouquet1.length+bouquet2.length+bouquet3.length);
        }

        public static class Flower {

            String color;
            int cost;

            Flower(String color, int cost){
                this.color = color;
                this.cost = cost;
            }

            public void setCost(int cost) {
            }

            public int getCost(){
                return 1;
            }

        }
        public static class Rose extends Flower{

            Rose(String color, int cost){
                super(color, cost);
            }

            @Override
            public int getCost(){
                return cost;
            }
        }

        public static class Buttercup extends Flower{

            Buttercup(String color, int cost){
                super(color, cost);
            }

            @Override
            public int getCost(){
                return cost;
            }
        }

        public static class Iris extends Flower{

            Iris(String color, int cost){
                super(color, cost);
            }

            @Override
            public int getCost(){
                return cost;
            }
        }

        public static class Chrysanthemum extends Flower{

            Chrysanthemum(String color, int cost){
                super(color, cost);
            }

            @Override
            public int getCost(){
                return cost;
            }
        }
    }
