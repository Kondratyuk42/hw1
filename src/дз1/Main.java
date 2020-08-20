package дз1;

public class Main {
    public static void main(String[] args) {
        Competitors[] competitors = {
                new Cat("Barsik"),
                new Robot("CH4"),
                new Person("Dima")
        };
        for (Competitors c : competitors) {
            c.jump();
            c.run();
        }
    }
}
