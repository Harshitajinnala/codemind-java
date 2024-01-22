import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    double a = (b+c+e+d+f);
    a = (a/500)*100;
    if(a>=90)
    System.out.printf("Grade A");
    else if(a>=80)
    System.out.printf("Grade B");
    else if(a>=70)
    System.out.printf("Grade C");
    else if(a>=60)
    System.out.printf("Grade D");
    else if(a>=40)
    System.out.printf("Grade E");
    else
    System.out.printf("Grade F");
}
} 
