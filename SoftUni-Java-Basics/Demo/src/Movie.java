import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statistsNumber = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double statistsCosts = statistsNumber * clothesPrice;

        if(statistsNumber > 150) {
            statistsCosts = statistsCosts*0.9;
        }

        double totalCosts = decor + statistsCosts;
        double difference = Math.abs(totalCosts - budget);

        if(budget >= totalCosts){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }

    }
}
