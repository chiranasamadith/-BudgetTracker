package budgetTracker;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu();
        }

        public static void   Menu(){
            BudgetTrackerMethods trackerMethod=new BudgetTrackerMethods();
            Scanner input=new Scanner(System.in);
            boolean continueloop=true;
            while(continueloop){
                System.out.println("******************************** Welcome to the Budget Tracker *********************");
                System.out.println("1.Add Budget");
                System.out.println("2.Display Budget");
                System.out.println("3.Total Budget");
                System.out.println("4.Exit");
                System.out.println("Enter your Choice :");
                int choice=input.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Enter the Date  *yyyy/mm/dd*");
                        String date=input.next();
                        System.out.println("Enter the category :");
                        String category=input.next();
                        System.out.println("Enter the Amount");
                        Double amount=input.nextDouble();

                        trackerMethod.addBudget(date,category,amount);

                        System.out.println("Data Successfully added!!!");


                        break;

                    case 2:
                        trackerMethod.DisplayBudget();
                        break;

                    case 3:
                        System.out.println("Total Budget :"+trackerMethod.totalBudget());

                    case 4:
                        System.out.println("Exiting Budget Tracker. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.Please enter a valid option!!1");
                }
                if (continueloop){
                    System.out.println("Do you want to continue?(1:Yes, 0: No)");
                    int conituneChoice= input.nextInt();
                    if (conituneChoice==0){
                        continueloop=false;
                    }

                }

            }

        }


    }

