import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int GPU = Integer.parseInt(scanner.nextLine());
        int CPU = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        double sum = GPU*250.0 + ((GPU*250)*0.35)*CPU + RAM*((GPU*250)*0.1);

        if(GPU > CPU){
            sum = sum * 0.85;
        }

        if(budget >= sum){
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(sum - budget));
        }
    }
}
