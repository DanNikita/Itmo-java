package Lab06;

public class Truck extends Car {

    private int wheelsCount;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelsCount, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheels) {
        wheels = this.wheelsCount;
        System.out.println("New wheel count: " + wheels);
    }
}
