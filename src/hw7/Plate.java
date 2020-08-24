package hw7;

public class Plate {
    private int food;
    public boolean catSatiety;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (checkFood(amount) == true) {
            food -= amount;
            catSatiety = true;
        } else {
            System.out.println(" No food avaible");
            catSatiety = false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';

    }

    public boolean checkFood(int amount) {
        return (food - amount) >= 0;
    }

    public void isCatSatiety(String cat) {
        System.out.println(cat + " isn't hungry = " + catSatiety);
    }
    public void addFood(int addAmount){
        food += addAmount;
    }
}
