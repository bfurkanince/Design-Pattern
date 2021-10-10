package patterns.creationalPatterns.factory.abstractFactory;

import patterns.creationalPatterns.factory.abstractFactory.color.Color;
import patterns.creationalPatterns.factory.abstractFactory.producer.FactoryProducer;
import patterns.creationalPatterns.factory.abstractFactory.shape.Shape;

public class App {

    public static void main(String[] args) {
        AbstactFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();

        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();

        AbstactFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color colorBlue = colorFactory.getColor("BLUE");
        colorBlue.fill();

        Color colorGreen = colorFactory.getColor("GREEN");
        colorGreen.fill();

        Color colorRed = colorFactory.getColor("RED");
        colorRed.fill();

    }

}
