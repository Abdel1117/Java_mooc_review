
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2].trim());
                int visitingPoints = Integer.valueOf(parts[3].trim());

                if (homeTeam.equals(team)) {
                    games++;
                    if (homePoints > visitingPoints) {
                        wins++;
                    } else if (homePoints < visitingPoints) {
                        losses++;
                    }
                } else if (visitingTeam.equals(team)) {
                    games++;
                    if (visitingPoints > homePoints) {
                        wins++;
                    } else if (visitingPoints < homePoints) {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
