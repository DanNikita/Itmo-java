package Lab07;

public class PlaneMain {
    public static void main(String[] args) {
        Plane airbus = new Plane();
        Plane.Wing wing = airbus.new Wing();
        wing.SetWeight(500);
        wing.ShowWingWeight();
        Plane boeing = new Plane();
        Plane.Wing wing1 = boeing.new Wing();
        wing1.SetWeight(1000);
        wing1.ShowWingWeight();
    }
}
