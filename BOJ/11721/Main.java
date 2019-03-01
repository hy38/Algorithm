import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        for(int i=0; i<word.length(); i++){
            if(i != 0 && i % 10 == 0) System.out.println();
            System.out.print(word.charAt(i));
        }
    }
}
