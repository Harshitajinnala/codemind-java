import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ca = sc.nextInt();
    for (int i =0 ;i<ca;i++)
    {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b+c||b>a+c||c>a+b)
    {
        System.out.printf("YES
");
    }
    else System.out.printf("NO
");
    }
}
} 