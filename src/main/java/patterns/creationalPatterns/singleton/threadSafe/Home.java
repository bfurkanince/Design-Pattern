package patterns.creationalPatterns.singleton.threadSafe;

import java.util.Objects;

public class Home {

    private static Home home;

    private Home(){

    }

    public static synchronized Home getInstance(){
        if(Objects.isNull(home)){
            home = new Home();
        }
        return home;
    }

}
