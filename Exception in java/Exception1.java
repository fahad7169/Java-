import java.io.*;
public class Exception1{
      public static void main(String[] args) {
        //compile time exceptio
        try{
         FileInputStream fs=new FileInputStream("d:/ab.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }
        


         //run time exception
        // int a=4,b=0,c;
        // c=a/b;
        System.out.println("Hello");
        // String name=null;
        // System.out.println(name.length());
      }
}