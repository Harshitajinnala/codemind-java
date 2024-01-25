import java.util.*;
public class Switch{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char a = sc.next().charAt(0);
    switch (a)
    {
        case 'R' :
            System.out.println("Red");
            break;
        case 'V':
            System.out.println("Violet");
            break;
        case 'I' :
        System.out.println("Indigo");
        break;
        case 'B':
        System.out.println("Blue");
        break;

        case 'G' :
        System.out.println("Green");
        break;
        case 'Y':
        System.out.println("Yellow");
        break;
        case 'O':
        System.out.println("Orange");
        break;
        case 'r':
            System.out.println("Red");
            break;
        case 'v':
            System.out.println("Violet");
            break;
        case 'i' :
        System.out.println("Indigo");
        break;
        case 'b':
        System.out.println("Blue");
        break;

        case 'g' :
        System.out.println("Green");
        break;
        case 'y':
        System.out.println("Yellow");
        break;
        case 'o':
        System.out.println("Orange");
        break;
        default:
        System.out.println("-1");

    }
}
} 