package ru.job4j.io;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 11;
        int count = 0;
        System.out.println("Игра 11 спичек!");
        System.out.println("Два игрока по очереди берут от 1 до 3 спичек.");
        while (value > 0) {
            System.out.println("Введите пожалуйста число!");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Вы ввели некоректное чило, введите от 1 до 3!");
                continue;
            }
            value = value - select;
            count++;
            System.out.println("Осталось " + " " + value + " " + "спичек");
        }
        if (count % 2 == 0) {
            System.out.println("Победил Игорь!");
        } else {
            System.out.println("Победил Иван!");
        }
    }
}
