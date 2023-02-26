import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paper = Integer.parseInt(scanner.nextLine());
        int cloth = Integer.parseInt(scanner.nextLine());
        double clue = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double discountPercent = discount/100.0;
        double totalPrice = paper*5.8 + cloth*7.2 + clue*1.2;
        double finalPrice = totalPrice*(1-discountPercent);

        System.out.printf("%.3f", finalPrice);
    }
}
