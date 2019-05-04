package extractmethod.after;

import java.util.ArrayList;
import java.util.List;
//https://github.com/sunnypatel165/31DaysOfRefactoringInJava/tree/master/src/com/sunnypatel/daysofrefactoringjava/day10/extractmethod
public class Receipt {
    private List<Integer> discounts = new ArrayList<>();
    private List<Integer> itemTotals = new ArrayList<>();

    public double CalculateGrandTotal()
    {
        double subTotal = calculateItemsTotal();
        subTotal = calculateDiscounts(subTotal);
        subTotal = calculateTax(subTotal);
        return subTotal;
    }
    private double calculateItemsTotal(){
        double subTotal=0.0;
        for(Integer item : itemTotals)
            subTotal += item;
        return subTotal;
    }
    private double calculateDiscounts(double subTotal){
        for(Integer discount: discounts)
            subTotal -= discount;
        return subTotal;
    }
    private double calculateTax(double subTotal){
        return subTotal + 0.65 * subTotal;
    }
}