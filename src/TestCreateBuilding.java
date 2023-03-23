
public class TestCreateBuilding {
    public static void main(String[] args) {
        Building building = new Building("Build1");
        building.addRoom("room1", 10, 1);
        building.addRoom("room2", 25, 2);

        building.addFurniture(0, "sofa", 3.0);
        building.addFurniture(0, "bad", 3.0);
        building.addFurniture(1, "table", 2.0);

        building.addBulb(0, "bulb", 250);
        building.addBulb(0, "bulb", 250);
        building.addBulb(1, "bulb", 300);

        building.outputInformation(0);
        building.outputInformation(1);
    }
}
