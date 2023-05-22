import java.util.LinkedList;

//This application check for the dayly prices of water.
//And make the calculations for the maximum profit.
//Application find the best day for buy and sell for you and let you make the maximum profit.

public class firstQuestion {

    //Creating this class to encapsulate the information about each day's price.
    //So we can store both day number and the corresponding price as a single object.
    private static class PriceListByDay {
        int day;
        int price;

        PriceListByDay(int day, int price){
            this.day = day;
            this.price = price;
        }
    } 

    public static void questionOne(int[] pricesArray) {
        //Created the LinkedList for the dayly prices.
        LinkedList<PriceListByDay> prices = new LinkedList<>();

        //This for loop add every element on the pricesArray which we asked from the user to the PriceListByDay LinkedList.
        for(int j = 0; j <= 6; j++){
            prices.add(new PriceListByDay(j, pricesArray[j]));
        }

        int maximumProfit = maxProfitFinder(prices);

        System.out.println("Seller's maximum profit is: " + maximumProfit);

    }

    private static int maxProfitFinder(LinkedList<PriceListByDay> prices){
        int maxProfit = 0;//Max Profit has to be initiliazed as 0 because if there were no buy and sell day, profit will be 0.
        int buyDay = -1; //Day has to be initiliazed as -1 because there is no index like -1 on list.
        int sellDay = -1;//Day has to be initiliazed as -1 because there is no index like -1 on list.


        for(int k = 0; k < prices.size() -1; k++){
            //This get method get the current price for current day which we check with k variable with for loop.
            PriceListByDay buyPrice = prices.get(k);

            //Every price after the previous price is sell price.
            //We will check these prices and make the necessary calculations to find maximum profit.
            for(int n = k + 1; n < prices.size(); n++){
                PriceListByDay sellPrice = prices.get(n);

                //This currentProfit could be negative with this calculation.
                //But we will check this variable with if condition.
                int currentProfit = sellPrice.price - buyPrice.price;

                //If the currentProfit is bigger than maxProfit(this variable is always updating), we will update the maxProfit variable with the currentProfit variable.
                //After that we will set the buy and sell
                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                    buyDay = buyPrice.day;
                    sellDay = sellPrice.day;
                }
            }
        }

        if(buyDay == -1 && sellDay == -1){
            System.out.println("There is no profit with these prices.");
        }else{
            System.out.println("The seller should buy on this day: " + (buyDay+1));
            System.out.println("The seller should sell on this day: " + (sellDay+1));
        }

        

        return maxProfit;
    }
}