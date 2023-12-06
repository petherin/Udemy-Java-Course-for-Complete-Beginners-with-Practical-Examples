public class ObjectReferenceApp {
    public static void main(String[] args) {
        Byte numberOfSeats=5;
        Short horsePower=392;
        Integer price=55666;
        Long reg = 456765767L;

        Float fuelConsume = 15.5F;
        Double fuelConPrec=15.5455455;

        Boolean isDamaged=true;
        Character energy ='G';

        String carModel = "ford focus";

        String carModelNew =  new String("blah blah");

        System.out.println("Price: "+ price.floatValue());
        System.out.println("Fuel consum" + fuelConsume.intValue());
        System.out.println("Car model "+ carModel.toUpperCase());
        System.out.println("Car equals "+ carModel.equals(carModelNew));
    }
}
