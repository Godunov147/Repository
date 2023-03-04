package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        if (len == 0 | len == 1){
            return;
        }
        int summa = 0;
        for(int i = 0; i < len; i++){
            int num = scanner.nextInt();
            summa = summa + num;
        }
        System.out.println(summa);

    }
}