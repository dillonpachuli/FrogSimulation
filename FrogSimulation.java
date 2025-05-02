import java.util.Scanner;

public class FrogSimulation{
    private int goalDistance;

    private int maxHops;

    public FrogSimulation(int diet, int numHops){
        goalDistance = diet;
        maxHops = numHops;
    }

    private int hopDistance(){
        Scanner s = new Scanner(System.in);
        System.out.println("Distance: ");
        return s.nextInt();
    }

    public boolean simulate(){
        int hops = 0;
        int position = 0;
        while (hops < maxHops){
            position += hopDistance();
            hops++;
            if (position < 0) return false;
            if (position >= goalDistance) return true;
        }
        return false;
    }

    public double runSimulations(int num){
        double goals = 0;
        for (int i = 0; i < num; i++){
            if (simulate()) goals++;
        }
        return goals / num;
    }
}