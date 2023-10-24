package _23_10_2023_EVA;

public class Main {
    public static void main(String[] args) {
        //Wir starten natürlich mit 0 als erste Position
        System.out.println("Zahlenfolge 1:");
        for (int i = 0; i < 20; i++) {
            System.out.print(Zahlenfolgen.folge1(i) + " ");
        }
        System.out.println("\n");
        System.out.println("Zahlenfolge 2:");
        for (int i = 0; i < 20; i++) {
            System.out.print(Zahlenfolgen.folge2(i) + " ");
        }
    }
}
