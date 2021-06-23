import java.util.Scanner;

public class QuestionTwoCarInsurance {

    public static void coastInsurance(){

        //A car insurance company calculates the cost of an insurance
        double coastOfInsurance;
        // policy based on the value of the car,
        int valueOfTheCar;
        // the age of the driver,
        int ageOfTheDriver;
        // and the number of penalty points
        int numberOfPenaltyPoints;
        //as per the equation and the tables shown below.

        //Equation :
        // cost = ( 250 + (value of car/1000) * Valuefactor ) * Agefactor * Pointsfactor
        double AgeFactor=0;
        double PointsFactor=0;

        int valueFactor = 10;

        //Write a program that will
        //1. allow the user to enter the value of a car, the drivers age, and the number of penalty
        //points

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("What's the value of the car?");
            valueOfTheCar = keyboard.nextInt();
        } while (valueOfTheCar < 1);

        do {
            System.out.println("What's the age of the driver?");
            ageOfTheDriver = keyboard.nextInt();
        } while (ageOfTheDriver < 1 || ageOfTheDriver > 99);

        do {
            System.out.println("What's the number of penalty points?");
            numberOfPenaltyPoints = keyboard.nextInt();
        } while (numberOfPenaltyPoints < 0 || numberOfPenaltyPoints > 99);


        //2. then ascertain whether or not the driver is insurable


        if(ageOfTheDriver > 25){
            System.out.println("Your age is greater than 25 years 1.0");
            AgeFactor = 1.0;
        } if (ageOfTheDriver >= 21 && ageOfTheDriver <= 25){
            System.out.println("Your age is between 21 to 25 Agefactor 1.5");
            AgeFactor = 1.5;
        } if (ageOfTheDriver >= 18 && ageOfTheDriver <= 20){
            System.out.println("Your age is between 18 to 20 years Agefactor 2.0");
            AgeFactor = 2.0;
        } if (ageOfTheDriver <18){
            System.out.println("The Age is less than 18 years, will not insure");
        }


        //3. if insurable will deduce the AgeFactor
        //Its already set the factor on previous if statements

        //4. if insurable will deduce the PointsFactor

        if(ageOfTheDriver >= 18 ) {

            if (numberOfPenaltyPoints >= 9) {
                System.out.println(" But the No. of Points is 9 or greater and will not insure");
            }
            if (numberOfPenaltyPoints == 8) {
                System.out.println("The number of Points is 8 1.7");
                PointsFactor = 1.7;
            }
            if (numberOfPenaltyPoints == 7) {
                System.out.println("The number of Points is 7 1.4");
                PointsFactor = 1.4;
            }
            if (numberOfPenaltyPoints == 6) {
                System.out.println("The number of Points is 6 1.2");
                PointsFactor = 1.2;
            }
            if (numberOfPenaltyPoints == 5) {
                System.out.println("The number of Points is 5 1.1");
                PointsFactor = 1.1;
            }
            if (numberOfPenaltyPoints < 5) {
                System.out.println("Points is less than 5 1.0");
                PointsFactor = 1.0;
            }

        }


        //5. if insurable will calculate and display the cost of the policy

        if(AgeFactor != 0 && PointsFactor != 0 ){
            coastOfInsurance = (250 + ((valueOfTheCar / 1000) * valueFactor) ) * AgeFactor * PointsFactor;
            System.out.println("The price of the insurance based on your profile is $"+coastOfInsurance);
        }

        //6. if not insurable will report this decision and the reason why the decision was taken
        //It's already implemented by the previous code.

        //TESTCASE:
        //If the car coast 40000, the driver age is 20 and the N. of penalty points is 7
        //Its expected a insurance of (250 + (40000/1000)*10)*2.0*1.4 = 1820
        //The result on the program is: 1819.99~

        //TESTCASE2:
        //If the car coast 10000, the driver age is 17
        //Its expected a message of the age under 18 and will not insure
        //The result on the program is:

        //TESTCASE3:
        //If the car coast 500, the driver age is 18 and the N. of penalty is 9
        //Its expected a message of will no insure because of the Number of penalties.
        //The result on the program is:

    }
}
