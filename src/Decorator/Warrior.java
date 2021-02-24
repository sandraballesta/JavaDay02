package Decorator;

public class Warrior {
    int hp; //health points
    int dmg; //damage points

    public void setDamages(int dmg) {
        this.dmg = dmg;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public int getHp() {
        return hp;
    }
}
