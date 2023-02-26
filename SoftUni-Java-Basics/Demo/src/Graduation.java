import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFailed = false;
        String name = scanner.nextLine();
        int year = 1;
        int poorMark = 0;
        double sumMarks = 0;
        while(year <= 12){
            if(poorMark > 1){
                isFailed = true;
                break;
            }
            double mark = Double.parseDouble(scanner.nextLine());
        if(mark < 4){
            poorMark++;
            continue;
        }
        sumMarks+=mark;
        year++;
        }

        if(isFailed){
            System.out.printf("%s has been excluded at %d grade", name, year);
        }else {
            double average = sumMarks/12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);}
    }
}
