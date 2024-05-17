import java.util.*;

public class Task3 {

    public static int lastDigit(int a){
        int lastDigit=a%10;
        return lastDigit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int lastDigit=lastDigit(n);
        System.out.println("last digit is: "+lastDigit);
    }

}
