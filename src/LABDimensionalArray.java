import java.util.Scanner;

public class LABDimensionalArray {
    public static void lab(){

        //The constant we don't want to change is capital letter
        final int LABS = 2;
        final int DAYS = 3;
        //define first roll second collum
        int [][] usage = new int[LABS][DAYS];

        //To calculate the TOTAL of usage for each LAB
        //I create an array of the length equals to the numbers of LABS
        //each object of the array will increment the usage of the LAB itself later
        int [] sumLAB= new int[LABS];
        int [] sumDay = new int[DAYS];

        Scanner keyboard = new Scanner(System.in);

        //The nested loop to go for all the objects of this dimensional table
        //First loop through the collum
        for(int roll=0;roll<LABS;roll++){
            //Second loop through the row( inside the collum before)
            for(int column=0;column<DAYS; column++){
                System.out.print("Are the LAB# "+(roll+1)+" Day "+(column+1)+"; Used for :");
                usage[roll][column] = keyboard.nextInt();

                //It's add and store the amount of use for the LAB number roll
                sumLAB[roll] = sumLAB[roll]+usage[roll][column];
                sumDay[column] = sumDay[column]+usage[roll][column];

            }
        }

        //Print all the data of one row with space of tab between
        for(int roll=0;roll<LABS;roll++){
            for(int collum=0;collum<DAYS; collum++){
                System.out.print(usage[roll][collum]+"\t");
            }
            System.out.println();
        }

      for(int i=0;i< sumLAB.length;i++){
          System.out.println("The LAB# "+(i+1)+" was used for "+sumLAB[i]+" hours.");
      }

        for(int i=0;i< sumDay.length;i++){
            System.out.println("On day "+(i+1)+","+
                    sumDay[i]
                    +" hours was used.");
        }

        int counterLabsUsage = 0;
        for(int roll=0; roll< LABS; roll++){

            for(int column = 0; column<DAYS ; column++){
                counterLabsUsage += usage[roll][column];
            }
            System.out.println("The LAB# "+(roll+1)+" was used for "+counterLabsUsage);
            counterLabsUsage = 0;
        }

        int counterDaysUsage = 0;
        for(int column=0;column<DAYS;column++){
            for(int roll=0;roll<LABS;roll++){
                counterDaysUsage += usage[roll][column];
            }
            System.out.println("On the day #"+(column+1)+", "+counterDaysUsage+" was used.");
            counterDaysUsage = 0;
        }

    }
}
