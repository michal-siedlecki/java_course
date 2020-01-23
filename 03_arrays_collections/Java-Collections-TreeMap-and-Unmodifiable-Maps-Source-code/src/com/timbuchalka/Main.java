package com.timbuchalka;

 /*

    Modify the program so that adding items to the shopping basket doesn't
    actually reduce the stock count but, instead, reserves the requested
    number of items.

    You will need to add a "reserved" field to the StockItem class to store the
    number of items reserved.

    Items can continue to be added to the basket, but it should not be possible to
    reserve more than the available stock of any item. An item's available stock
    is the stock count less the reserved amount.

    The stock count for each item is reduced when a basket is checked out, at which
    point all reserved items in the basket have their actual stock count reduced.

    Once checkout is complete, the contents of the basket are cleared.

    It should also be possible to "unreserve" items that were added to the basket
    by mistake.

    The program should prevent any attempt to unreserve more items than were
    reserved for a basket.

    Add code to Main that will unreserve items after they have been added to the basket,
    as well as unreserving items that have not been added to make sure that the code
    can cope with invalid requests like that.

    After checking out the baskets, display the full stock list and the contents of each
    basket that you created.

     */

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);
        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);
        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket bob = new Basket("Bob");
        Basket alice = new Basket("Alice");
        bob.addToBasket(stockList.get("vase"), 20);
        alice.addToBasket(stockList.get("vase"), 20);
        System.out.println(stockList);
        System.out.println(bob);
        bob.removeFromBasket(stockList.get("vase"),30);
        alice.addToBasket(stockList.get("vase"), 10);
        System.out.println(stockList);
        System.out.println(bob);
        checkOut(bob);
        checkOut(alice);
        System.out.println(stockList);



    }

    public static void sellItem(String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return;
        }
        stockList.sellStock(item, quantity);
    }

    public static void checkOut(Basket basket) {
        Map<StockItem, Integer> items = new HashMap<>(basket.Items());
        System.out.println("\nCheckout summary for " + basket.getName());
        double totalSum=0;
        String listItems = "";
        for (Map.Entry<StockItem, Integer> entry : items.entrySet()) {
            StockItem item = entry.getKey();
            int quantity = entry.getValue();
            double currentSum = item.getPrice()*quantity;
            sellItem(item.getName(),quantity);
            totalSum += currentSum;
            listItems += String.format("\t - %s * %s = %.2f\n", item.toString(), quantity, currentSum);

        }
        System.out.println(listItems+"\n total sum : " + String.format("%.2f",totalSum));
    }



}
