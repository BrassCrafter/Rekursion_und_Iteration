package AufgabeVom13_11_2023;

public class Teschtklasse {
    public static void main(String[] args) {
        Queue wort = new Queue<String>();
        Teschtklasse.doShit(wort);
    }
    public static void doShit(Queue wort){


        wort.enqueue("i");

        wort.enqueue("n");

        wort.enqueue("f");

        wort.dequeue();

        wort.dequeue();

        wort.enqueue("o");

        wort.enqueue("r");

        wort.enqueue("m");

        wort.dequeue();

        wort.enqueue("a");

        wort.dequeue();

        wort.enqueue("t");

        wort.front();

        wort.enqueue("i");

        wort.enqueue("k");

        System.out.println(wort.toString());
    }
}
