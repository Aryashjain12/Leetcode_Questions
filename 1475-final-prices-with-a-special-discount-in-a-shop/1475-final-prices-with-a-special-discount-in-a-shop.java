class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i = 0 ; i<prices.length ; i++){
            int disc = 0 ;
            for(int j = i+1 ; j <prices.length ; j++){
                if(prices[j]<=prices[i]){
                    disc = prices[j];
                    break;
                }
            }
            prices[i] = prices[i]-disc;
        }
        return prices;
    }
}