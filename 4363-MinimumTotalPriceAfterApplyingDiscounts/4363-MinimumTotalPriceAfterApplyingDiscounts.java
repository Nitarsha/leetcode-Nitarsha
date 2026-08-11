// Last updated: 11/08/2026, 14:55:24
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total=0;
        int n =prices.length;
        int m=discounts.length;
        int i=n-1;
        int j=m-1;
        while(i>=0&&j>=0){
            total+=(prices[i]*(100.0-discounts[j]))/100.0;
            i--;
            j--;
        }
        while(i>=0){
            total+=prices[i];
            i--;
        }
        return total;
    }
}