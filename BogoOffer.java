package com.java.ex;

import java.util.*;

public class BogoOffer {

    public static void main(String[] args) {
        // Test Input 1
        List<Integer> productPrices = Arrays.asList(10, 20, 30, 40, 50, 60);
        
        // Test Input 2
        //List<Integer> productPrices = Arrays.asList(10, 20, 30, 40, 50, 50, 60);

        // Call the function to maximize discount
        maximizeDiscount(productPrices);
    }

    public static void maximizeDiscount(List<Integer> prices) {
        // Sort the product prices in descending order
        List<Integer> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices, Collections.reverseOrder());

        // Create lists to hold the free and payable items
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();

        // Iterate over the sorted list and apply the BOGO logic
        for (int i = 0; i < sortedPrices.size(); i++) {
            if (i % 2 == 0) {
                // This is a payable item
                payableItems.add(sortedPrices.get(i));
            } else {
                // This is a free item
                discountedItems.add(sortedPrices.get(i));
            }
        }

        // Output the result
        System.out.println("Discounted Items (Free): " + discountedItems);
        System.out.println("Payable Items: " + payableItems);
    }
}
