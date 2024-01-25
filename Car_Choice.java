import java.util.*;

public class CarChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt(); 
            int  b= sc.nextInt(); 
            int c= sc.nextInt(); 
            int d = sc.nextInt(); 
            double x = (double) c/a;
            double y = (double) d/b;
        if (x<y) System.out.println("-1");
        else if(x ==y) System.out.println("0");
        else System.out.println("1");
}
}}