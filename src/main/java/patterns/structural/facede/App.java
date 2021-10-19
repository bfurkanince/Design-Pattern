package patterns.structural.facede;

public class App {

    //Karmaşık alt sistemleri olan bir yapıyı ; tek , makul bir arayüz sağlayan Facade sınıfı oluşturarak basitleştirebiliriz.
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }

}
