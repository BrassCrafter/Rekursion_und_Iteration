package _23_10_2023_EVA;

public class Zahlenfolgen {
    public static int folge1(int n) {
        if (n == 0)return 1;
        else return 2 * folge1(n - 1);
    }
    public static int folge2(int n) {
        if (n == 0)return 2;
        else return 3 + folge2(n - 1);
    }
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
