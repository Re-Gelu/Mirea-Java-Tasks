import java.util.Objects;

public final class Drink implements Item{
    private final int cost;
    private  final String name, description;

    public Drink(String name, String description, int cost) throws IllegalArgumentException{
        if (cost == 0 || Objects.equals(name, "") || Objects.equals(description, ""))
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}