package barBossHouse;

import java.util.Objects;

public class Order {
    int size;
    Dish[] dishes;

    Order() {
        dishes = new Dish[16];
    }

    Order(int size) {
        dishes = new Dish[size];
    }

    Order(Dish[] dishes) {
        this.dishes = dishes;
    }

    boolean add(Dish dish) {
        for (int i = 0; i < dishes.length; i++) {
            if (i==dishes.length-1 && dishes[i]!=null) {doubleOrderDishes();}
            if (dishes[i] == null) {
                dishes[i] = dish;
                return true;
            }
        }
        return false;
    }

    private void doubleOrderDishes()
    {
        Dish[] dishes1 = new Dish[dishes.length*2];
        for (int i = 0; i < dishes.length; i++) {
                dishes1[i] = dishes[i];

        }
        dishes=dishes1;

    }

    boolean remove(String dishName) {
        for (int i = 0; i < dishes.length; i++) {
            if (Objects.equals(dishes[i].getName(), dishName)) {
                for (int j = i; j < dishes.length-1 ; j++) {
                    dishes[j]=dishes[j+1];
                    if (j==dishes.length-1){dishes[j+1]=null;}
                }
                return true;
            }
        }
        return false;
    }

    int removeAll(String dishName) {
        int count = 0;
        for (int i = 0; i < dishes.length; i++) {
            if (dishes[i] != null && Objects.equals(dishes[i].getName(), dishName)) {
                for (int j = i; j < dishes.length-1 ; j++) {
                    dishes[j]=dishes[j+1];
                    if (j==dishes.length-1){dishes[j+1]=null;}
                }
                count++;
            }
        }
        return count;
    }

    int dishQuantity()
    {
        int count = 0;
        for (Dish dish : dishes) {
            if (dish != null) {
                count++;
            }
        }
        return count;
    }

    int dishQuantity(String dishName)
    {
        int count = 0;
        for (Dish dish : dishes) {
            if (dish != null && Objects.equals(dish.getName(), dishName)) {
            count++;
            }
        }
        return count;
    }

    Dish[] getDishes() {
        Dish[] bdishes = new Dish[dishQuantity()];
        for (int i = 0; i < bdishes.length; i++) {
            bdishes[i]=dishes[i];
        }
        return bdishes;
    }

    double costTotal()
    {   double sum = 0;
        for (Dish dish : dishes) {
            if (dish != null) {
                sum+= dish.cost;
            }
        }
        return sum;
    }

    String[] dishesNames()
    {
        int h=0;
        String[] dishNames = new String[dishQuantity()];
        for (int i =0  ; i < dishNames.length-1;i++  ) {
            for (int j = 0; j <dishNames.length && i<24 ; j++) {
                if(dishNames[j]==dishes[i].getName())
                { i++;
                j=0;}
            }
            if(i==dishQuantity())continue;
            dishNames[h] = dishes[i].getName();
            h++;
        }
        String[] dishNamesRezult = new String[h];
        for (int i = 0; i <dishNamesRezult.length ; i++) {
            dishNamesRezult[i]=dishNames[i];
        }
        return dishNamesRezult;
    }

Dish[] sortedDishesByCostDesc()
{    Dish bufDish;
    for (int i = 0; i <  dishQuantity()-1; i++) {
        for (int j = 0; j < dishQuantity()-1; j++) {
             if (dishes[j].getCost()>=dishes[j+1].getCost())
             {
                 bufDish = dishes[j];
                 dishes[j] = dishes[j+1];
                 dishes[j+1]=bufDish;
             }
        }
    }
    return getDishes();
}






}
