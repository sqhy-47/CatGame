public class Cat1 {
    private String name;
    private String weapon;
    private int health;
    private int strength; 
    
public Cat1(String name, String weapon, int health, int strength){
    this.name = name;
    this.weapon = weapon;
    this.health = health;
    this.strength = strength;
}

public void damagebypaw(){ 
    int dmgTaken = 10 * (1 + strength/100); 
    this.health -= dmgTaken;
    if(this.health <=0){
        this.health = 0;
        System.out.print(getName() + " lost, what a loser!");
        System.exit(0); 
    }
    System.out.println(this.name + " got smacked by paw. Health is down by " + dmgTaken + ". Current Health:" + this.health);

}

public void damagebycuteness(){
    int dmgTaken = 50 * (1 + strength/100);
    health -= dmgTaken;
    if(this.health <=0){
        this.health = 0;
        System.out.print(getName() + " lost, what a loser!");
        System.exit(0);
    }
    System.out.println(this.name + " got smacked by beauty lmao. Health is down by " + dmgTaken + ". Current Health:" + this.health);
}
//get set name
public String getName() {
    return name;
    }
public void setName(String name){
    this.name = name;
}
//get set health
public void setHealth(int Health) {
    this.health = health;
    }
public int getHealth(){
    return health; 
}
//get set weapon
public String getWeapon(){
    return weapon; 
}
public void setWeapon(String weapon){
    this.weapon = weapon;
}
//get set strenght
public int getStrength(){
    return this.strength;
}
public void setStrength(int strength){
    this.strength = strength; 
}

// attack method example to show how target works
public void attack(Cat1 target) {
    target.health -= strength;
    System.out.println(this.name + " attacked " + target.name + ", dealing " + strength + "dmg pts");
}
}