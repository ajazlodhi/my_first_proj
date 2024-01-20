public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(){

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void move (String speed){
        System.out.println(model+" moves " + speed);
    }
    public void service(int month){
        System.out.println(model + " needs servicing every " + month + " months");
    }
}
