import java.util.Scanner;

public class ExamTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ppl = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        switch (season){
            case "spring":
                if(ppl <=5 ){
                    price = ppl * 50.0;
                }else {
                    price = ppl * 48.0;
                }
                break;
            case "summer":
                double discount = 0.85;
                if(ppl <=5 ){
                    price = ppl * 48.50;
                }else {
                    price = ppl * 45.0;
                }
                price = price*discount;
                break;
            case "autumn":
                if(ppl <=5 ){
                    price = ppl * 60.0;
                }else {
                    price = ppl * 49.50;
                }
                break;
            case "winter":
                double overcharge = 1.08;
                if(ppl <=5 ){
                    price = ppl * 86.0;
                }else {
                    price = ppl * 85.0;
                }
                price = price*overcharge;
                break;
        }
        System.out.printf("%.2f leva.", price);
    }
}
