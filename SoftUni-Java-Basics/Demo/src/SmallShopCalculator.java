import java.util.Scanner;

public class SmallShopCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if(product.equals("coffee")){
            if(city.equals("Varna")){
                price = amount * 0.45;
            }else  if(city.equals("Plovdiv")){
                price = amount * 0.4;
            }else {
                price = amount * 0.5;
            }
        }
        else if (product.equals("water")){
            if(city.equals("Varna")){
                price = amount * 0.7;
            }else  if(city.equals("Plovdiv")){
                price = amount * 0.7;
            }else {
                price = amount * 0.8;
            }
        }
        else if(product.equals("beer")){
            if(city.equals("Varna")){
                price = amount * 1.1;
            }else  if(city.equals("Plovdiv")){
                price = amount * 1.15;
            }else {
                price = amount * 1.2;
            }
        }
        else if(product.equals("sweets")){
            if(city.equals("Varna")){
                price = amount * 1.35;
            }else  if(city.equals("Plovdiv")){
                price = amount * 1.3;
            }else {
                price = amount * 1.45;
            }
        } else if(product.equals("peanuts")){
            if(city.equals("Varna")){
                price = amount * 1.55;
            }else  if(city.equals("Plovdiv")){
                price = amount * 1.5;
            }else {
                price = amount * 1.6;
            }
        }

        System.out.printf("%.2f", price);
    }
}

