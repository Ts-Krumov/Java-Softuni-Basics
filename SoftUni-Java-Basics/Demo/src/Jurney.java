import java.util.Scanner;

public class Jurney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String place ="";
        double price =0;

        if(budget <=100 ){
            location = "Bulgaria";
            if(season.equals("summer")){
                place = "Camp";
                price = budget*0.3;
            }else {
                place = "Hotel";
                price = budget*0.7;
            }
        }else if(budget <=1000){
            location = "Balkans";
            if(season.equals("summer")){
                place = "Camp";
                price = budget*0.4;
            }else {
                place = "Hotel";
                price = budget*0.8;
            }
        }else if(budget > 1000){
            location = "Europe";
            price = budget*0.9;
            place = "Hotel";
        }

        System.out.printf("Somewhere in %s\n", location);
        System.out.printf("%s - %.2f\n", place, price);
    }
}
