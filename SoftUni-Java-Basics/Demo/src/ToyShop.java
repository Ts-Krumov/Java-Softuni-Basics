import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double trip = Double.parseDouble(scanner.nextLine());
      int puzzle = Integer.parseInt(scanner.nextLine());
      int dolls = Integer.parseInt(scanner.nextLine());
      int teddyBears = Integer.parseInt(scanner.nextLine());
      int minions = Integer.parseInt(scanner.nextLine());
      int trucks = Integer.parseInt(scanner.nextLine());

      int countOfToys = puzzle + dolls + teddyBears + minions + trucks;
      double totalSum = puzzle * 2.6 + dolls * 3 + teddyBears * 4.1 + minions*8.2 + trucks * 2;


        if(countOfToys >= 50){
            totalSum = totalSum - totalSum*0.25;
        }

            totalSum = totalSum * 0.9;

            if(totalSum >= trip){
                double moneyLeft = totalSum - trip;
                System.out.printf("Yes! %.2f lv left.", moneyLeft);
            } else {
                double moneyNeeded = trip - totalSum;
                System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
            }
      }
    }