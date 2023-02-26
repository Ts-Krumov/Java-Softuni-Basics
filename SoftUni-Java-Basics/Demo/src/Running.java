import java.util.Scanner;

public class Running {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int days = Integer.parseInt(scanner.nextLine());
                double distance = Double.parseDouble(scanner.nextLine());

                double total = 0;
                total += distance;

                for(int i = 1; i <= days; i++) {
                    int proc = Integer.parseInt(scanner.nextLine());

                    double dis = total * (proc / 100.0);
                    total = total + dis;
                    System.out.println(total);
                }
            }
        }
