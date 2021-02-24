package Decorator;

public class FireSword extends StuffDecorator {
    public FireSword(Warrior warrior){
        int dmg = this.getDmg();
        this.dmg += 3;
        System.out.println("I can slice and burn like the wind and the flames.");
    }
}
