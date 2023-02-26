import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if(flower.equals("Roses")){
            price = number*5;
            if(number > 80){
                price=price*0.9;
            }
        }else if(flower.equals("Dahlias")){
            price = number*3.8;
            if(number > 90){
                price=price*0.85;
            }
        }else if(flower.equals("Tulips")) {
            price=number*2.8;
            if (number > 80) {
                price = price * 0.85;
            }
        }else if(flower.equals("Narcissus")) {
            price=number*3;
        if (number < 120) {
            price = price * 1.15;
        }
        }else if(flower.equals("Gladiolus")) {
            price=number*2.5;
            if (number < 80) {
                price = price * 1.2;
            }
        }

        if(budget >= price){
            double difference = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, difference);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget-price));
        }
    }
}
