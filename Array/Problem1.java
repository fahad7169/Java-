import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n,m;
System.out.print("Enter the number of rows: ");
n=sc.nextInt();
System.out.print("Enter the number of columns: ");
m=sc.nextInt();
int arr[][]=new int[n][m];



        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
           System.out.print("Enter the value for row " + i + " column " + j + ": ");
           arr[i][j]=sc.nextInt();
         
            }
         
         }
         for(int i=0; i<n; i++){
   
            for(int j=0; j<m; j++){
                System.out.print(" " + arr[i][j]);
            }
         System.out.println();
        }
        System.out.print("Enter the number you want to search from this matrix: ");
         int sea=sc.nextInt();
         for(int i=0; i<n; i++){
            
             for(int j=0; j<m; j++){
                   
            if(sea==arr[i][j]){
               System.out.print(sea + " is present at the Row " + i +" Column " + j);
            }

             }
          
         }
         
         





    }
}
