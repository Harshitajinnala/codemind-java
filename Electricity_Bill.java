import java.util.*;
public class MyClass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String p = sc.nextLine();
    String q = sc.nextLine();
    int u = sc.nextInt();
    double c,b,s,t;
    if (u<=199)
    {
        c=1.20;
        b=u*1.20;
    }
    else if (u>=200 && u<400)
    {
        c=1.50;
        b=u*1.50;
    }
    else if (u>=400 && u<600)
    {
        c=1.80;
        b=u*1.80;
    }
    
    else 
    {
        c=2.00;
        b=u*2.00;
    }
    if (b>400)
    {
        s=b*0.15;
    }
    else
    {
        s=100.00;
    }
    t=b+s;
    System.out.printf("%.2f",t);
}
}