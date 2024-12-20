package poly.car1;

public class K3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("k3Car starting engine");

    }

    @Override
    public void offEngine() {
        System.out.println("k3car.offEngine");

    }

    @Override
    public void pressAccelerator() {
        System.out.println("k3car.pressAccelerator");

    }
}
