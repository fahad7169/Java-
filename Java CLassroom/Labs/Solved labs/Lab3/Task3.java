class Vehicle{
	int no_of_wheels;
	int no_of_seats;
	
	
	Vehicle(int no_of_seats,int no_of_wheels){
		this.no_of_seats=no_of_seats;
		this.no_of_wheels=no_of_wheels;
		
		
		
	}
	
	public void showVehicle(){
		System.out.println("No of seats: "+no_of_seats);
		System.out.println("No of wheels: "+no_of_wheels);
		
		
	}
	
	
}


public class Task3{
	public static void main(String args[]){
		
		Vehicle Car=new Vehicle(4,4);
		Car.showVehicle();
		Vehicle Motorcycle=new Vehicle(1,2);
		Motorcycle.showVehicle();
		
		
		
	}
	
	
	
}