import java.math.BigDecimal;

public class Ex3_4 {
    public static void main(String[] args) {
         BigDecimal b = BigDecimal.ONE;
        for (int i = 1; i < 201; i++) {
            b = b.multiply(BigDecimal.valueOf(i*i));
        }
        System.out.println(b);
    }
}