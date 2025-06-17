import java.util.Arrays;
public class Main {
         public static void main(String[] args) {
        int[] Weights = {1, 3, 5, 7};
        int[] profits = {2, 4, 7, 10};
        int bagWeight = 8;
        
        System.out.println("Maximum profit: " + napSack(bagWeight, 0, Weights, profits));
    }
    public static int napSack(int bagWeight, int selectedElement, int[] Weights, int[] profits) {
        if(selectedElement >=Weights.length || bagWeight == 0){
            return 0;
            
        }
        int pick = 0;
        if(bagWeight >= Weights[selectedElement]){
             pick = profits[selectedElement] 
                   + napSack(bagWeight - Weights[selectedElement], selectedElement + 1, Weights, profits);
        }

        int notpick=napSack(bagWeight,selectedElement+1, Weights,profits);
        return Math.max(pick,notpick);
    } 
}
