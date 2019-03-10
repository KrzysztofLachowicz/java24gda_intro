package pl.sda.stat;

public class StaticExample {
    private static String staticField;

    static {
        staticField = "example of static field";
    }

    public static void main(String[] args) {
        System.out.println(staticField);

        System.out.println(Counter.CLASS_NAME);

        long count1 = Counter.get();
        System.out.println(count1);

        for (int i = 0; i < 10; i++) {
            System.out.println(Counter.get());
        }

        ExternalClass.callCounter();
        InternalClass.callCounter();

        new ExternalClass.InnerStaticClass();
        ExternalClass externalClass = new ExternalClass();
        ExternalClass.InnerNormalClass innerNormalClass = externalClass.new InnerNormalClass();
    }

    public static class InternalClass {
        public static void callCounter() {
            System.out.println("Counter from internal class: ");
            System.out.println(Counter.get());
        }
    }
}
