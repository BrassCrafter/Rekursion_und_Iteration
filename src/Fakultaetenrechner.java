public class Fakultaetenrechner {
    public static int iteration(int n){
        int result = 1;
        for(int i=1; i<=n; i++)result *= i;
        return result;
    }
    public static int recursion(int n){
        if(n<=1) return 1;
        else return n * recursion(n-1);
    }
}
