//catergorize
import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char   a = sc.next().charAt(0);
    if(a=='V')
    System.out.printf("Violet");
    else if(a=='I')
    System.out.printf("Indigo");
    else if(a=='G')
    System.out.printf("Green");
    else if(a=='B')
    System.out.printf("Blue");
    else if(a=='Y')
    System.out.printf("Yellow");
    else if(a=='O')
    System.out.printf("Orange");
    else if(a=='R')
    System.out.printf("Red");
    else
    System.out.printf("-1");
}
} 
