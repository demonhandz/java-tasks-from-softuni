package TasksFromPreExam;

import java.util.Scanner;

public class footballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goalsHome = 0;
        int goalsGuest = 0;
        int countWins = 0;
        int countLoses = 0;
        int countDraws = 0;
        int countGames = 3;

        for (int i = 1; i <= countGames; i++) {
            String result = scanner.nextLine();

            char goalsHomeChar = result.charAt(0);
            char goalsGuestChar = result.charAt(2);

            String goalsHomeString = String.valueOf(goalsHomeChar);
            String goalsGuestString = String.valueOf(goalsGuestChar);

            goalsHome = Integer.parseInt(goalsHomeString);
            goalsGuest = Integer.parseInt(goalsGuestString);

            if (goalsHome > goalsGuest) {
                countWins++;
            } else if (goalsHome < goalsGuest) {
                countLoses++;
            } else {
                countDraws++;
            }
        }

        System.out.printf("Team won %d games.\n", countWins);
        System.out.printf("Team lost %d games.\n", countLoses);
        System.out.printf("Drawn games: %d", countDraws);
    }
}