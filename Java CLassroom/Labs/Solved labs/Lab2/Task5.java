public class Task5 {
    public static void main(String[] args) {
        int arr[]=new int[15];
        for (int i = 0; i <30; i++) {
            if((i+1)%2!=0){
                arr[i]=i+1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.println(arr[i]);
            }
        }
       
    }
}
