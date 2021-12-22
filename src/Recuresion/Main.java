package Recuresion;

import java.util.Scanner;

public class Main {
    public static void main(String[] arges) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How far do you plane on walking?");
        int distance = scanner.nextInt();

        walking(0, distance);
    }

    static void walking(int i, int distance) {
        if (i < distance) {
            i++;
            System.out.println("*you take a step* :" + i + " meter/s");
            walking(i, distance);
        } else {
            System.out.println("You are done walking! :)");
        }
    }
}