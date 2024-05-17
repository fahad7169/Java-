import java.util.*;

public class Array1{


public static void rt(int[] marks){
    Scanner sc=new Scanner(System.in);
for (int i = 0; i < marks.length; i++) {
    System.out.print("Enter the marks: ");
    marks[i] = sc.nextInt();
}
for(int values: marks){
    System.out.println(values);
}

}

public static void main(String[] args){
/*int[] marks=new int[3];
marks[0]=96;
marks[1]=35;
marks[2]=67;
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
*/
Scanner sc=new Scanner(System.in);
int[] marks=new int[3];
rt(marks);
}


}