//catergorize
import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    if(a>0 && a<150)
    System.out.printf("The person is Dwarf.");
    else if(a>=150&& a<=165)
    System.out.printf("The person is average heighted.");
    else if(a>165 && a<=195)
    System.out.printf("The person is taller.");
    else
    System.out.printf("Abnormal height.");
}
} 