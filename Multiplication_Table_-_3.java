import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int n=sc.nextInt();
    for(int i =b;i<=n;i++){
    int c = a*i;
     System.out.printf("%d x %d = %d
",a,i,c);
    }
   
}
} 