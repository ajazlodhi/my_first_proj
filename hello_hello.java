public class MySwitchStatementTwo{
    public static void main(String[] args) {
        int number = 44;
        String size = switch (number){
            case 29 -> "Small";
            case 42 -> "Medium";
            case 44 -> "Large";
            case 48, 49, 50 -> "Extra Large";
            default -> "UNKNOWN";
        };
        System.out.println("Size : " + size);
    }
}
