/*
 * Author: SangHyun Park (hy38)
 * Date: 2019.03.05
 * E-mail: sanghyun12101@gmail.com
 *
 * https://github.com/hy38/Algorithm
 * https://www.acmicpc.net/problem/1924
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_month = input.nextInt();
        int input_day = input.nextInt();

        int month_to_day[] = new int[13];
        int sum_of_days = 0;
        for(int i=1; i<8; i+=2) //  1, 3, 5, 7월은 31일
            month_to_day[i] = 31;
        month_to_day[2] = 28;   //  2월은 28일
        for(int i=8; i<13; i+=2)    //  8, 10, 12월은 31일
            month_to_day[i] = 31;
        for(int i=1; i<13; i++) //  나머지는 30일
            if(month_to_day[i]==0) month_to_day[i] = 30;

        for(int i=1; i<input_month; i++){
            sum_of_days += month_to_day[i];
        }
        sum_of_days += input_day - 1;
        int mod = sum_of_days % 7;
        switch (mod){
            case 0: System.out.println("MON"); break;
            case 1: System.out.println("TUE"); break;
            case 2: System.out.println("WED"); break;
            case 3: System.out.println("THU"); break;
            case 4: System.out.println("FRI"); break;
            case 5: System.out.println("SAT"); break;
            case 6: System.out.println("SUN"); break;
        }
        
    }
}
