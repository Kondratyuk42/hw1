package ррц2.animals;

public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void swim(int obs) {
        System.out.println("cats can't swim");
    }

    @Override
    public void run(int obs) {
        if (obs > 200) {
            System.out.println(name + " run " + 200 + "m");
        } else {
            System.out.println(name + " run " + obs + "m");
        }
    }
}
