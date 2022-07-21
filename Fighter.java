package baslama;

public class Fighter{
    String name;
    int demage;
    int health;
    int wight;
    Fighter(String name , int demage ,int health,int wight){
        this.name= name;
        this.demage=demage;
        this.health=health;
        this.wight=wight;
    }
    int hit(Fighter feo){
        System.out.println(this.name+" ==> "+feo.name+"  "+this.demage+"  hasar vurdu");
        if (feo.health-this.demage<0){
            return 0;
        }

        return feo.health-this.demage;
    }
}
