import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the value of a: ");
        a=sc.nextDouble();
        System.out.print("Enter the value of b: ");
        b=sc.nextDouble();
        System.out.print("Enter the value of c: ");
        c=sc.nextDouble();

        double determinant =b*b-(4*a*c);
        if (determinant>0) {
            double root1=((-b + Math.sqrt(determinant))/(float) 2*a);
            double root2=((-b - Math.sqrt(determinant))/(float) 2*a);


           System.out.println("Roots are real and different");

           System.out.println("Root 1 = "+root1);
           System.out.println("Root 2 = " + root2);

        }
        else if (determinant==0) {
            double root=(float) -b /(2*a);
            System.out.println("Roots are equal and different");
            System.out.println("Root is: "+root);
        }
        else{
            double real=(float) -b /(2*a);
            double i=Math.sqrt(-determinant)/(2*a);
            System.out.println("Root 1: " + real +"+"+i+"i");
            System.out.println("Root 2: " + real +"-"+i+"i");
           

            System.out.println("Roots are complex and different");
        }

    }
}
 