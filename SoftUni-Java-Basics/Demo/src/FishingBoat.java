import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;

        if(season.equals("Spring")){
            price = 3000;
            if(fishermen <=6){
                price*=0.9;
            }else if(fishermen <=11){
                price*=0.85;
            }else if(fishermen>12){
                price*=0.75;
            }
        }else if(season.equals("Winter")){
            price = 2600;
            if(fishermen <= 6){
                price*=0.9;
            }else if(fishermen <= 11){
                price*=0.85;
            }else if(fishermen>12){
                price*=0.75;
            }
        }else if(season.equals("Autumn") || season.equals("Summer")){
            price = 4200;
            if(fishermen <=6){
                price*=0.9;
            }else if(fishermen <=11){
                price*=0.85;
            }else if(fishermen >12){
                price*=0.75;
            }
        }

        if(fishermen%2 == 0 && !season.equals("Autumn")){
            discount = price * 0.05;
            price = price - discount;
        }

        if(budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));
        }
    }
}
