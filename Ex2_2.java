import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите a");
        int a = vvod.nextInt();
        System.out.println("Введите b");
        int b = vvod.nextInt();
        System.out.println("Введите c");
        int c = vvod.nextInt();
        System.out.println("Введите d");
        int d = vvod.nextInt();
        if (a > b && c > d) {
            if (b > d)
                System.out.println("Число " + b + " большее из минимальных");
            else
                System.out.println("Число " + d + " большее из минимальных");
        } else if (a < b && c > d) {
            if (a > d)
                System.out.println("Число " + a + " большее из минимальных");
            else
                System.out.println("Число " + d + " большее из минимальных");
        } else if (a < b && c < d)
        {
            if (a > c)
                System.out.println("Число " + a + " большее из минимальных");
            else
                System.out.println("Число " + c + " большее из минимальных");
        }
                else if (a > b && c < d)
        {
            if (b > c)
                System.out.println("Число " + b + " большее из минимальных");
            else
                System.out.println("Число " + c + " большее из минимальных");
        }
    }
}
