import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[9];
        int[] result = new int[7];
        for (int i = 0; i < 9; i++) {
            a[i] = input.nextInt();
        }

        outerloop:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == i) continue;
                for (int k = 0; k < 7; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < 6; l++) {
                        if (l == i || l == j || l == k) continue;
                        for (int m = 0; m < 5; m++) {
                            if (m == i || m == j || m == k || m == l) continue;
                            for (int n = 0; n < 4; n++) {
                                if (n == i || n == j || n == k || n == l || n == m) continue;
                                for (int o = 0; o < 3; o++) {
                                    if (o == i || o == j || o == k || o == l || o == m || o == n) continue;
                                    if (a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] == 100) {
                                        result[0] = a[i];
                                        result[1] = a[j];
                                        result[2] = a[k];
                                        result[3] = a[l];
                                        result[4] = a[m];
                                        result[5] = a[n];
                                        result[6] = a[o];
                                        break outerloop;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Arrays.sort(result);
        for(int i=0; i<7; i++)
            System.out.println(result[i]);
    }
}
