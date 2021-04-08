import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите x");
        double x = vvod.nextDouble();
        if (x <= 3)
        {
            System.out.println((Math.pow(x, 2) - 3 * x + 9));
        }
        else
        {
            String str = String.format("%.5f", 1 / (Math.pow(x, 3) + 6));
            System.out.println(str);
        }
    }
}
