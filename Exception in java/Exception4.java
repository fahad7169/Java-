public class Exception4 {
    public static void main(String[] args) {
        int waitTime=46;
        try
{
 System.out.println("Try block entered.");
 if (waitTime > 30)
 throw new Exception("Over 30.");
 else if (waitTime < 30)
 throw new Exception("Under 30.");
 else
 System.out.println("No exception.");
 System.out.println("Leaving try block.");
}
catch(Exception thrownObject)
{
   
 System.out.println(thrownObject.getMessage());
}
 


    }
}
