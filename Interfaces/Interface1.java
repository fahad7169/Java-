interface Bycyle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class Cycle{
    String model;
    int price;
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}
class AvonCycle extends Cycle implements Bycyle{
    public void applyBrake(int decrement){
           System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup");

    }
    public void setPrice(int price){
           this.price=price;
    }
    public int getPrice(){
        return price;
    }
    
   
    
}


public class Interface1{
    public static void main(String args[]){
     
        AvonCycle c1=new AvonCycle();
        c1.setPrice(5);
        System.out.println(c1.getPrice());
        c1.applyBrake(4);
        c1.speedUp(0);
        

        


    }

  
}