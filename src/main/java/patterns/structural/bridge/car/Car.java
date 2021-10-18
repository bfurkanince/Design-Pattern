package patterns.structural.bridge.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import patterns.structural.bridge.engine.Engine;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Car {
    private Engine engine = null;
    private String carName = "";
    public abstract void drive();

    public Car(String carName, Engine engine) {
        setCarName(carName);
        setEngine(engine);
    }

}
