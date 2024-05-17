import java.util.*;
import java.lang.String;
public class Task7 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("input your string: ");
       String input=sc.nextLine().trim(); 
       
       if(Character.isLowerCase(input.charAt(0))){
           char a=Character.toUpperCase(input.charAt(0));
           input=a+input.substring(1, input.length());
       }
       if (Character.isAlphabetic(input.charAt(input.length()-1))) {
           input=input.concat(".");
       }
       System.out.println(input);
       
    }
}
