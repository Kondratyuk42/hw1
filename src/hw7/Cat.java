package hw7;

public class Cat {
    private String name;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        System.out.println(name + " eat");
        plate.decreaseFood(10);
        plate.isCatSatiety(name);
    }
}
