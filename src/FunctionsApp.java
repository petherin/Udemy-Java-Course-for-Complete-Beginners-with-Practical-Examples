public class FunctionsApp {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(5);
        System.out.println("The price with 10% off: " + getTenPercentOfDiscountPrice(2323));
        System.out.println("The price with 10% off: " + getDiscountPrice(1340000, 90));
        System.out.println("The price with 10% off: " + getDiscountPrice(1000.12, 90));

    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void blackboardPunishment(int repeatNumber){
        for (int i = 0; i < repeatNumber; i++) {
            System.out.println("Being right sucks");
        }
    }

    static double getTenPercentOfDiscountPrice(int price){
        return price *0.9;
    }

    static double getDiscountPrice(int price, int percent){
        return price * percent/100.0;
    }

    static double getDiscountPrice(double price, int percent){
        return price * percent/100;
    }

}
