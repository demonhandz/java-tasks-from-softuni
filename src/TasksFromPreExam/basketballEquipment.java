package TasksFromPreExam;

import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualTax = Integer.parseInt(scanner.nextLine());

        // double sneakers = annualTax - (0.4 * annualTax);
        double sneakers = annualTax * 0.6;

        // double outfit = sneakers - (0.2 * sneakers);
        double outfit = sneakers * 0.8;

        double ball = outfit / 4;

        double accessories =  ball /5;

        double totalExpenses = annualTax + sneakers + outfit + ball + accessories;

        System.out.printf("%.2f", totalExpenses);
    }
}


