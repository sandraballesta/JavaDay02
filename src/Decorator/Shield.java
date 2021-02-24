package Decorator;

public class Shield extends StuffDecorator{
    public Shield(Warrior warrior){
        int hp = this.getHp();
        this.hp += 10;
        System.out.println("May this shield protect me against every enemy.");
    }

}
