package patterns.creationalPatterns.singleton.lazy;

import java.util.Objects;

public class Home {

    private static  Home home;

    private Home(){

    }

    public static Home getInstance(){
        if(Objects.isNull(home)){
            home = new Home();
        }
        return home;
    }

}
