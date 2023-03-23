import java.util.ArrayList;
import java.util.List;

public class Room {
    private final String name;
    private final int area;
    private final int windows;

    List<Furniture> furnitureArrayList = new ArrayList<>();
    List<Bulb> bulbArrayList = new ArrayList<>();

    public List<Furniture> getFurnitureList() {
        return furnitureArrayList;
    }

    public List<Bulb> getbulbArrayList() {
        return bulbArrayList;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getWindows() {
        return windows;
    }

    public Room(String name, int area, int windows) {
        this.name = name;
        this.area = area;
        this.windows = windows;
    }

    public void addFurnitureInList(String name, double furnitureArea) {
        Furniture furnitures = new Furniture(name, furnitureArea);
        furnitureArrayList.add(furnitures);
    }

    public void addBulbInList(String name, int power) {
        Bulb bulbs = new Bulb(name, power);
        bulbArrayList.add(bulbs);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", windows=" + windows +
                ", furnitureArrayList=" + furnitureArrayList +
                ", bulbArrayList=" + bulbArrayList +
                '}';
    }


}
