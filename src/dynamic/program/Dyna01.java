package dynamic.program;

/**
 * Created by ${LK} on 2018/9/23
 */
public class Dyna01 {
    public int climbStairs(int n){
        if(n == 1) return 1;
        int[] sum = new int[n+1]; //这里要用n+1； n=3，需要4个数，数组下标从0开始，0,1,2,3
        sum[1] = 1;
        sum[2] = 2;
        for(int i = 3; i <= n; i++){
            sum[i] = sum[i-1] + sum[i-2];
        }
        return sum[n];
    }
}
