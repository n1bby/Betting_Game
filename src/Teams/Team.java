package Teams;

import java.util.HashMap;
import java.util.ArrayList;

public class Team{
    public String Team_Name;
    public String Division;
    public HashMap<String,Integer> Record = new HashMap<String, Integer>();

    public Team(String name, String division){
        Team_Name = name;
        Division = division;
        Record.put("Wins", 0);
        Record.put("Losses", 0);
    }

}
