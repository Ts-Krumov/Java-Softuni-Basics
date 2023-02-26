import java.util.Scanner;

public class Exam01Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tshirt = Double.parseDouble(scanner.nextLine());
        double limit = Double.parseDouble(scanner.nextLine());

        double shorts = tshirt*0.75;
        double socks = shorts*0.2;
        double shoes = (shorts + tshirt)*2;
        double totalsum = (tshirt + shoes + shorts + socks)*0.85;

        if(totalsum >= limit){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalsum);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", Math.abs(totalsum - limit));
        }



    }
}
