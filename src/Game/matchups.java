package Game;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import Teams.Team;
import java.util.Random;

public class matchups{
    String Team_names;
    Team Object_team;
    Team[] NFL;
    HashMap<Team, Team> games = league_games(17);
    public matchups(String name, Team object_name, Team[] nfl){
        Team_names = name;
        Object_team = object_name;
        NFL = nfl;
    }//constructor

    //creating the matchup
    public HashMap<Team, Team> league_games(int g){
        HashMap<Team, Team> season_games = new HashMap<>();
        Team team1;
        Team team2 = Object_team;
        if(g != 0){
            //picks a random team that's not the same team as the specified team
        }//recursion if
        return season_games;
    }//league_games

}
