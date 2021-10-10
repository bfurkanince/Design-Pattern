package patterns.creationalPatterns.factory.abstractFactory.producer;

import org.apache.commons.lang3.StringUtils;
import patterns.creationalPatterns.factory.abstractFactory.AbstactFactory;
import patterns.creationalPatterns.factory.abstractFactory.factories.ColorFactory;
import patterns.creationalPatterns.factory.abstractFactory.factories.ShapeFactory;

public class FactoryProducer {
    public static AbstactFactory getFactory(String choice){
        if(StringUtils.equals(choice , "SHAPE")){
            return new ShapeFactory();
        }
        else if (StringUtils.equals(choice , "COLOR")){
            return new ColorFactory();
        }
        else
            throw new RuntimeException("Factory not found.");
    }
}
