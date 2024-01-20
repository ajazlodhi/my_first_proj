public class Car extends Vehicle{
    private int NumberofDoors;
    private int horsePower;

    public Car(String make, int year, int numberofDoors, int horsePower) {
        super(make, year > 2020 ? make + "Latest Model" :(year < 2000 ? make +"Previous Model": make+"old model : make"), year);
        NumberofDoors = numberofDoors;
        this.horsePower = horsePower;
    }

    public Car(){
        super("Honda","Accord",2023);
    }
    public Car(String make, int year){
        this(make,year,4,9);
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberofDoors=" + NumberofDoors +
                ", horsePower=" + horsePower +
                "} " + super.toString();
    }
}
