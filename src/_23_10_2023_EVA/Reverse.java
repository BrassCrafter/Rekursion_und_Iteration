package _23_10_2023_EVA;

public class Reverse {
    public static int reverseNums(int x, int length){
        if(x/10 == 0)return x;
        else return (int)Math.ceil((x%10)*Math.pow(10, (length-1)) + reverseNums(x/10, length-1));
    }
    public static String reverseStrings(String s){
        if(s.length() <= 1)return s;
        else return s.charAt(s.length() - 1) + reverseStrings(s.substring(0, s.length()-1)); //s.substring(0, s.length()-1) erstellt einen String der vom charAt(0) bis zum charAt(s.length()-1) reicht.
    }
    public static void main(String[] args) {
        System.out.println("Aufgabe 2a)");
        int randnum = (int)Math.ceil(Math.random()*10000);
        String srandnum = "" + randnum;
        System.out.println(randnum + " reversed: " + reverseNums(randnum, srandnum.length()));

        System.out.println("\nAufgabe 2b)");
        String s = "Kugguk";
        System.out.println("'" + s + "'" + " rückwärts: " + Reverse.reverseStrings(s));
    }
}
