package Übungen_27_10_2023;

public class Morsecode {
    public static void morsecodes (int pLaenge, String s){
        if(pLaenge == 0) {
            System.out.println(s);
            return;
        }
        morsecodes(pLaenge-1, s+".");
        if(pLaenge > 1)
            morsecodes(pLaenge-2, s+"-");
    }
    public static void muenzKombinationen(int betrag, int[] muenzen, String s){
        if(betrag == 0){
            System.out.println(s);
            return;
        }
        for(int i = 0; i < muenzen.length; i++){
            if(betrag >= muenzen[i])
                muenzKombinationen(betrag-muenzen[i], muenzen, s + muenzen[i] + " ");
        }
    }
    public static void main(String[] args) {
        //morsecodes(39, "");
        int[] euroMuenzen = {1, 2, 5, 10, 20, 50, 100, 200};
        muenzKombinationen(100, euroMuenzen, "");

    }
    /*
        Ausgaben bei pLaenge = 5
        .....
        ...-
        ..-.
        .-..
        .--
        -...
        -.-
        --.
     */
}
