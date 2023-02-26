import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int totalExamMin = examHour*60 + examMinutes;
        int totalArrivalMin = arrivalHour*60 + arrivalMinutes;

        int diff = Math.abs(totalArrivalMin - totalExamMin);

        if(totalArrivalMin > totalExamMin){
            System.out.println("Late");
            if(diff < 60){
                System.out.printf("%d minutes after the start\n", diff);
            } else {
                int hour = diff / 60;
                int min =diff % 60;
                System.out.printf("%d:%02d hours after the start\n", hour, min);
            }
        }else if (diff <= 30){
            System.out.println("On time");
            if(totalExamMin != totalArrivalMin){
                System.out.printf("%d minutes before the start\n", diff);
            }
        }else {
            System.out.println("Early");
            if(diff < 60){
                System.out.printf("%d minutes before the start\n", diff);
            }else {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start\n", hour, min);
            }
        }
    }
}
