package Decorator;

public class StuffDecorator extends Warrior{
    protected Warrior holder;

    public int getDmg() {
        return dmg;
    }

    public int getHp() {
        return hp;
    }
}
