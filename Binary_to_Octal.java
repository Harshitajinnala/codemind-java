//hexagonal to binary
import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    for(int i =0;i<a;i++){
    String w = sc.next();
    int d = Integer.parseInt(w,2);
    String c = Integer.toOctalString(d);
     System.out.printf("%s
",c);
    }
   
}
} 