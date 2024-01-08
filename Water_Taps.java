import java.util.*;
public class FillTankTimeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int timeTapA = sc.nextInt();
        int timeTapB = sc.nextInt();
        sc.close();
        double rateTapA = 1.0 / timeTapA;
        double rateTapB = 1.0 / timeTapB;
        double combinedRate = rateTapA + rateTapB;
        int totalTime = (int) Math.round(1.0 / combinedRate);
        System.out.println(totalTime);
    }
}