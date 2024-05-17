
class Company{
    private String name;
    private Store arrayStore [];
    private int nbStore=0;


    Company(String name){
        this.name=name;
    }
    

    public void addStore(Store store){
        if (arrayStore==null) {
            arrayStore=new Store[10];
        }

        if (nbStore<10) {
            arrayStore[nbStore]=store;
            nbStore++;
        }
        else{
            System.out.println("Limit reached");
        }

    }
    public int searchNbofStore(String productName){
        int temp=0;


       for (int i = 0; i < arrayStore.length; i++) {

        if (arrayStore[i]!=null) {
            for(int j=0; j<arrayStore[i].productList.length; j++){

                if (arrayStore[i].productList[j]!=null) {
                    if(arrayStore[i].productList[j].getName().equals(productName)){

                    
                        ++temp;
                   }
                }

                
            }
           
        }
        else
        break;

         

           
       }
       return temp;



    }
    public void displayAll(){


       for (int i = 0; i < nbStore; i++) {
          if (arrayStore[i]!=null) {
            System.out.println(arrayStore[i].getName());
          }
          else
          break;
       }

    }
}
class Store{
  private String name;
  private String location;
  Product productList[];
  int nbProduct=0;

  Store(String name,String location){
    this.name=name;
    this.location=location;
  }

  public String getName(){
    return name;
  }


  public void addProduct(Product p){
    if (productList==null) {
        productList=new Product[100];
    }
     if (nbProduct<100) {
        productList[nbProduct]=p;
        nbProduct++;
     }
     else{
        System.out.println("Limit of adding product has been reached");
     }
  }


  public boolean searchProduct(String productName){


    for (int i=0; i<productList.length; i++) {
        if (productList[i]!=null) {
            if (productList[i].getName().equals(productName)) {
                return true;
            }
        }
        else
        break;
       
    }
    return false;


}
 
  public Product deleteProduct(String productName){
   
   for (int i = 0; i < productList.length; i++) {
        
    if (productList[i].getName().equals(productName)) {
        Product temProduct=productList[i];
        productList[i]=null;
       return temProduct;
    }

   }
   return null;

  }

  public void displayAll(){
           

    for (int i = 0; i < productList.length; i++) {
        if (productList[i]!=null) {
            System.out.println(productList[i].getName());
        }
       
    }

  }


}

class Product{
    private String name;
    private int quantity;
    private double price;

    Product(String name,int quantity,double price){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }
}


public class Task1{
    public static void main(String[] args) {
        
        Product p1=new Product("TV", 4, 34000);
        Product p2=new Product("Bycyle", 4, 5500);
        Product p3=new Product("Oven", 3, 70000);


        Store s1=new Store("Makro", "Karachi");
        Store s2=new Store("HyperMart", "Karachi");
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.displayAll();


        Product tempProduct=s1.deleteProduct("Bycyle");

        if (tempProduct!=null) {
            System.out.println("Product "+tempProduct.getName() + " is deleted");
        }
        else
        System.out.println("No product to delete");
        s1.displayAll();
        s2.addProduct(p1);
        s2.addProduct(p2);
        s2.addProduct(p3);

        Company c1=new Company("Unilever");
        c1.addStore(s1);
        c1.addStore(s2);
        c1.displayAll();


        int n=c1.searchNbofStore("TV");

        System.out.println("Number of stores have TV: "+n);
    }
}