import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner (System.in);
        System.out.println("Введите значение точки А(х1;у1)");
        int x1 = vvod.nextInt();
        int y1 = vvod.nextInt();
        System.out.println("Введите значение точки А(х2;у2)");
        int x2 = vvod.nextInt();
        int y2 = vvod.nextInt();
        System.out.println("Введите значение точки А(х3;у3)");
        int x3 = vvod.nextInt();
        int y3 = vvod.nextInt();
        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1)))
        {
            System.out.println("Точки расположены на одной прямой");
        }
        else
        {
            System.out.println("Точки не расположены на одной прямой");
        }
    }
}
