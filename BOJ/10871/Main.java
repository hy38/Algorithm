/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.03.16
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/10871
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int T = Integer.parseInt(stk.nextToken());
        int max = Integer.parseInt(stk.nextToken());

        int nums[] = new int[T];
        stk = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            nums[i] = Integer.parseInt(stk.nextToken());
            if (nums[i] < max) System.out.print(nums[i] + " ");
        }

    }
}
