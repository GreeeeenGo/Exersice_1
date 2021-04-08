import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первый угол");
        int c1 = vvod.nextInt();
        System.out.println("Введите второй угол");
        int c2 = vvod.nextInt();
        if (c1 > 0 && c2 > 0 && (360 - c1 - c2) > 0) {
            if (c1 == 90 || c2 == 90 || (360 - c1 - c2) == 90 )
                System.out.println("Треугольник существует, треугольник прямоугольный");
                else
                System.out.println("Треугольник существует, треугольник не прямоугольный");
        }
        else
            System.out.println("Треугольника не существует");
    }
}
