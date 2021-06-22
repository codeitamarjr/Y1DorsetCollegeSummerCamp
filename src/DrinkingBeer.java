public class DrinkingBeer {

    public static void Beer(){
        //5 friends are drinking beer and watching Euro 2021.
        int friendA,friendB, friendC, friendD, friendE;
        // Friend A takes 30 minutes to finish a full bottle of beer,
        friendA = 30;
        // similarly Friend B takes 18 minutes
        friendB = 18;
        // Friend C takes 20 minutes,
        friendC = 20;
        // Friend D takes 40 minutes and
        friendD = 40;
        // Friend E takes 6 minutes.
        friendE = 6;
        // They brought 30 bottles of beers and put them in the fridge.
        int beersFridge = 30;
        // After how much minutes, there will be no beer left in the fridge?
        int minutes;
        //The match will begin so all the friends open the first beer!
        int openBeer=5;

        //Start a clock of 1 minute, each loop will increase one minute
            for(minutes=1; openBeer<beersFridge ; minutes++){

                // If the remainder of friendA reach the clock (in this case 30 minutes)
                // The openBeer is increase by one for the FriendA
                if( minutes % friendA == 0){
                    openBeer++;
                    // If after the FriendA open his beer,they reach the amount in the fridge, the loop will break!
                    if(openBeer==beersFridge){
                        break;
                    }
                }
                if(minutes % friendB == 0){
                    openBeer++;
                    if(openBeer==beersFridge){
                        break;
                    }
                }
                if(minutes % friendC == 0){
                    openBeer++;
                    if(openBeer==beersFridge){
                        break;
                    }
                }
                if(minutes % friendD == 0){
                    openBeer++;
                    if(openBeer==beersFridge){
                        break;
                    }
                }
                if(minutes % friendE == 0) {
                    openBeer++;
                    if(openBeer==beersFridge){
                        break;
                    }
                }
            }
        System.out.println("It's takes "+minutes+" minutes");


//Mine own method to test and print each minute, every time that a friend open a beer also the last beer opened!
        DrinkingBeerTestCase.test(openBeer=5,beersFridge,friendA,friendB,friendC,friendD,friendE);
    }
}
