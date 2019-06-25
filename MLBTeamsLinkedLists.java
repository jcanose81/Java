import java.util.LinkedList;

public class MyClass {
    public static void main(String args[]) {
        LinkedList mlbAlEastTeams = new LinkedList();
        
        //Add Items
        mlbAlEastTeams.addLast("Baltimore Orioles");
        mlbAlEastTeams.addFirst("Boston Red Sox");
        mlbAlEastTeams.add("New York Yankees");
        mlbAlEastTeams.add("Tampa Bay Rays");
        mlbAlEastTeams.add("Toronto Blue Jays");
        System.out.println(mlbAlEastTeams);   
    }
}