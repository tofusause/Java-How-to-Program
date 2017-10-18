package costestimate;

import java.util.Scanner;

public class CostEstimate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int group;
        
        System.out.print("Enter group size (-1 to quit): ");
        group = input.nextInt();
         
        while(group > -1) {
            System.out.printf("Cost estimate per person per day: %d\n", splitCost(group));
            
            System.out.print("Enter group size (-1 to quit): ");
            group = input.nextInt();
        }
    }
    public static int splitCost(int g) {
        int lift = 0, room = 0;
        if (g <= 4)
            room = 120/g;
        if (g > 4 && g <= 8)
            room = 240/g;
        if (g > 8 && g <= 12)
            room = 360/g;
        if (g <= 5)
            lift = 90;
        if (g > 5 && g<10)
            lift = 80;
        if (g > 10)
            lift = 70;
        int cost = lift + room;
        
        return cost;
    }
}
