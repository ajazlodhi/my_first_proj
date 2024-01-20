import java.util.concurrent.Callable;

public class MainClass {
    public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("Toyota", "Camry", 2023);
    doVheicleStuff(vehicle,"Fast",1);
    Car car = new Car();
    doVheicleStuff(car,"Fast",2);
    Car audi = new Car("Audi",2020);
    doVheicleStuff(audi,"Fast",2);
    Car tesla = new Car("Tesla",2023,4,1000);
    doVheicleStuff(tesla,"Super Fast",1);
    }
    public static void doVheicleStuff( Vehicle vehicle, String speed, int month){
        vehicle.service(month);
        vehicle.move(speed);
        System.out.println(vehicle);
        System.out.println("-----");
    }
}
