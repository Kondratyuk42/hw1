import ррц2.Ссотрудники;

public class Main {
    public static void main(String[] args) {
        Ссотрудники emp1 = new Ссотрудники("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 37000, 30);
        Ссотрудники emp2 = new Ссотрудники("Sergeev Sergey", "Programmer", "sesergey@mailbox.com", "894657284", 50000, 45);
        Ссотрудники emp3 = new Ссотрудники("Sidorov Petr", "Programmer", "sipetr@mailbox.com", "893756285", 50000, 40);
        Ссотрудники emp4 = new Ссотрудники("Dubkov Nicolay", "Secretary", "dunicolay@mailbox.com", "895737592", 30000, 25);
        Ссотрудники emp5 = new Ссотрудники("Gorina Anastasya", "Manager", "goanastasya@mailbox.com", "896738592", 40000, 35);

        System.out.println("Все сотрудники :");
        emp1.info();
        emp2.info();
        emp3.info();
        emp4.info();
        emp5.info();


        Ссотрудники[] emps = new Ссотрудники[5];
        emps[0] = new Ссотрудники("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 37000, 30);
        emps[1] = new Ссотрудники("Sergeev Sergey", "Programmer", "sesergey@mailbox.com", "894657284", 50000, 45);
        emps[2] = new Ссотрудники("Sidorov Petr", "Programmer", "sipetr@mailbox.com", "893756285", 50000, 40);
        emps[3] = new Ссотрудники("Dubkov Nicolay", "Secretary", "dunicolay@mailbox.com", "895737592", 30000, 25);
        emps[4] = new Ссотрудники("Gorina Anastasya", "Manager", "goanastasya@mailbox.com", "896738592", 40000, 35);

        System.out.println(" Сотрудники старше 40 :");
        for (int i = 0; i <emps.length ; i++) {
            if(emps[i].getAge()>40) {
                emps[i].info();
            }
        }
    }

}
