import java.util.Scanner;

public class Exam01Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int num1 = number%10;
        int num2 = number/10%10;
        int num3 = number/100%10;
        int multi = 0;
        for(int i=1; i<=num1; i++){
            for (int j=1; j <=num2; j ++){
                for(int k =1; k <=num3; k ++){
                    multi = i*j*k;
                    System.out.printf("%d * %d * %d = %d\n", i, j, k , multi);
                }
            }
        }
    }
}
