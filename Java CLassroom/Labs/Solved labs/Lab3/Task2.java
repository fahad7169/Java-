class Employeinfo{
	int salary;
	int noOfhours;
	
	
	public void getinfo(int salary,int noOfhours){
		
		this.salary=salary;
		this.noOfhours=noOfhours;
		
		
		
		
		
	}
	public void addWork(){
		if(noOfhours>6){
			salary+=5;
			
		}
		
		
	}
	
	public void printinfo(){
		System.out.println("Salary " + salary);
		
		
	}
	
	
	
	
	
}

public class Task2{
	public static void main(String args[]){
		
		Employeinfo e1=new Employeinfo();
		e1.getinfo(500,7);
		e1.addWork();
		e1.printinfo();
		Employeinfo e2=new Employeinfo();
		e1.getinfo(400,4);
		e1.addWork();
		e1.printinfo();
		
		
		
		
		
		
	}
	
	
	
	
}