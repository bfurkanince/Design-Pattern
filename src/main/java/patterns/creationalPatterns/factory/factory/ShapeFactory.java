package patterns.creationalPatterns.factory.factory;

import org.apache.commons.lang3.StringUtils;

public class ShapeFactory {

    public Shape getShape(ShapeEnum shape){

        if(StringUtils.equals(shape.name() , ShapeEnum.Rectangle.name())){
            return new Rectangle();
        }
        else if(StringUtils.equals(shape.name() , ShapeEnum.Circle.name())){
            return new Circle();
        }
        else if(StringUtils.equals(shape.name() , ShapeEnum.Square.name())){
            return new Square();
        }
        else
            throw new RuntimeException("Shape not found.");
    }
}
