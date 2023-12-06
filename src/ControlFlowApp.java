public class ControlFlowApp {
    public static void main(String[] args) {
        boolean isDamaged=true;
        String carColour="black";
        char energy='G';

        if (isDamaged){
            System.out.println("Damaged car");
        } else{
            System.out.println("Accident free car");
        }

        if (carColour.equals("black")){
            System.out.println("Black car");
        } else if (carColour.equals("green")){
            System.out.println("Green car");
        }else if (carColour.equals("blue")) {
            System.out.println("Blue car");
        } else{
            System.out.println("Dunno");
        }

        switch (energy){
            case 'A':
            case'B':
                System.out.println("A and B");
                break;
            case 'G':
                System.out.println("G");
                break;
            default:
                System.out.println("Undefined energy category");
        }
    }
}
