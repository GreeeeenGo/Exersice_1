public class Ex1_4 {
    public static void main(String[] args) {
        double number = 123.456;
        double left = Math.floor(number), right = number - left;
        String str = String.format("%.3f", left/1000 + right*1000);
        System.out.println("Исходное число " + number + ", форматированное число = " + str);
    }
}
