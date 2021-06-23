import java.util.Scanner;

public class QuestionThreeSalary {
    public static void salary(){
        //A company’s employees are treated as either salaried or waged. A salaried employee has an
        //annual salary and is paid monthly. A waged employee is paid an hourly rate and works up to
        //a maximum of 40 hours per week. Both types of employee have an annual tax free allowance
        int taxFreeAllowance;
        //and a tax rate of 41%.
        double taxRate = 0.41;
        // Write a program that calculates and displays either the employee’s
        //monthly salary or weekly wage as appropriate.
        int monthlySalary, weeklyWage;
        //The program should first ask an employee to enter S or W to indicate their type.
        String employeeType;
        Scanner keyboard = new Scanner(System.in);


        do {
            System.out.println("What's your type: S - Salaried  or W - Waged");
            employeeType = keyboard.nextLine();
            employeeType = employeeType.toUpperCase();
        } while (!employeeType.contains("S") && !employeeType.contains("W"));


        // On entry of their type, the program should then ask for the necessary additional information required to
        //complete the calculation.
        //Attributes needed include:
        //employeeType
        //taxFreeAllowance
        //taxRate = 41
        //annualSalary
        //hourlyRate
        //hoursWorked
        //grossPay
        //taxDue
        //netPay

        System.out.println("How much is your Annual Tax free allowance?");
        taxFreeAllowance = keyboard.nextInt();

        if( employeeType.contains("S") ){
            System.out.println("How much is your Annual salary?");
            int annualSalary = keyboard.nextInt();
            int grossPay = annualSalary-taxFreeAllowance;
            double netPay = annualSalary-(grossPay * taxRate);
            System.out.println("Your pay is: $"+netPay);
        } if( employeeType.contains("W") ){
            System.out.println("How much is your Hourly rate of pay?");
            double hourlyRate = keyboard.nextDouble();
            System.out.println("How many hour did you worked?");
            double hoursWorked = keyboard.nextDouble();
            double netPay = hourlyRate*hoursWorked;
            System.out.println("Your pay is: $"+netPay);
        }

        //Part A: Create the pseudocode for the above problem
        //Part B: Implement your application
        //Part C: Test your application with the following test cases
        //Employee type Annual Tax
        //free allowance
        //Annual salary Hourly rate of
        //pay + hours
        //worked
        //Your pay is
        //waged 3,500 n/a 15/hr (25 hours) ?
        //salaried 4,000 32,000 n/a ?
        //waged 3,425 n/a 10/hr (18 hours) ?
        //salaried 4,250 70,000 n/a ?
        //waged 5,000 n/a 9/hr (37.5
        //hours)
        //?
        //salaried 2,900 45,000 n/a ?
        //waged 3,100 n/a 12.50/hr
        //(30hours)
        //?
    }
}
