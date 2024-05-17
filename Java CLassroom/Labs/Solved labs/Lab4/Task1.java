import java.util.*;

class CalculateBMI{
    
    public static double calculateBMI(double weight,double height ){
        double bmi= ((weight/(Math.pow(height,2))*703));
        return bmi;
    }

    public static void findStatus(double bmi){
        if (bmi<18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi>=18.5 && bmi<=24.9) {
            System.out.println("You are normal");
        }
        else if (bmi>=25.0 && bmi<=29.9) {
            System.out.println("You are overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
 
   
}
public class Task1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the weight(in pounds): ");      
        double weight=sc.nextDouble();
        System.out.print("Enter the height(in inches): ");
        double height=sc.nextDouble();

       double bmi=CalculateBMI.calculateBMI(weight, height);
       CalculateBMI.findStatus(bmi);


    }
}