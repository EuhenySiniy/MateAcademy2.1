package academy.mate.classes;

public class ClassesApp {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass("Mercedes");
        innerClass.startEngine();
        InnerClass.GasTank gasTank = new InnerClass.GasTank();
        gasTank.fuel();

        ExampleLocalClass exampleLocalClass = new ExampleLocalClass();
        exampleLocalClass.say();

        ImmutableClass immutableClass = new ImmutableClass("Mercedes", 2018);
        System.out.println(immutableClass.getBrandCar());
    }
}
