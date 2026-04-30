import java.util.Scanner;

public class LockerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n < 1 || n > 1000000000) {
            input.close();
            return;
        }

        // Loop through all possible square numbers
        for (int i = 1; i * i <= n; i++) {
            int openLocker = i * i;
            System.out.print(openLocker);

            // Space between numbers
            if ((i + 1) * (i + 1) <= n) {
                System.out.print(" ");
            }
        }

        input.close();
    }
}