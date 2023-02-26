import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int result = 0;
        String type = "";

        switch (operator){
            case "+":
                 result = N1 + N2;
                if(result % 2 ==0){
                    type = "even";
                }else {
                    type = "odd";
                }
                System.out.printf("%d + %d = %d - %s", N1, N2, result, type);
                break;
            case "-":
                 result = N1 - N2;
                if(result % 2 ==0){
                    type = "even";
                }else {
                    type = "odd";
                }
                System.out.printf("%d - %d = %d - %s", N1, N2, result, type);
                break;
            case "*":
                result = N1 * N2;
                if(result % 2 ==0){
                    type = "even";
                }else {
                    type = "odd";
                }
                System.out.printf("%d * %d = %d - %s", N1, N2, result, type);
                break;
            case "/":
                 double division = N1* 1.0 / N2;
                if(N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else {  System.out.printf("%d / %d = %.2f", N1, N2, division);}
                break;
            case "%":
                if(N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else {
                    int leftover = N1 % N2;
                    System.out.printf("%d %% %d = %d", N1, N2, leftover);
                }
                break;
        }
    }
}
