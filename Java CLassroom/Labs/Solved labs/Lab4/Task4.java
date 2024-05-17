import java.util.Scanner;

public class Task4 {
    public static int findGCD(int a,int b){
      if (b!=0) {
        return findGCD(b, a%b);
      }
      else{
        return a;
      }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int n1=sc.nextInt();
        System.out.print("Enter the number 2: ");
        int n2=sc.nextInt();
        System.out.println("The GCD OF "+n1+" & "+n2+" is: "+findGCD(n1, n2));
    }
}
