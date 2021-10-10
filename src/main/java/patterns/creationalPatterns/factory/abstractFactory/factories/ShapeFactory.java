package patterns.creationalPatterns.factory.abstractFactory.factories;

import org.apache.commons.lang3.StringUtils;
import patterns.creationalPatterns.factory.abstractFactory.AbstactFactory;
import patterns.creationalPatterns.factory.abstractFactory.color.Color;
import patterns.creationalPatterns.factory.abstractFactory.shape.Circle;
import patterns.creationalPatterns.factory.abstractFactory.shape.Rectangle;
import patterns.creationalPatterns.factory.abstractFactory.shape.Shape;
import patterns.creationalPatterns.factory.abstractFactory.shape.Square;

import java.util.Objects;

public class ShapeFactory extends AbstactFactory {

    @Override
    public Shape getShape(String shape) {
        if(Objects.isNull(shape)){
            return null;
        }
        if(StringUtils.equals(shape , "CIRCLE")){
            return new Circle();
        }
        else if(StringUtils.equals(shape , "SQUARE")){
            return new Square();
        }
        else if(StringUtils.equals(shape , "RECTANGLE")){
            return new Rectangle();
        }
        else
            throw new RuntimeException("Shape not found.");

    }
    @Override
    public Color getColor(String color) {
        return null;
    }

}
