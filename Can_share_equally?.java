import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a!=0 && a%2==0) System.out.print("YES");
        else if(a==0 && b%2==0) System.out.print("YES");
        else System.out.print("NO");
    }
}