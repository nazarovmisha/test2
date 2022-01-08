public class Buildings {
    private int floors;
    private int elevator;
    private String name;

    public Buildings(int floors, int elevator, String name) {
        this.floors = floors;
        this.elevator = elevator;
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getElevator() {
        return elevator;
    }

    public void setElevator(int elevator) {
        this.elevator = elevator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Skyscraper extends Buildings{
    int highSpeedElevator;

    public Skyscraper(int floors, int elevator, String name, int highSpeedElevator) {
        super(floors, elevator, name);
        this.highSpeedElevator = highSpeedElevator;
    }
    public String toString(){ return "Skyspacer" + this.getName() +". Floors = " + this.getFloors() +
            "Elevators =" + getElevator() + "HighSpeedElevator =" + highSpeedElevator;}
}
