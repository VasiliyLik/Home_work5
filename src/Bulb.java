// класс Лампочка
public class Bulb {
    private final String name;
    private final int power;

    public int getPower() {
        return power;
    }

    public Bulb(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return name +
                " (" + power +
                "lm)";
    }
}
