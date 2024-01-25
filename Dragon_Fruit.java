import java.util.*;

public class DragonFruit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X % 2 == 0 && X>2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}