package com.sda.bunny;

import java.util.Scanner;

public class BunnyCounter {

    static int i = 2;

    public static void main(String[] args) {
        System.out.println("Insert months number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bNop = 0, bNo = 1;
        System.out.println(bunnyCounterRecurence(n, bNo, bNop));
        System.out.println(bunnyCounter(n, bNo, bNop));
    }

    static int bunnyCounterRecurence(int n, int bNo, int bNop) {
        int tmp = bNo + bNop;
        bNop = bNo;
        bNo = tmp;
        i++;

        if (i <= n) {

            return bunnyCounterRecurence(n, bNo, bNop);
        } else {
            return bNo;
        }
    }

    static int bunnyCounter(int n, int bNo, int bNop) {

        for (int j = 2; j <= n; j++) {
            int tmp = bNo + bNop;
            bNop = bNo;
            bNo = tmp;
        }
        return bNo;
    }


}
