public class Potenzfunktion {
    public static double math(double a, int n){
        return Math.pow(a, n);
    }
    public static double iteration(double a, int n){
        double result = 1;
        for(int i = 1; i <= n; i++)result *=a;
        return result;
    }
    public static double recursion(double a, int n){
        if(n == 0) return 1;
        //else if (n == 1) return a;
        else return a * recursion(a, n-1);
    }
}
