package javapractice.practi;

public class StockProfit {
	public int maxProfit(int[] prices) {

        int auxarr[]= new int[prices.length];
        int maxvalue=prices[prices.length -1];
        for(int i=prices.length -2 ; i>=0 ; i-- ) {
            if(prices[i] >maxvalue){
            	maxvalue=prices[i];
                auxarr[i]=maxvalue;
            }
            else
               auxarr[i]=maxvalue;
        }
        
        int maxprofit=0;
        for(int i=0 ;  i<prices.length ; i++){
             maxprofit= Math.max(maxprofit , ( auxarr[i] - prices[i] ) );   
        }

        return maxprofit;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,4,3,1};
		StockProfit ob = new StockProfit();
		int maxProfit = ob.maxProfit(arr);
		System.out.println(maxProfit);

	}

}
