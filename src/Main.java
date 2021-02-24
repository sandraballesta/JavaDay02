import Factory.Elf;
import Composite.SentenceComposite;
import Composite.Word;
import Decorator.FireSword;
import Decorator.Shield;
import Decorator.BasicWarrior;
import Decorator.KingWarrior;
import Decorator.Warrior;


public class Main {

    public static void main(String[] args) {

        //Elf elf = new Elf();
        //elf.listening();

        Word w1 = new Word();
        Word w2 = new Word();
        Word w3 = new Word();
        Word w4 = new Word();
        SentenceComposite sc1 = new SentenceComposite();
        SentenceComposite sc2 = new SentenceComposite();
        SentenceComposite sc3 = new SentenceComposite();
        sc1.add(w1);
        sc1.add(w2);
        sc1.add(w3);
        sc2.add(w4);
        sc3.add(sc1);
        sc3.add(sc2);
        sc3.print();

        Warrior albert = new BasicWarrior();
        System.out.println(" Albert has " + albert.getHp() + " health points .");
        albert = new Shield(albert);
        System.out.println(" Albert has " + albert.getHp() + " health points .");
        Warrior georges = new KingWarrior();
        System.out.println(" Georges has " + georges . getHp () + " health points and can hit " + georges . getDmg () + " damages .");
        georges = new FireSword(georges);
        georges = new Shield(georges);
        System.out.println(" Georges has " + georges.getHp() + " health points .");
        System.out.println(" Georges can hit " + georges.getDmg() + " damages .");
    }


    }

