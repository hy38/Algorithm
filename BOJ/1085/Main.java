/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.04.23
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/1085
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int nums[] = new int[4];

        for (int i = 0; i < 4; i++)
            nums[i] = Integer.parseInt(stk.nextToken());

        int ans = Math.min(nums[0], nums[2] - nums[0]);
        ans = Math.min(ans, Math.min(nums[1], nums[3] - nums[1]));

        System.out.println(ans);
    }
}
