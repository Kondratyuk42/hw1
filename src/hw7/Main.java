package hw7;

public class Main {
    public static void main(String[] args) {

//Cat cat = new Cat("Chernish");
        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("Mursik"),
                new Cat("Rijik"),
        };

        Plate plate = new Plate(10);
        plate.addFood(15);
        System.out.println(plate);
        /*cat.eat(plate);
        System.out.println(plate);*/
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(plate);
        }
    }
}
