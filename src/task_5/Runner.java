package task_5;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        FootballPlayer milevsky = new FootballPlayer("Milevsky", 75);
        FootballPlayer kokorin = new FootballPlayer("Kokorin", 83);
        FootballPlayer messi = new FootballPlayer("Messi", 94);
        FootballPlayer mamaev = new FootballPlayer("mamaev", 80);
        FootballPlayer ronaldo = new FootballPlayer("Ronaldo", 96);
        FootballPlayer torres = new FootballPlayer("Torres", 93);
        FootballPlayer hleb = new FootballPlayer("Hleb", 88);

        List<FootballPlayer> footballPlayers = Arrays.asList(messi, ronaldo, torres, hleb);

        Integer collectedfootballplayers = footballPlayers
                .parallelStream()
                .collect(new FootballPlayerCollector());

        System.out.println("Football players whose rating is more than 87 = " + collectedfootballplayers);
    }
}
