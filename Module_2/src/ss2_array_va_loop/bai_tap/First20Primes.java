package ss2_array_va_loop.bai_tap;


public class First20Primes {
    public static void main(String[] args) {
        int countSNT = 0;
        int i = 2;
        while (i >= 2 && countSNT < 20) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                countSNT++;
            }
            i++;
        }
    }
}
