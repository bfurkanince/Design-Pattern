package patterns.creationalPatterns.factory.abstractFactory.factories;

import org.apache.commons.lang3.StringUtils;
import patterns.creationalPatterns.factory.abstractFactory.AbstactFactory;
import patterns.creationalPatterns.factory.abstractFactory.color.Blue;
import patterns.creationalPatterns.factory.abstractFactory.color.Color;
import patterns.creationalPatterns.factory.abstractFactory.color.Green;
import patterns.creationalPatterns.factory.abstractFactory.color.Red;
import patterns.creationalPatterns.factory.abstractFactory.shape.Shape;

import java.util.Objects;

public class ColorFactory extends AbstactFactory {
    @Override
    public Color getColor(String color) {
        if(Objects.isNull(color)){
            return null;
        }
        if(StringUtils.equals(color,"BLUE")){
            return new Blue();
        }
        else  if(StringUtils.equals(color,"GREEN")){
            return new Green();
        }
        else  if(StringUtils.equals(color,"RED")){
            return new Red();
        }
        else
            throw new RuntimeException("Color not found.");
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
