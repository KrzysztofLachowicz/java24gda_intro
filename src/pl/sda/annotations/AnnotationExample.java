package pl.sda.annotations;

public class AnnotationExample {
    @Annotated
    public void iAmAnnotatedMethod() {
        System.out.println("I'm annotated method!");
    }

    public void iAmNotAnnotatedMethod() {
        System.out.println("I'm NOT annotated!");
    }
}
