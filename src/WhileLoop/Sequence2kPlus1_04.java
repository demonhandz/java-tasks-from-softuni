package WhileLoop;

import java.util.Scanner;

public class Sequence2kPlus1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n = 8
        int n = Integer.parseInt(scanner.nextLine());

        int k = 1;

        while (k <= n) {
            System.out.println(k);
            // 2k + 1
            k = 2 * k + 1;
        }
    }
}
