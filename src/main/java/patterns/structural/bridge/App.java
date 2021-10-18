package patterns.structural.bridge;

import patterns.structural.bridge.car.BMW;
import patterns.structural.bridge.car.Car;
import patterns.structural.bridge.engine.ClassicEngine;
import patterns.structural.bridge.engine.SportEngine;

public class App {

    public static void main(String[] args) {
        //Her design pattern öğesinde olduğu gibi bridge design pattern için de temel amaç soyutlama yöntemi ile
        // mimariler arasında esnek bağ sağlamaktır. En temel prensibimiz, yazılımın geliştirmeye ve genişletmeye açık;
        // ama değişikliğe kapalı olmasıdır. Bridge design pattern’ in kilit noktası soyutlama sınıfları ile gerçekleyen
        // sınıfların ayrı hiyerarşik yapıda olmasıdır. Her iki hiyerarşik yapıda bir üst sınıf vardır ve bu üst sınıflar
        // birbirinden haberdardır. Dolayısıyla detaylar saklanmış olunur.
        //Özetleyecek olursak bridge design pattern ile iki hiyerarşi oluşturduk ve birbirilerini kullanmalarını sağladık.

        Car bmw = new BMW("BMW", new ClassicEngine());
        Car audi = new BMW("Auid", new SportEngine());

        bmw.drive();
        audi.drive();
    }

}
