import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число");
        int i = vvod.nextInt();
        int dec = 0;
        for (int j = 1; j < i; j++) {
            dec += j;
        }
        System.out.println("Итог: " + dec);
    }
}
