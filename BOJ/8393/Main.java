/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.03.06
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/8393
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 1; i <= num; i++) {
            ans += i;
        }

        System.out.println(ans);

    }
}
