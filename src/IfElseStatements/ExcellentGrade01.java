package IfElseStatements;

import java.util.Scanner;

public class ExcellentGrade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        if (a >= 5) {
            System.out.println("Excellent!");
        }
    }
}