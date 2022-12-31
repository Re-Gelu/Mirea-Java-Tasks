import java.util.ArrayList;
import java.util.Arrays;
//29 че то сделал

public class Main {
    public static void main(String[] args) throws OrderAlreadyException {
        ArrayList<String> dish = new ArrayList<>();
        dish.add("pizza: Peperoni: 590");
        dish.add("cake: Sweet: 700");
        ArrayList<String> drink = new ArrayList<>();
        drink.add("water: Fresh, Bubbles: 160");
        drink.add("juice: Orange, Apple: 190");
        System.out.println("Menu: ");
        for (String s: dish)
            System.out.println(s);
        for (String s: drink)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("pizza", "Peperoni", 590));
        restaurantOrder.addPosition(new Drink("Juice", "Orange", 190));
        System.out.println("\npositions in the order: " + restaurantOrder.count());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.addPosition(new Dish("cake", "Sweet", 700));
        restaurantOrder1.addPosition(new Drink("water", "Fresh, Bubbles", 160));
        System.out.println("Positions in the order: " + restaurantOrder1.count());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));

        System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);
        orderManager.add(restaurantOrder1, 2);
        System.out.println(orderManager.orders());

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addPosition(new Dish("cake", "Sweet", 700));
        internetOrder.addPosition(new Drink("water", "Fresh, Bubbles", 160));

        System.out.println("internet order: ");
        orderManager.add(internetOrder, "test address 1233");
        System.out.println(orderManager.getInternetOrder());

    }
}