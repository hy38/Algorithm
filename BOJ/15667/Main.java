/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.05.02
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/15667
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input_num = Integer.parseInt(br.readLine());

        for (int i = 0; i < 101; i++) {
            if (i * (i + 1) == input_num - 1) System.out.println(i);
        }

    }
}
