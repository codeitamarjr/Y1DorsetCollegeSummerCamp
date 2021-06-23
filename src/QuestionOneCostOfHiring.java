import java.util.Scanner;

public class QuestionOneCostOfHiring {

    public static void coastHire(){
        //The cost of hiring a car
        double coastHiring;
        // is calculated by multiplying the number of days the car is on hire by
        int numberOfDaysHire;
        //the seasonal rate
        //HIGH SEASON
        //July – Aug
        //MID SEASON
        //May – June & Sep - Oct
        //LOW SEASON
        //Nov - April
        //€400 €250 €100
        int seasonalRate=0;
        int month=0;

        //A percentage discount is applied based on the number of days hired as per the following table.
        int discount=0;
        //0 – 10 days 11 to 20 days 21 to 31 days
        //0%            5%              10%


        //Write a program that:
        //1. Allows the user to enter the hire month as an integer in the range of 1-12.
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("What's the month(1-12) that you want to hire a car?");
            month = keyboard.nextInt();
        } while (month < 1 || month > 12);



        //2. Allows the user to enter how many days they are taking the car for (1-31).

        do {
            System.out.println("How many days(1-31) do you want to hire a car?");
            numberOfDaysHire = keyboard.nextInt();
        } while (numberOfDaysHire < 1 || numberOfDaysHire > 31);
        //3. Will ascertain the application hire rate based on the above table.

        if(month >= 11 || month <= 4){
            System.out.println("LOW SEASON");
            seasonalRate = 100;
        } if (month >=7 && month <=8){
            System.out.println("HIGH SEASON");
            seasonalRate = 400;
        } if ( month == 5 || month == 6 || month == 9 || month == 10){
            System.out.println("MID SEASON");
            seasonalRate = 250;
        }

        //4. Will ascertain the discount rate.

        if(numberOfDaysHire >= 21){
            discount=10;
        } if (numberOfDaysHire >= 11){
            discount=5;
        } if (numberOfDaysHire < 11){
            discount=0;
        }
        //5. Will calculate and display the total cost of a car hire.

        coastHiring = (numberOfDaysHire * seasonalRate) - (numberOfDaysHire * seasonalRate)*((double)discount/100);
        System.out.println("The cost of hiring a car is $"+coastHiring);
    }
}
