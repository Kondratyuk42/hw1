package ррц2.animals;

public class Dog extends Animals {

    public Dog(String name) {
        this.name = name;

    }

    @Override
    public void run(int obs) {
        if (obs > 500) {
            System.out.println(name + " run " + 500 + "m");
        } else {
            System.out.println(name + " run " + obs + "m");
        }
    }

    @Override
    public void swim(int obs) {
        if (obs > 10) {
            System.out.println(name + " swam " + 10 + "m");
        } else {
            System.out.println(name + " swam " + obs + "m");
        }
    }
}
