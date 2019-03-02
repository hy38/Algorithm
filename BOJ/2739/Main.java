/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.03.02
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/2739
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 1; i < 10; i++)
            System.out.println(T + " * " + i + " = " + T*i);
    }
}
