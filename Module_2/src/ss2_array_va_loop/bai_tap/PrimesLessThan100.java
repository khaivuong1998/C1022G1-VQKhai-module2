package ss2_array_va_loop.bai_tap;

public class PrimesLessThan100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int count = 0;
            if (i >= 2) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                }
            }
        }
    }
}
