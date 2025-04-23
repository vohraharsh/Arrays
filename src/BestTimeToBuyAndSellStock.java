public class BestTimeToBuyAndSellStock {
    
    public static void main(String[] args) {
        
        int prices [] = {7,1,5,3,6,4};

        int ans = bestTime(prices);

        System.out.println(ans);

    }

    private static int bestTime (int prices []){

        int maxprofit = 0;
        int minsofar = prices[0];


        for(int i=0; i<prices.length; i++){
            minsofar = Math.min(minsofar, prices[i]);
            int profit = prices[i] - minsofar;
            maxprofit = Math.max(maxprofit, profit);
        }

        return maxprofit;
    }
}
