import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите значения отрезка а, b");
        int a = vvod.nextInt(), b = vvod.nextInt();
        System.out.println("Введите шаг h");
        int h = vvod.nextInt();
        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                System.out.println("x = " + x + ", y = " + x);
            } else {
                System.out.println("x = " + x + ", y = " + (-x));
            }
        }

    }
}
