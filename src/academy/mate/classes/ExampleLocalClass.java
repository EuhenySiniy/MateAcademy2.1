package academy.mate.classes;

public class ExampleLocalClass {
    final int a = 20;

    public void say() {
        System.out.println("Hello!");
        class Local {
            public void say() {
                System.out.println("My name is Yevhen, and my number is " + a);
            }
        }
        Local local = new Local();
        local.say();
    }
}
