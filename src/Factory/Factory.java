package Factory;

public class Factory {

    public Toy create(String str){
        if (str == "teddy") {
            return new TeddyBear();
        }
            return new Gameboy();
    }
    public GiftPaper getPaper(){
        return new GiftPaper();
    }
}
