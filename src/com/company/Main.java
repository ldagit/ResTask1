package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int Num, Res =0, i;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        Num = in.nextInt();

        System.out.println("Таблица умножения для числа " + Num + " :");
        for (i = 2; i < 11; ++i) {
            Res = Num * i;
            System.out.printf("%d * %d = %d\n", Num, i, Res);
        }
    }
}
