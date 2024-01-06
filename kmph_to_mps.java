import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double kmph = sc.nextDouble();
    double mps = (0.27778)* kmph;
    System.out.printf("%.2f",mps);
}
} 