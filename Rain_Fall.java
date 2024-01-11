import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    if(a<3)
    System.out.printf("LIGHT");
    else if(a>=3 && a<7)
    System.out.printf("MODERATE");
    else
    System.out.printf("HEAVY");
}
} 