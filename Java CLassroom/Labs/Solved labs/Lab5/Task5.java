class Alien{
    private int health;
    private String name;

    Alien(String name){
        this.name=name;
    }
    public void setHealth(int health){
         this.health=health;
    }
    public int getHealth(){
          return health;
    }
    public String getName(){
        return name;
    }
    public int getDamage(){
        return 0;
    }
}
class OGRE_Alien extends Alien{
      OGRE_Alien(String name){
          super(name);
      }

    public int getDamage(){
        return 6;
    }
}
class SNAKE_ALIEN extends Alien{
    SNAKE_ALIEN(String name){
        super(name);
    }

    public int getDamage(){
        return 10;
    }
}
class MARSHMALLOW_MAN_ALIEN extends Alien{

    MARSHMALLOW_MAN_ALIEN(String name){
        super(name);
    }
    public int getDamage(){
        return 1;
    }
}
class Alienpack{
    private Alien[] aliens;
    private int nbofAliens=0;

    int totalDamage;
    public Alienpack(int numAliens){
        aliens=new Alien[numAliens];
    }
    public void addAlien(Alien newAlien){
        aliens[nbofAliens]=newAlien;
        ++nbofAliens;
    }
    public int calculateDamage(){
      for(int i=0; i<nbofAliens; i++){
      totalDamage+=aliens[i].getDamage();
    }
    return totalDamage;
    }
}
   

public class Task5 {
    public static void main(String[] args) {
        Alienpack alienpack=new Alienpack(5);

        Alien sackAlien=new SNAKE_ALIEN("Python");
        Alien OGRE_Alien=new OGRE_Alien("Shrek");
        Alien MARSHMALLOw=new MARSHMALLOW_MAN_ALIEN("Mellow");

        alienpack.addAlien(OGRE_Alien);
        alienpack.addAlien(sackAlien);
        alienpack.addAlien(MARSHMALLOw);

        int totalDamage=alienpack.calculateDamage();
        System.out.println("Total damage: " + totalDamage);
        
    }    
}
