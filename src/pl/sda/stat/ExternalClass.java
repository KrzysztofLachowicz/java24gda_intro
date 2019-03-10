package pl.sda.stat;

public class ExternalClass {
    public ExternalClass() {
        InnerNormalClass innerNormalClass = new InnerNormalClass();
    }

    public static void callCounter() {
        System.out.println("Counter from external class: ");
        System.out.println(Counter.get());
    }

    public static class InnerStaticClass {
        InnerStaticClass() {
            System.out.println("InnerStaticClass");
        }
    }

    public class InnerNormalClass {
        InnerNormalClass() {
            System.out.println("InnerNormalClass");
        }
    }
}
