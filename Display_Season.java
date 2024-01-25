import java.util.*;

public class Dseason {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a==4 || a==5 ||a==6 )System.out.print("Summer");
        else if(a==7||a==8||a==9||a==10)System.out.print("Rainy");
        else if(a==11 || a==12 || a==1)System.out.print("Winter");
        else if(a==2||a==3) System.out.print("Spring");
        else System.out.println("-1");
    }
}