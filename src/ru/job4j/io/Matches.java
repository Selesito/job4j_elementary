package ru.job4j.io;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 11;
        String name = null;
        System.out.println("Игра 11 спичек!");
        System.out.println("Два игрока по очереди берут от 1 до 3 спичек.");
        while (value > 0) {
            System.out.println("Игорь введите количество спичек");
            int playerOne = Integer.valueOf(input.nextLine());
            if (playerOne < 1 || playerOne > 3) {
                System.out.println("Вы ввели некоректное чило, введите от 1 до 3!");
                continue;
            }
            value = value - playerOne;
            if (value <= 0) {
                System.out.println("Осталось 0 спичек");
                name = "Игорь победил!";
                break;
            }
            System.out.println("Осталось " + " " + value + " " + "спичек");
            System.out.println("Иван введите количество спичек");
            int playerTwo = Integer.valueOf(input.nextLine());
            if (playerTwo < 1 || playerTwo > 3) {
                System.out.println("Вы ввели некоректное чило, введите от 1 до 3!");
                continue;
            }
            value = value - playerTwo;
            if (value <= 0) {
                System.out.println("Осталось 0 спичек");
                name = "Иван победил!";
                break;
            }
            System.out.println("Осталось " + " " + value + " " + "спичек");
        }
        System.out.println(name);
    }
}
