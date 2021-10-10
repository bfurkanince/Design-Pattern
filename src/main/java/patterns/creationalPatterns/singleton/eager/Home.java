package patterns.creationalPatterns.singleton.eager;

public class Home {

    private static Home home = new Home();

    private Home(){

    }

    public static Home getInstance(){
        return home;
    }

}
