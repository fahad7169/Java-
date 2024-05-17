import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()
        
        String[] name = new String[n];
        int[] maths = new int[n];
        int[] prog = new int[n];
        int[] eng = new int[n];
        int[] ps = new int[n];
        int[] obt = new int[n];
        float[] per = new float[n];
        char[] grade = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the student " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        
            System.out.print("Enter the marks of programming: ");
            prog[i] = sc.nextInt();
            sc.nextLine(); 
        
            System.out.print("Enter the marks of maths: ");
            maths[i] = sc.nextInt();
            sc.nextLine(); 
        
            System.out.print("Enter the marks of English: ");
            eng[i] = sc.nextInt();
            sc.nextLine();
        
            System.out.print("Enter the marks of P.S: ");
            ps[i] = sc.nextInt();
            sc.nextLine(); 
        
            obt[i] = prog[i] + maths[i] + eng[i] + ps[i];
            per[i] = ( (float) obt[i] * 100) / 400;
            if (per[i] >= 80 && per[i] <= 100) {
                grade[i] = 'A';
            } else if (per[i] >= 70 && per[i] <= 79) {
                grade[i] = 'B';
            } else if (per[i] >= 60 && per[i] <= 69) {
                grade[i] = 'C';
            } else if (per[i] < 60) {
                grade[i] = 'F';
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Student Name: " + name[i]);
            System.out.println("Programming Marks: " + prog[i]);
            System.out.println("Maths Marks: " + maths[i]);
            System.out.println("English Marks: " + eng[i]);
            System.out.println("P.S. Marks: " + ps[i]);
            System.out.println("Total Marks Obtained: " + obt[i]);
            System.out.println("Percentage: " + per[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
        



    }
}
