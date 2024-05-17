import java.util.*;

import javax.sound.midi.Soundbank;

public class Exception3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=0;
        boolean done=false;
        while(!done){
          try{
            System.out.println("Enter the whole number: ");
            number=sc.nextInt();
            done=true;
          }
          catch(Exception e){
            sc.nextLine();
            System.out.println("Not a correctly written whole number: ");
            System.out.println("Try again");
          }
        

        }
        System.out.println("You Entered: " + number);

    }
}