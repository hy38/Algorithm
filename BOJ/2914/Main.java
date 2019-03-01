import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int songs = input.nextInt();
        int avg = input.nextInt();

        int result = (avg-1) * songs + 1;

        System.out.println(result);
    }
}
