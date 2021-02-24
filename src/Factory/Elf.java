package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elf {
    Toy toy;
    List<GiftPaper> giftpaper = new ArrayList<GiftPaper>();
    Factory factory;

    public void listening(){
        System.out.println("worrrking");
        Scanner sc =new Scanner(System.in);

        String input = sc.nextLine();
        String[] readInput = input.split(" ");

        if (toy != null){
            System.out.println("My hands are full");
            return;
        }

        int num = 0;
        boolean isNum = false;
        try {
            if(readInput.length>1){
                num = Integer.parseInt(readInput[1]);
                isNum = true;
            }
        }
        catch (final NumberFormatException e) {}


        if(readInput[0].contains("get")) {
            if(readInput[1].contains("teddy")) {
                toy = new TeddyBear();
                System.out.println("What a nice one! I would have liked to keep it...");
            }
            else if(readInput[1].contains("gameboy")){
                toy = new Gameboy();
                System.out.println("What a nice one! I would have liked to keep it...");
            }
            else if(isNum) {
                for(int i = 0; i < num; i++){
                giftpaper.add(new GiftPaper());
                }
                System.out.println("What a nice one! I would have liked to keep it...");
            }

        }
        if(readInput[0].contains("pack")) {
            if (!giftpaper.isEmpty()) {
                giftpaper.remove(giftpaper.size() - 1);
                System.out.println("And an other kid will be happy!");
                toy = null;
            } else {
                System.out.println("Wait... I can 't pack it with my shirt.");
            }
        }
    }
}


