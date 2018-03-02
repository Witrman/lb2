package barBossHouse;

public class Dish {
    double cost;
    String name;
    String desciption;


    Dish(String name, String description) {
        this.name = name;
        this.desciption = description;
        cost = 0;
    }

    Dish(String name, String description, double cost) {
        this(name, description);
        this.cost = cost;
    }

    String getName() {
        return name;
    }

    double getCost() {
        return cost;
    }

    String getDesciption() {
        return desciption;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCost(double cost) {
        this.cost = cost;
    }

    void setDesciption(String desciption) {
        this.desciption = desciption;
    }

}
