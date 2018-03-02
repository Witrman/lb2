package barBossHouse;

public class OrderManager {
    Order[] orders;

    OrderManager(int count) {
        orders = new Order[count];
    }

    void add(Order order, int tableNum) {
        orders[tableNum] = order;

    }

    Order getOrder(int tableNum) {
        return orders[tableNum];
    }

    void addDish(Dish dish, int tableNum) {
        orders[tableNum].add(dish);
    }

    void removeOrder(int tableNum) {
        orders[tableNum] = null;
    }

    int freeTableNum() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
    }

    int[] freeTableNums() {
        int[] nums = new int[orders.length];
        int j = 0;
        for (int i = 0; i < nums.length && j < nums.length; i++) {
            if (orders[i] == null) {
                nums[j] = i;
                j++;
            }
        }
        int[] numsRez = new int[j];
        for (int i = 0; i < j; i++) {
            numsRez[i] = nums[i];
        }
        return numsRez;
    }


    int[] noFreeTableNums() {
        int[] nums = new int[orders.length];
        int j = 0;
        for (int i = 0; i < nums.length && j < nums.length; i++) {
            if (orders[i] != null) {
                nums[j] = i;
                j++;
            }
        }
        int[] numsRez = new int[j];
        for (int i = 0; i < j; i++) {
            numsRez[i] = nums[i];
        }
        return numsRez;
    }

    Order[] getOrders() {
        Order[] or = orders;
        int j = 0;
        for (int i = 0; i < or.length && j < or.length; i++) {
            if (orders[i] != null) {
                or[j] = orders[i];
                j++;
            }
        }
        Order[] ordRez = new Order[j];
        for (int i = 0; i < j; i++) {
            ordRez[i] = or[i];
        }
        return ordRez;
    }

    double ordersCostSummery() {
        double sum = 0;
        for (Order order : orders) {
            if (order != null) {
                sum += order.costTotal();
            }
        }
        return sum;
    }

    int dishQuantity(String dishName) {
        int sum = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                sum += orders[i].dishQuantity(dishName);
            }
        }
        return sum;
    }

}
