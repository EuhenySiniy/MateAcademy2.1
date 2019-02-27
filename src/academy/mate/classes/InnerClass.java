package academy.mate.classes;

public class InnerClass {
    private String brandOfCar;

    //non-static inner class..
    private class Motor {
        public void checkEngine() {
            System.out.println("Engine " + brandOfCar + " is ready for start!");
        }
    }

    //static inner class
    public static class GasTank {
        public void fuel() {
            System.out.println("Gas tank full.");
        }
    }

    public InnerClass (String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public void startEngine() {
        Motor motor = new Motor();
        motor.checkEngine();
        System.out.println("Engine " + brandOfCar + " is starting.");
    }
}
