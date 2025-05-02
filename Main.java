public class Main{
    public static void main(String[] args){
        FrogSimulation f1 = new FrogSimulation(24, 5);
        System.out.println(f1.simulate());
        System.out.println(f1.runSimulations(2));
    }
}