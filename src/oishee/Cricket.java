package oishee;

public class Cricket  extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of the player: "+player.playerName);
        System.out.println("Jersey number of the player: "+player.jerseyNumber);
    }
}
/*
Name- Sumaiya Tasnim Oishee
Id- 2012020161
Section- 53(D)
Email - cse_2012020161@lus.ac.bd
Date- 10-09-2021
 */

