// класс Мебель
public class Furniture {
    private final String name;
    private final double furnitureArea;

    public Furniture(String name, double furnitureArea) {
        this.name = name;
        this.furnitureArea = furnitureArea;
    }
    public double getFurnitureArea() {
        return furnitureArea;
    }

    @Override
    public String toString() {
        return  name +
                " (area " + furnitureArea +
                " м^2)";
    }
}
