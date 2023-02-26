import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");
        boolean isNotWeekend = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday");
        if(isNotWeekend){
            if (fruit.equals("banana")) {
                price = amount * 2.5;
            } else if (fruit.equals("apple")) {
                price = amount * 1.2;
            } else if (fruit.equals("orange")) {
                price = amount * 0.85;
            } else if (fruit.equals("kiwi")) {
                price = amount * 2.7;
            } else if (fruit.equals("grapefruit")) {
                price = amount * 1.45;
            } else if (fruit.equals("pineapple")) {
                price = amount * 5.5;
            } else if (fruit.equals("grapes")) {
                price = amount * 3.85;
            } else {
                System.out.println("error");
            }

        } else if(isWeekend) {
            if (fruit.equals("banana")) {
                price = amount * 2.7;
            } else if (fruit.equals("apple")) {
                price = amount * 1.25;
            } else if (fruit.equals("orange")) {
                price = amount * 0.9;
            } else if (fruit.equals("kiwi")) {
                price = amount * 3.0;
            } else if (fruit.equals("grapefruit")) {
                price = amount * 1.6;
            } else if (fruit.equals("pineapple")) {
                price = amount * 5.6;
            } else if (fruit.equals("grapes")) {
                price = amount * 4.2;
            } else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
        if(price!=0){
            System.out.printf("%.2f",price);
        }

    }
}
