import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println("Sum:"+(p+q));
    System.out.println("Difference:"+(p-q));
    System.out.println("Product:"+p*q);
    System.out.println("Quotient:"+p/q);
    System.out.println("Remainder:"+p%q);
}
}