package patterns.structural.adapter.iphone;

public class IPhoneX implements IPhone {

    @Override
    public void charge() {
        System.out.println("Charging IPhone X");
    }
}
