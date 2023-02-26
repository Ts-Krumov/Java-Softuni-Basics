import java.util.Scanner;

public class Swimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double secForMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = (metres * secForMeter) + ((Math.floor(metres/15))*12.5);

        if(totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else  {
            double difference = Math.abs(record - totalTime);
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
