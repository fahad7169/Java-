import java.util.Scanner;


public class Class1{

public static class Car{
    String name;
    int year; 
//Constructor
    Car(String name,int year){
        this.name=name;
        this.year=year;
    }
//method
    void display(){
        System.out.println("Car name is: " + name);
        System.out.print("Year is: " + year);
        return;
    }
}
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.print("Enter the name of the car: ");
String name=sc.nextLine();
System.out.print("Enter the year of make: ");
int year=sc.nextInt();

Car info=new Car(name,year);

info.display();



}



}