import java.io.*;

public class Exception2 {
    public static void main(String[] args) {
        try{
     Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println(e);
        }
   
    }
}
