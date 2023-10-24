package _20_10_2023_EVA;

import _20_10_2023_EVA.Fakultaetenrechner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Fakultätenrechner----");
        System.out.println("Iteration: " + Fakultaetenrechner.iteration(1));
        System.out.println("Rekursion: " + Fakultaetenrechner.recursion(1));
        System.out.println("------_20_10_2023_EVA.Summenrechner------");
        System.out.println("Gaußsche Summenformel: " + Summenrechner.gaussscheSummenformel(1));
        System.out.println("Iteration: " + Summenrechner.iteration(1));
        System.out.println("Rekursion: " + Summenrechner.recursion(1));
        System.out.println("------_20_10_2023_EVA.Potenzfunktion-----");
        System.out.println("Math.pow: " + Potenzfunktion.math(1, 1));
        System.out.println("Iteration: " + Potenzfunktion.iteration(1, 1));
        System.out.println("Rekursion: " + Potenzfunktion.recursion(1, 1));
    }
}
