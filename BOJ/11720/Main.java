import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String num = input.next();
        int sum = 0;
        for (int i = 0; i < T; i++)
            sum = sum + num.charAt(i) - 48;

        System.out.println(sum);
    }
}