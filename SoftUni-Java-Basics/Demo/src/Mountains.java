import java.util.Scanner;

public class Mountains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int Musala = 0;
        int Monblan = 0;
        int Killimandjaro = 0;
        int K2 = 0;
        int Everest = 0;
        int totalPPL = 0;
        for(int i =1; i <=n; i++){
            int ppl = Integer.parseInt(scanner.nextLine());
            totalPPL+=ppl;
            if(ppl <=5 ){
            Musala+=ppl;
            }else if(ppl <=12 ){
            Monblan+=ppl;
            }else if(ppl <=25 ){
            Killimandjaro+=ppl;
            }else if(ppl <=40 ){
            K2+=ppl;
            }else{
                Everest+=ppl;
            }
        }

        double MussalaPercent = (Musala*1.0/totalPPL)*100;
        double MonblanPercent = (Monblan*1.0/totalPPL)*100;
        double KillimandjaroPercent = (Killimandjaro*1.0/totalPPL)*100;
        double K2Percent = (K2*1.0/totalPPL)*100;
        double EverestPercent = (Everest*1.0/totalPPL)*100;

        System.out.printf("%.2f%%\n", MussalaPercent);
        System.out.printf("%.2f%%\n", MonblanPercent);
        System.out.printf("%.2f%%\n", KillimandjaroPercent);
        System.out.printf("%.2f%%\n", K2Percent);
        System.out.printf("%.2f%%\n", EverestPercent);
    }
}
