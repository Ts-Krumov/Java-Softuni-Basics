import java.util.Scanner;

public class Exam02TaskComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalRating = 0;
        double sumSales = 0;
        for(int i=1; i<=n; i ++){
            int number = Integer.parseInt(scanner.nextLine());
            int sales = 0;
            double completedSales = 0;
            int rating = number%10;
            totalRating+=rating;
            switch (rating){
                case 2:
                    sales = number/10;
                    completedSales = sales*0;
                    sumSales+=completedSales;
                    break;
                case 3:
                    sales = number/10;
                    completedSales = sales*0.5;
                    sumSales+=completedSales;
                    break;
                case 4:
                    sales = number/10;
                    completedSales = sales*0.7;
                    sumSales+=completedSales;
                    break;
                case 5:
                    sales = number/10;
                    completedSales = sales*0.85;
                    sumSales+=completedSales;
                    break;
                case 6:
                    sales = number/10;
                    completedSales = sales;
                    sumSales+=completedSales;
                    break;
            }
        }
        System.out.printf("%.2f\n", sumSales);
        System.out.printf("%.2f\n", totalRating/n);

    }
}
