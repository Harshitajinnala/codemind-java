import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int d = ( z - y ) / x;
    System.out.printf("%d",d);
}
} 
