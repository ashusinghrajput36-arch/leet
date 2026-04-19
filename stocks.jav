class Solution {
    
    public int maxProfit(int[] prices) {
      
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // prices ko ek baar check karna h, aur har price ke liye minPrice aur maxProfit ko update karna hoga.
        for (int price : prices) {
            // yaad rakhna hoga sabse km price ko, taki uske baad ke price se profit calculate kar sake.
            minPrice = Math.min(minPrice, price);
            // Check hoga ki selling price aur minPrice ke beech ka profit maxProfit se bada hai ya nahi,
            // agar bada hai to maxProfit ko update karna hoga.
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
