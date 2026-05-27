public class buyAndSellStocks {
    public static void main(String[]args){
        int prices[]={7,1,5,3,6,4};
        int  bp=Integer.MAX_VALUE;      // bp-> buyprice
int maxProfit=0;
for(int i=0; i<prices.length; i++){

if(prices[i]>bp){
    int profit=prices[i]-bp;
    maxProfit=Math.max(profit, maxProfit);
}
    if(bp>prices[i]){
      bp=prices[i];
    }
}
System.out.println("maximum profit of stocks:"+maxProfit);
    }
    
}
