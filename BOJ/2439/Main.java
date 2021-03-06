/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.03.10
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/2439
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            for (int j = T - i; j > 1; j--)
                System.out.print(" ");

            for (int k = 0; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
