package academy.mate.classes;

public class ExampleAnonClass {
    public void startEngine(){
        System.out.println("Wrooom..");
    }

    public static void main(String[] args) {
        ExampleAnonClass exampleAnonClass = new ExampleAnonClass();
        exampleAnonClass.startEngine();

        ExampleAnonClass exampleAnonClass2 = new ExampleAnonClass() {
            public void startEngine(){
                System.out.println("Whroom whroom...");
            }
        };

        exampleAnonClass2.startEngine();
    }
}
