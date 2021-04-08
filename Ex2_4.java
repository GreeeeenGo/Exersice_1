import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите стороны отверстия А и В");
        int A = vvod.nextInt();
        int B = vvod.nextInt();
        System.out.println("Введите размеры кирпича (x, y, z)");
        int x = vvod.nextInt();
        int y = vvod.nextInt();
        int z = vvod.nextInt();
        if (x <= A && y<= B || x <= A && z <= B || y <= A && z <= B || x <= B && y <= A || x <= B && y <= B || y <= B && z <= A)
            System.out.println("Кирпич пройдет через отверстие");
        else
            System.out.println("Кирпич не пройдет через отверстие");
    }
}
