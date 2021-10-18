package patterns.structural.bridge.car;

import patterns.structural.bridge.engine.Engine;

public class BMW extends Car {

    public BMW(String carName, Engine engine) {
        super(carName, engine);
    }

    @Override
    public void drive() {
        System.out.println(getCarName().concat(" with: ").concat(getEngine().startEngine()));
    }

}