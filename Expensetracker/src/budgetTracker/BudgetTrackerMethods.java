package budgetTracker;

import java.util.ArrayList;

public class BudgetTrackerMethods {
    private final ArrayList<Budget> budgetArrayList=new ArrayList<>();


    public  void addBudget(String date, String category, Double amount) {
        Budget budget=new Budget( date, category, amount);
        budgetArrayList.add(budget);
    }

    public void DisplayBudget() {
        System.out.println("Date\t\ttCategory\t\tAmount");
        System.out.println("---------------------------------------------------------");
        for (Budget i:budgetArrayList){
            System.out.println(i.date+"\t\t"+i.category+"\t\t"+i.amount);
        }
        System.out.println("---------------------------------------------------------");
    }

    public double totalBudget() {
        double total=0;
        for(Budget i:budgetArrayList){
            total+=i.amount;

        }
        return total;
    }
}
