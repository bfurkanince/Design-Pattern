package patterns.creationalPatterns.factory.abstractFactory.color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
