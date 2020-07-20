public class Main {
    public static void main(String[] args) {
        float f = 9.8f;
        int i = 8;
        byte b = 124;
        double d = 1.23456789;
        char c = 'a';
        boolean bool = true;
        short s = 2345;
        long l = 4294967296L;
       /* System.out.println(f);
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(s);
        System.out.println(l);*/
        System.out.println(alg(5, 3, 4,2));
        System.out.println(sum(10, 10));
        zero(-3);
        System.out.println(pos_neg(-4));
        hiName("Камилла");
        leap(7);
    }

    public static float alg(float a, float b, float c, float d){
        float alg=a*(b+(c/d));
        return alg;
    }

    public static boolean sum(int a, int b){
        int sum = a + b;
        return sum>=10 && sum<=20;
    }

    public static void zero(int a){
        if (a>=0) System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }

    public static boolean pos_neg(int a){
        return a<0;
    }

    public static void hiName(String name) {
        System.out.println("Привет, " + name);
    }

    public static void leap(int a){
        if ( a%4==0 && a%100!=0 || a%400==0)
            System.out.println("Високосный");
        else System.out.println("Не високосный");
    }
    }
