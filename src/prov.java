public class prov {
    private static   Dish d ;
  private static Order o  ;

    public static void main(String[] args) {
      o = new Order();
  add();
  o.pr();
        System.out.println();
Dish[] d = o.sortedDishesByCostDesc();
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i].getName()+"   "+d[i].getCost());
        }

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
          d = new Dish("gf", "ss,dd,ff,gg", 5);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 3);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 7);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 6);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 5);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 4);
          o.add(d);
          d = new Dish("gf", "ss,dd,ff,gg", 7);
          o.add(d);
      }
}
