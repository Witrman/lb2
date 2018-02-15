package barBossHouse;



public class TestClass {
    private static Dish d;
    private static Order o;
    private static OrderManager om;

    public static void main(String[] args) {
        System.out.println("Cоздаем пробный заказ в 24 блюда");
        o = new Order();
        add();
        om = new OrderManager(5);
        System.out.println("Помещаем заказ в менеджер на стол 1 и 3");
        om.add(o,3);
        om.add(o,1);
        System.out.println("Добавляем блюдо \"qa\" в заказ на 3 стол");
        d = new Dish("qa", "ss,dd,ff,gg", 1);
        om.addDish(d,3);
        int[] df = om.noFreeTableNums();
        System.out.print("Занятые столы  ");
        for (int dd:df) {
            System.out.print(dd+" ");
        }
        System.out.println("\nПервый свободнй стол "+om.freeTableNum()+"     \nОбщая стоимость заказов "+om.ordersCostSummery());
        System.out.println("Всего заказно блюд с именем \"сx\" "+om.dishQuantity("cx"));
        System.out.println("Удалим заказ с 1 стола");
        om.removeOrder(1);
        int[] dsf = om.noFreeTableNums();
        System.out.print("Занятые столы  ");
        for (int dsd:dsf) {
            System.out.print(dsd+" ");
        }



        o=om.getOrder(3);
        System.out.println("\n\nВсего блюд в заказе 3 стола "+o.dishQuantity());
        String[] st = o.dishesNames();
        System.out.print("Названия блюд в заказе без повторов  ");
        for (String sdf:st) {
            System.out.print(sdf+" ");
        }
        o.removeAll("cx");
        System.out.println("\nУдалить все блюда с названием \"cx\", осталось "+o.dishQuantity());

    }



      private static void add()
      {
          d = new Dish("qa", "ss,dd,ff,gg", 1);
          o.add(d);
          d = new Dish("qw", "ss,dd,ff,gg", 2);
          o.add(d);
          d = new Dish("qw", "ss,dd,ff,gg", 3);
          o.add(d);
          d = new Dish("as", "ss,dd,ff,gg", 4);
          o.add(d);
          d = new Dish("zx", "ss,dd,ff,gg", 5);
          o.add(d);
          d = new Dish("cx", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("zx", "ss,dd,ff,gg", 7);
          o.add(d);
          d = new Dish("xc", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("xc", "ss,dd,ff,gg", 5);
          o.add(d);
          d = new Dish("zx", "ss,dd,ff,gg", 4);
          o.add(d);
          d = new Dish("xc", "ss,dd,ff,gg", 3);
          o.add(d);
          d = new Dish("zx", "ss,dd,ff,gg", 2);
          o.add(d);
          d = new Dish("cx", "ss,dd,ff,gg", 4);
          o.add(d);
          d = new Dish("fd", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 4);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("gz", "ss,dd,ff,gg", 5);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 3);
          o.add(d);
          d = new Dish("df", "ss,dd,ff,gg", 7);
          o.add(d);
          d = new Dish("af", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("vf", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("gx", "ss,dd,ff,gg", 5);
          o.add(d);
          d = new Dish("gc", "ss,dd,ff,gg", 4);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 7);
          o.add(d);
      }
}
