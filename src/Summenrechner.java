public class Summenrechner {
    public static int iteration(int n){
        int result = 0;
        for(int i = 1; i<=n; i++)result += i;
        return result;
    }
    public static int recursion(int n){
        if(n == 1) return 1;
        else return n + recursion(n-1);
    }
    public static int gaussscheSummenformel(int n){
        return (n*(n+1))/2;
    }
}
