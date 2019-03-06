/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.03.06
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/10818
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        //  input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        int nums[] = new int[T];
        for (int i = 0; i < T; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int min=nums[0];
        int max = min;

        //  get min/max
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }

        //  output
        System.out.println(min + " " + max);

    }
}
