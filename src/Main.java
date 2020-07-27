import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guess();

    }
    public static void guess(){
        int k = 0;
        int x;
        System.out.println("Угадайте число от 1 до 9");
        int number = rand.nextInt(10);
        for(int i = 0; i<3; i++) {
            int input = sc.nextInt();
            if(input > number){
                System.out.println("Загаданное число меньше");
            }
            if(input < number){
                System.out.println("Загаданное число больше");
            }
            if(input == number) {
                System.out.println("ВЫ победили");
                k++;
                break;
            }
        }
        if(k==0){
            System.out.println("Вы проиграли");
        }
        System.out.println("Если хотите сыграть еще - нажмите 1, иначе - 0");
        x = sc.nextInt();
        if(x==1){
            guess();
        }
    }
}
