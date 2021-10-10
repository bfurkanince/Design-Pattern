package patterns.creationalPatterns.builder;

public class App {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Furkan","Ince")
                .age(25)
                .phone("33333333333")
                .build();
    }

}
