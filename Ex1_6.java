import java.util.Scanner;

public class Ex1_6 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите x");
        int x = vvod.nextInt();
        System.out.println("Введите y");
        int y = vvod.nextInt();
        if (x > 0 && y > 0)
        {
            if (x <= 2 && y <= 4)
            {
                System.out.println("Принадлежит закрашенной области.");
            }
            else
            {
                System.out.println("Не принадлежит закрашенной области.");
            }
        }
        else if (x < 0 && y > 0)
        {
            if (x >= -2 && y <= 4)
            {
                System.out.println("Принадлежит закрашенной области.");
            }
            else
            {
                System.out.println("Не принадлежит закрашенной области.");
            }
        }
        else if (x < 0 && y < 0)
        {
            if (x >= -4 && y >= -3)
            {
                System.out.println("Принадлежит закрашенной области.");
            }
            else
            {
                System.out.println("Не принадлежит закрашенной области.");
            }
        }
        else if (x > 0 && y < 0)
        {
            if (x <= 4 && y >= -3)
            {
                System.out.println("Принадлежит закрашенной области.");
            }
            else
            {
                System.out.println("Не принадлежит закрашенной области.");
            }
        }
        else
        {
            System.out.println("Некорректные величины");
        }
    }
}
