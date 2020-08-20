package ррц2;

public class Ссотрудники {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Ссотрудники(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info(){
        System.out.printf("name %s position %s email %s phone %s salary %d age %d\n", name, position, email, phone, salary, age);
    }
}
