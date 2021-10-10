package patterns.creationalPatterns.factory.abstractFactory;

import patterns.creationalPatterns.factory.abstractFactory.color.Color;
import patterns.creationalPatterns.factory.abstractFactory.shape.Shape;

public abstract class AbstactFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
