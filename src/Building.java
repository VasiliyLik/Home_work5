import java.util.ArrayList;

public class Building implements CreateFurniture, CreateIllumination {
    private final String name;
    ArrayList<Room> roomArrayList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(String name, int area, int windows) {

        Room rooms = new Room(name, area, windows);
        roomArrayList.add(rooms);
    }

    @Override
    public void addFurniture(int index, String name, double furnitureArea) {
        try {
            double sumFurnitureArea = furnitureArea, sumRoomArea;
            Room room = roomArrayList.get(index);
            sumRoomArea = room.getArea();
            for (Furniture f : room.furnitureArrayList) {
                sumFurnitureArea += f.getFurnitureArea();
            }
            if ((sumFurnitureArea / sumRoomArea * 100.0) > 70)
                throw new SpaceLimitException("The occupied area limit of 70% has been exceeded!");
            room.addFurnitureInList(name, furnitureArea);
        } catch (SpaceLimitException e) {
            System.out.println(e);
        }
    }

    @Override
    public void addBulb(int index, String name, int power) {
        try {
            int sumPower = power, sumWindows;
            Room room = roomArrayList.get(index);
            sumWindows = room.getWindows() * 700;
            for (Bulb b : room.bulbArrayList) {
                sumPower += b.getPower();
            }
            if (sumPower + sumWindows < 300 || sumPower + sumWindows > 4000)
                throw new IlluminanceLimitException("Illumination is not normal");
            room.addBulbInList(name, power);
        } catch (IlluminanceLimitException e1) {
            System.out.println(e1);
        }
    }

    public void outputInformation(int index) {
        int sumPower = 0;
        double furnitureArea = 0;
        double freeArea = 0;

        System.out.println(getName());
        Room room = roomArrayList.get(index);
        System.out.println(room.getName());
        for (Bulb b : room.bulbArrayList) {
            sumPower += b.getPower();
        }
        for (Furniture f : room.furnitureArrayList) {
            furnitureArea += f.getFurnitureArea();
            freeArea = 100 - (furnitureArea / room.getArea() * 100);
        }
        System.out.println("Illumination = " + ((room.getWindows() * 700) + sumPower) + " (" + room.getWindows() + " windows for 700 lm, " + room.getbulbArrayList());
        System.out.println("Area = " + room.getArea() + " (occupied " + furnitureArea + "м^2" + ", free " + freeArea + "%)");
        System.out.println("Furniture: " + room.getFurnitureList());
    }
}
