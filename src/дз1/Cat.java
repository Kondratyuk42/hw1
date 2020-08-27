package дз1;

public class Cat extends Wall implements Competitors {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Cat " + name + " jumps");
        passWall(name);
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " runs");
        passTrack(name);
    }
}
