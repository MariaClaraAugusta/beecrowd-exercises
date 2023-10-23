import java.util.Scanner;

public class alarmClock {
    public static void main(String[] args) {

        int cond = 1;

        Scanner sc = new Scanner(System.in);

        while(cond !=0) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            if (h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0){
                cond = 0;
            } else {
                h1 *= 60;
                h2 *= 60;
                int sh1 = h1 + m1;
                int sh2 = h2 + m2;
                int time;
                if (sh2 < sh1){
                    sh2 += 1440;
                }
                time = sh2 - sh1;
                System.out.println(time);
            }
        }
    }
}

