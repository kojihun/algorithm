package cse.my_name.algorithm;

import java.io.*;
import java.util.*;

/**
 * @author Kojihun (알고리즘 트레이닝북) 3n+1문제
 */
public class Main {

    public static int calculation(int inputnum, int resultnum, int cycle) {
        int result;

        if (inputnum % 2 == 0) {
            inputnum = inputnum / 2;
            cycle++;
            if (inputnum == 1) {
                return cycle;
            } else {
                result = calculation(inputnum, 1, cycle);
            }
        } else {
            inputnum = (inputnum * 3) + 1;
            cycle++;
            if (inputnum == 1) {
                return cycle;
            } else {
                result = calculation(inputnum, 1, cycle);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int startnum = sc.nextInt(); //시작 값
        int endnum = sc.nextInt(); //끝 값
        int cycle = 1; //사이클 길이
        int result; //calculation 결과 값
        int max_result = 0; //최대 사이클 결과 값
        
        for (int i = startnum; i <= endnum; i++) {
            result = calculation(i, 1, cycle);
            if (max_result < result) {
                max_result = result;
            }
        }

        System.out.println(startnum + " " + endnum + " " + max_result);
    }
}