package dynamic.program;

/**
 * Created by zhaochoudecat on 2018/9/25
 * 买卖股票的最佳时机
 */

//暴力求解
public class Dyna02_1 {
    public int maxProfit(int[] prices){
        if(prices == null || prices.length == 0)return 0;
        int MAX = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                MAX  = Math.max(MAX,prices[j] - prices[i]);
            }
        }
        return MAX;
    }
}
