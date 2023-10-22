import java.util.Scanner;

public class experiments {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int C = 0, R = 0, S = 0;
        int N, Amount;
        char type;

        N = input.nextInt();

        for (int i = N ; i > 0 ; i--) {

            do {
                Amount = input.nextInt();
                type = input.next().charAt(0);
            } while (Amount > 15 || Amount < 1);

            switch (type){
                case 'C':
                    C += Amount;
                    break;
                case 'R':
                    R += Amount;
                    break;
                case 'S':
                    S += Amount;
                    break;
            }
        }

        int totalCobaias = C+R+S;
        double percentualCoelhos = ((double) C/(double) totalCobaias)*100;
        double percentualRatos = ((double) R/(double) totalCobaias)*100;
        double percentualSapos = ((double) S/(double) totalCobaias)*100;

        System.out.printf("Total: %d cobaias\n", totalCobaias);
        System.out.printf("Total de coelhos: %d\n", C);
        System.out.printf("Total de ratos: %d\n",R);
        System.out.printf("Total de sapos: %d\n", S);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
    }
}
