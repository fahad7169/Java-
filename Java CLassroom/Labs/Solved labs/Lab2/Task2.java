import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     System.out.println("a.int 1x=10; " + "\nb.int x=10; "+"\nc.float x=10f"+"\nd.string x=\"10\"");
     System.out.print("Enter your Choice: ");
     char choice=sc.next().charAt(0);
     switch (choice) {
        case 'a':
            System.out.println("Wrong Answer");
            break;
        case 'b':
            System.out.println("Correct Answer");
            break;
        case 'c':
            System.out.println("Wrong Answer");
            break;
        case 'd':
            System.out.println("Wrong Answer");
            break;
        default:
        System.out.println("Wrong choice");
            break;
     }
     


    }
}
