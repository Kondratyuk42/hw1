package дз1;

public class Robot extends Wall implements Competitors {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Robot " + name + " jumps");
        passWall(name);
    }

    @Override
    public void run() {
        System.out.println("Robot " + name + " runs");
        passTrack(name);
    }
}
