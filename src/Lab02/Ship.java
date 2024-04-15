package Lab02;

public class Ship {
    private int imo;
    private String name;
    private double length;
    private int deadweight;
    private String type;
    private String cargoType;

    public Ship() {
    }

    public Ship(int imo, String name, double length, int deadweight, String type, String cargoType) {
        this.imo = imo;
        this.name = name;
        this.length = length;
        this.deadweight = deadweight;
        this.type = type;
        this.cargoType = cargoType;
    }

    public Ship(int imo, String name) {
        this.imo = imo;
        this.name = name;
    }

    public int getImo() {
        return imo;
    }

    public void setImo(int imo) {
        this.imo = imo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
