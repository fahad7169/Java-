class Message{
    private String text;

    Message(String text){
       this.text=text;
    }

    public String toString(){
        return text;
    }

}
class SMS extends Message{
    private String recipientContactNo;

    SMS(String text,String recipientContactNo){
        super(text);
        this.recipientContactNo=recipientContactNo;
    }

    public String toString(){
        return "Message: "+super.toString()+"\nContact No: " +recipientContactNo;
    }

    public static boolean ContainsKeyword(Message messageObject,String keyword) {
          if (messageObject.toString().indexOf(keyword,0) >= 0)
          return true;
          return false; 
        }

        public StringBuilder encode(){
            String b=super.toString();
            b=b.replace(" ", "");
            StringBuilder message=new StringBuilder(b);
            for (int i = 0; i <message.length() ; i++) {
              char currentChar=message.charAt(i);
              if (Character.isLetter(currentChar)) {
                if (currentChar=='z' || currentChar =='Z') {
                    message.setCharAt(i, (char) (currentChar-25));
                }
                else{
                    message.setCharAt(i,(char) (currentChar+1));
                }
              }
            }
            return message;
        }
}
class Email extends Message{
    private String sender;
    private String reciever;
    private String subject;

    Email(String text,String sender,String reciever,String subject){
        super(text);
        this.sender=sender;
        this.reciever=reciever;
        this.subject=subject;
    }

    public String toString(){
        return "Sender: "+sender+ "\nreciever: "+reciever+"\nSubject: "+subject;
    }
    public static boolean ContainsKeyword(Message messageObject,String keyword) {
        if (messageObject.toString().indexOf(keyword,0) >= 0)
          return true;
        return false; 
    }
    public StringBuilder encode(){
        String b=super.toString();
        b=b.replace(" ", "");
        StringBuilder message=new StringBuilder(b);
        for (int i = 0; i <message.length() ; i++) {
          char currentChar=message.charAt(i);
          if (Character.isLetter(currentChar)) {
            if (currentChar=='z' || currentChar =='Z') {
                message.setCharAt(i, (char) (currentChar-25));
            }
            else{
                message.setCharAt(i,(char) (currentChar+1));
            }
          }
        }
        return message;
    }
    
}

public class Task4 {
    public static void main(String[] args) {
        SMS s1=new SMS("Hello, What is till now?","0317-73404503");
        Email e1=new Email("Hey Fahad, can you solve this problem?", "Ali", "Fahad", "Problem");
        System.out.println(s1.toString());
        System.out.println(e1.toString());
        boolean b=SMS.ContainsKeyword(s1, "H");
        if (b) {
            System.out.println("Yes keyword is there");
        }
        SMS s2=new SMS("This is Java", null);
        System.out.println(s2.encode());
       
       int a=(int) (Math.random()*10)+0;
       System.out.println(a);
       
    }
}
