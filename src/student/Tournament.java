package student;

public class Tournament {

    /**
     * Suite to test winrates of all combinations of tactics.
     */
    public static void main(String[] args) {
        AI rand = new AI();
        AI smallest = new SmallestCardAI();
        AI biggest = new BiggestCardAI();

        //Random Card AI vs. Random Card AI winRate: 0.499
        UnoWarMatch randVRand = new UnoWarMatch(rand, rand);
        System.out.print("Random Card AI vs. Random Card AI winRate: ");
        System.out.println(randVRand.winRate(1000));

        //Random Card AI vs. Smallest Card AI winRate: 0.002
        UnoWarMatch randVSmall = new UnoWarMatch(rand, smallest);
        System.out.print("Random Card AI vs. Smallest Card AI winRate: ");
        System.out.println(randVSmall.winRate(1000));

        //Random Card AI vs. Biggest Card AI winRate: 0.842
        UnoWarMatch randVBig = new UnoWarMatch(rand, biggest);
        System.out.print("Random Card AI vs. Biggest Card AI winRate: ");
        System.out.println(randVBig.winRate(1000));

        //Smallest Card AI vs. Random Card AI winRate: 0.998
        UnoWarMatch smallVRand = new UnoWarMatch(smallest, rand);
        System.out.print("Smallest Card AI vs. Random Card AI winRate: ");
        System.out.println(smallVRand.winRate(1000));

        //Smallest Card AI vs. Smallest Card AI winRate: 0.499
        UnoWarMatch smallVSmall = new UnoWarMatch(smallest, smallest);
        System.out.print("Smallest Card AI vs. Smallest Card AI winRate: ");
        System.out.println(smallVSmall.winRate(1000));

        //Smallest Card AI vs. Biggest Card AI winRate: 0.999
        UnoWarMatch smallVBig = new UnoWarMatch(smallest, biggest);
        System.out.print("Smallest Card AI vs. Biggest Card AI winRate: ");
        System.out.println(smallVBig.winRate(1000));

        //Biggest Card AI vs. Random Card AI winRate: 0.156
        UnoWarMatch bigVRand = new UnoWarMatch(biggest, rand);
        System.out.print("Biggest Card AI vs. Random Card AI winRate: ");
        System.out.println(bigVRand.winRate(1000));

        //Biggest Card AI vs. Smallest Card AI winRate: 0.0
        UnoWarMatch bigVSmall = new UnoWarMatch(biggest, smallest);
        System.out.print("Biggest Card AI vs. Smallest Card AI winRate: ");
        System.out.println(bigVSmall.winRate(1000));

        //Biggest Card AI vs. Biggest Card AI winRate: 0.491
        UnoWarMatch bigVBig = new UnoWarMatch(biggest, biggest);
        System.out.print("Biggest Card AI vs. Biggest Card AI winRate: ");
        System.out.println(bigVBig.winRate(1000));

    }





}
