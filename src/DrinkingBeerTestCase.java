public class DrinkingBeerTestCase {
    public static void test(int openBeer, int beersFridge, int friendA, int friendB, int friendC, int friendD, int friendE){

        System.out.println("\n\n");
        int minutes;
        for(minutes =1; openBeer<beersFridge ; minutes++){

            if( minutes % friendA == 0){
                openBeer++;
                System.out.println("FriendA open a beer!");
                if(openBeer==beersFridge){
                    System.out.println("FriendA open the last beer!");
                    break;
                }
            }
            if(minutes % friendB == 0){
                openBeer++;
                System.out.println("FriendB open a beer!");
                if(openBeer==beersFridge){
                    System.out.println("FriendB open the last beer!");
                    break;
                }
            }
            if(minutes % friendC == 0){
                openBeer++;
                System.out.println("FriendC open a beer!");
                if(openBeer==beersFridge){
                    System.out.println("FriendC open the last beer!");
                    break;
                }
            }
            if(minutes % friendD == 0){
                openBeer++;
                System.out.println("FriendD open a beer!");

                if(openBeer==beersFridge){
                    System.out.println("FriendD open the last beer!");
                    break;
                }
            }
            if(minutes % friendE == 0) {
                openBeer++;
                System.out.println("FriendE open a beer!");
                if(openBeer==beersFridge){
                    System.out.println("FriendE open the last beer!");
                    break;
                }
            }
            System.out.println("⏰ Time is running:"+ minutes +" minutes!"+openBeer+" was open!");
        }
        System.out.println("The clock marks "+ minutes +" minute(s); "+openBeer+" beers was open!");
    }
}
