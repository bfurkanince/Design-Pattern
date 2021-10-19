package patterns.structural.decorator;

public class CerceveliAyna extends AynaDecorator {
    @Override
    public void produce() {
        getAyna().produce();
        addBorder();
    }

    private void addBorder() {
        System.out.println("Aynaya cerceve eklendi.");
    }
}
