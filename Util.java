

import java.lang.Math;
public class Util {
    public static int factorial(int n){
        return n==0?1:n*factorial(n-1);
    }
    public static int[][] permutations(int[] in){
        int nPerms = factorial(in.length);
        int[][] p = new int[in.length][nPerms];
        permutations(p, in, 0);
        return null;
    }
    private static void permutations(int[][] res, int[] in, int index){
        
    }
}
