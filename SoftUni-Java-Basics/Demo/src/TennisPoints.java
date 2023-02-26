import java.util.Scanner;

public class TennisPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int bonusPoints = 0;
        double averagePoints = 0;
        int tournamentsWon = 0;

        for(int i =1; i <= n; i++){
            String result = scanner.nextLine();
            if(result.equals("W")){
                bonusPoints+=2000;
                tournamentsWon++;
            }else if(result.equals("SF")){
                bonusPoints+=720;
            }else if(result.equals("F")){
                bonusPoints+=1200;
            }
            averagePoints = (bonusPoints*1.0)/n;
        }
        System.out.printf("Final points: %d\n", points+bonusPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePoints));
        System.out.printf("%.2f%%\n", (tournamentsWon*1.0/n)*100);

    }
}
