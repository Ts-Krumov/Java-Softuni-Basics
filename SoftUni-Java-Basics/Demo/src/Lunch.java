import java.util.Scanner;

public class Lunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int seriesTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunch = breakTime / 8.0;
        double relax = breakTime / 4.0;

        double timeToWatch = breakTime - lunch - relax;

        if(timeToWatch >= seriesTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie,Math.ceil(timeToWatch - seriesTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, Math.ceil(seriesTime - timeToWatch));
        }
    }
}
