public class Task5 {
    
    public static String reverse(String s,int n){
           if (s.length()>0 && n>=0) {
              System.out.println(s.charAt(n));
              return reverse(s, --n);
           }
           else{
            return s;
           }
    }
    public static void main(String[] args) {
        String s="OOP is Fun";
        reverse(s, s.length()-1);
    }
}
