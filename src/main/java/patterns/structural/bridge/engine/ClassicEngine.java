package patterns.structural.bridge.engine;

public class ClassicEngine implements Engine {
    @Override
    public String startEngine() {
        return "Classic engine";
    }

}