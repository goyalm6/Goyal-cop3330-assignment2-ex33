/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 33
 *  Copyright 2021 Mayank Goyal
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your question?");
        String question = scanner.nextLine();

        String response = getAnswer();
        System.out.println();
        System.out.println(response);
    }

    static String getAnswer() {
        Random random = new Random();
        String[] resArr = {"Yes","No","Maybe","Ask again later"};

        int randomResponseIndex = random.nextInt(resArr.length);
        String response = resArr[randomResponseIndex];
        return response;
    }
}
