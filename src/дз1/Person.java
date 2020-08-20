package дз1;

public class Person extends Wall implements Competitors {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Person " + name + " jumps");
        passWall(name);
    }

    @Override
    public void run() {
        System.out.println("Person " + name + " runs");
        passTrack(name);
    }

}
