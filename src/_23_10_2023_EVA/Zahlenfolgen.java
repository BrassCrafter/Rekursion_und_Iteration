package _23_10_2023_EVA;

public class Zahlenfolgen {
    public static int folge1(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * folge1(n - 1);
        }
    }
    public static int folge2(int n) {
        if (n == 0) {
            return 2;
        } else {
            return 3 + folge2(n - 1);
        }
    }
}
