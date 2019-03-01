import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}