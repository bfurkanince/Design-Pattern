package patterns.structural.adapter.android;

public class OnePlus5 implements AndroidPhone {
    @Override
    public void charge() {
        System.out.println("Charging OnePlus5");
    }
}
