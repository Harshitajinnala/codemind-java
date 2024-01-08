import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    for(int i =0 ; i < k;i++)
    {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a+c)<=b)
    System.out.printf("YES
");
    else System.out.printf("NO
");
}
}
} 