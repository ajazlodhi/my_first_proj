public class hello_hello {
    public static String carFunctions(double distance, double fuel){
        return "Mileag: " + (distance/fuel) + " km/L";
    }
    public static String carFunctions(double distance, int time){
        return "Speed " + (distance / time) + " Km/H";
    }
    public static String carFunctions(){
        return carFunctions(250.0,5.0) + "\n"
                + carFunctions(200.0, 2);
    }
    public static void main(String[] args){
        String result = carFunctions();
        System.out.println(result);

    }
}
