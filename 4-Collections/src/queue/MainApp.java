package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> burgerOrders = new PriorityQueue<>();
        burgerOrders.offer(new BurgerOrder("Big Mac2", 2));
        burgerOrders.offer(new BurgerOrder("Big Mac3", 3));
        burgerOrders.offer(new BurgerOrder("Big Mac4", 4));
        burgerOrders.offer(new BurgerOrder("Big Mac1", 1));

        BurgerOrder order = burgerOrders.peek();

        while (order != null) {
            System.out.println(order);
            order = burgerOrders.poll();

            System.out.println();

            System.out.println(order);
            order = burgerOrders.peek();
        }
    }
}
