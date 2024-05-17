class Temprature{
	double temp;
	 
	 Temprature(int temp){
		 this.temp=temp;
		 
	 }
	 public double convert(){
		 temp=(double)(temp*1.8)+32;
		 return temp;
		 
		 
	 }
	
	
}


public class Task4{
   public static void main(String args[]){
         Temprature t1=new Temprature(24);
		 System.out.print(t1.convert());



   }	   
	
	
	
}
