package Composite;

import Factory.GiftPaper;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements ISentence {
    ArrayList<ISentence> childSentence = new ArrayList<ISentence>();

    public void add(ISentence isentence) {
        childSentence.add(isentence);
    }
    public void remove(ISentence isentence) {
        childSentence.remove(isentence);
    }
    public void print(){
        childSentence.forEach(ISentence::print);
    }

}
