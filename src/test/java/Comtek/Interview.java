package Comtek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        List<Map<String, Object>> orders = List.of(
                Map.of("orderId", 101, "customerName", "John Doe", "orderAmount", 250.5, "items", List.of(Map.of("itemName", "Laptop", "quantity", 1))),
                Map.of("orderId", 102, "customerName", "", "orderAmount", 150.0, "items", List.of(Map.of("itemName", "Keyboard", "quantity", 1))),
                Map.of("orderId", 103, "customerName", "Alice Smith", "orderAmount", -100.0, "items", List.of(Map.of("itemName", "Monitor", "quantity", 1))),
                Map.of("orderId", 104, "customerName", "Bob Brown", "orderAmount", 300.0, "items", List.of()),
                Map.of("orderId", 105, "customerName", "Charlie", "orderAmount", 120.0, "items", List.of(Map.of("itemName", "Mouse", "quantity", 1), Map.of("itemName", "Keyboard", "quantity", 1))
                ));
        Map<String, Integer> result = validateOrders(orders);
    }

    public static Map<String, Integer> validateOrders(List<Map<String, Object>> orders) {
        int validOrders = 0;
        int invalidOrders = 0;
        double totalIncome = 0;

        for (Map<String, Object> order : orders) {
            String customerName = (String) order.get("customerName");
            double orderAmount = (double) order.get("orderAmount");
            List<Map<String, Object>> items = (List<Map<String,Object>> )order.get("items");

           boolean invalid = !customerName.isEmpty() && !items.isEmpty() && orderAmount > 0 && !items.isEmpty();

           if (invalid) {
               validOrders ++;
               totalIncome += orderAmount;
           } else {
               invalidOrders ++;
           }

        }

        int totalIncomeInt = (int) Math.round(totalIncome);

        Map<String, Integer> result = new HashMap<>();
        result.put("validOrders", validOrders);
        result.put("invalidOrders", invalidOrders);
        result.put("totalIncome", totalIncomeInt);
        System.out.println("Valid orders: " + validOrders);
        System.out.println("Invalid orders: " + invalidOrders);
        System.out.println("Total income: " + totalIncomeInt);

        return result;
    }
}

/*
[
    { "orderId": 101, "customerName": "John Doe", "orderAmount": 250.5, "items": [{ "itemName": "Laptop", "quantity": 1 }] },
    { "orderId": 102, "customerName": "", "orderAmount": 150.0, "items": [{ "itemName": "Keyboard", "quantity": 1 }] },
    { "orderId": 103, "customerName": "Alice Smith", "orderAmount": -100.0, "items": [{ "itemName": "Monitor", "quantity": 2 }] },
    { "orderId": 104, "customerName": "Bob Brown", "orderAmount": 300.0, "items": [] },
    { "orderId": 105, "customerName": "Charlie", "orderAmount": 120.0, "items": [{ "itemName": "Mouse", "quantity": 1 }, { "itemName": "Keyboard", "quantity": 1 }] }
]
 */

// https://qainterview.pythonanywhere.com/