import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double sal = sc.nextDouble();
    double hra = sc.nextDouble();
    double da = sc.nextDouble();
    double pf = (12 * sal) /100;
    double gsal = sal + hra + da + pf;
    System.out.printf("%.2f
",pf);
    System.out.printf("%.2f",gsal);
}
} 