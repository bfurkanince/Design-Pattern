package patterns.structural.decorator;

public class App {
    //Mevcut nesnelere, sınıf yapıları değiştirilmeden yeni özelliklerin eklendi
    public static void main(String[] args) {
        EvEsyalari ayna = new CerceveliAyna();
        ayna.produce();
    }

}
