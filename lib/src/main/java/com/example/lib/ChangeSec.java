package com.example.lib;

import java.util.Scanner;

public class ChangeSec {

    private Scanner scanner = new Scanner(System.in);
    private int total,hr,min,sec = 0;

    public int getTotal(int i){
        System.out.printf("請輸入第 %d 時間小時數\n",i);
        hr = scanner.nextInt();
        System.out.printf("請輸入第 %d 時間分鐘數\n",i);
        min = scanner.nextInt();
        System.out.printf("請輸入第 %d 時間秒數\n",i);
        sec = scanner.nextInt();
        total=hr*3600+min*60+sec;
        return total;
    }

}
