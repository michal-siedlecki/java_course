package com.timbuchalka;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dev on 17/02/2016.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public void addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0) && (item.adjustAvailability(quantity))) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
        }
    }

    public void removeFromBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0) && (list.containsKey(item))){

            int inBasket = list.get(item);
            if (inBasket < quantity) {
                list.remove(item);
                item.adjustAvailability(-inBasket);
            } else {
                list.replace(item, quantity);
                item.adjustAvailability(-quantity);
            }

        }
    }


    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " reserved\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return String.format("%sTotal cost %.2f", s, totalCost);
    }
}
