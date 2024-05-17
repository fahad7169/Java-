class Employe{
	String name;
	int year;
	String Address;
	int salary;
	
	
	Employe(String name,int year,String Address,int salary){
		this.name=name;
		this.year=year;
		this.Address=Address;
		this.salary=salary;
		
		
		
	}
	
	public void Displayinfo(){
		
		System.out.print("Name");
		System.out.print("		Year of joining");
		System.out.print("		Address");
		System.out.println("		Salary");
		System.out.print(name);
		System.out.print("		" +year);
    	System.out.print("		  "+ Address);
        System.out.println("      "+ salary);
		
		
		
		
		
	}
	
	
	
}

public class Task1{
	
	public static void main(String args[]){
		Employe e1=new Employe("Robert",1994,"64C- WallsStreat",500);
		Employe e2=new Employe(
		e1.Displayinfo();
		
		
		
		
	}
	
	
	
	
	
	
	
}
