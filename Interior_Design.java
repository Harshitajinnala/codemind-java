import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = a+b;
    int f = c+d;
    if((e)>(f))
    {
         System.out.printf("%d",f);
    }
   else
   {
        System.out.printf("%d",(e));
   }
}
} 