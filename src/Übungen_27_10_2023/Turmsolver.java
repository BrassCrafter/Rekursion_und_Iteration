package Übungen_27_10_2023;

public class Turmsolver {
    static int tries = 0;
    public static void turmsolver(int towerHeight){
        String leftStack = "", centerStack = "", rightStack = "";
        for(int i = towerHeight; i > 0; i--){
            leftStack += "" + i + ';';
        }
        System.out.println(leftStack);
        verschiebe(towerHeight, "links", "mitte", "rechts");
        System.out.println("Tries: " + tries);
    }
    public static void verschiebe(int towerHeight, String von, String ueber, String nach){
        if(towerHeight == 1){
            System.out.println("Verschiebe " + towerHeight + " von " + von + " nach " + nach);
            tries++;
            return;
        }
        verschiebe(towerHeight-1, von, nach, ueber);
        System.out.println("Verschiebe " + towerHeight + " von " + von + " nach " + nach);
        tries++;
        verschiebe(towerHeight-1, ueber, von, nach);
    }
    public static void main(String[] args) {
        turmsolver(10);
    }

}
