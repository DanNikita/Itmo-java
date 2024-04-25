package Lab07;

public class Plane {
    public Plane() {
    }

    public class Wing {
        public int wingWeight;

        public void ShowWingWeight() {
            System.out.println("Wing weight of is " + wingWeight);
        }

        public void SetWeight(int w) {
            this.wingWeight = w;
        }
    }
}
