package TasksFromPreExam;

import java.util.Scanner;

public class worldSnooker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());
        String trophyPhoto = scanner.nextLine();

        double finalPrice = 0;

        switch ((stage)) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    finalPrice = 55.50 * ticketCount;
                } else if ("Premium".equals(ticketType)) { // recommended
                    finalPrice = 105.20 * ticketCount;
                } else if ("VIP".equals(ticketType)) {
                    finalPrice = 118.90 * ticketCount;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    finalPrice = 75.88 * ticketCount;
                } else if ("Premium".equals(ticketType)) { // recommended
                    finalPrice = 125.22 * ticketCount;
                } else if ("VIP".equals(ticketType)) {
                    finalPrice = 300.40 * ticketCount;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    finalPrice = 110.10 * ticketCount;
                } else if ("Premium".equals(ticketType)) { // recommended
                    finalPrice = 160.66 * ticketCount;
                } else if ("VIP".equals(ticketType)) {
                    finalPrice = 400 * ticketCount;
                }
                break;
        }

        if (finalPrice > 4000) {
            finalPrice *= 0.75; // finalPrice = finalPrice * 0.75;
        } else if (finalPrice > 2500) {
            finalPrice *= 0.90;
            if ("Y".equals(trophyPhoto)) {
                finalPrice += 40 * ticketCount;
            }
        } else if ("Y".equals(trophyPhoto)) {
            finalPrice += 40 * ticketCount;
        }

        System.out.printf("%.2f", finalPrice);
    }
}

