package Game;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import Teams.Team;
//use recursion to create matchups
public class League{
    public Team[] afc = afc_season();
    public Team[] nfc = nfc_season();
    public ArrayList<Team> NFL = nfl();
    //creating the american football league
    public Team[] afc_season(){
        //afc east
        Team Bills = new Team("Buffalo Bills", "AFC EAST");
        Team Patriots = new Team("New England Patriots", "AFC EAST");
        Team Jets = new Team("New York Jets", "AFC EAST");
        Team Dolphins = new Team("Dolphins", "AFC EAST");
        //afc north
        Team Ravens = new Team("Baltimore Ravens", "AFC NORTH");
        Team Bengals = new Team("Cincinnati Bengals", "AFC NORTH");
        Team Browns = new Team("Cleveland Browns", "AFC NORTH");
        Team Steelers = new Team("Pittsburgh Steelers", "AFC NORTH");
        //afc south
        Team Jaguars = new Team("Jacksonville Jaguars", "AFC SOUTH");
        Team Texans = new Team("Houston Texans", "AFC SOUTH");
        Team Titans = new Team("Tennessee Titans", "AFC SOUTH");
        Team Colts = new Team("Indianapolis Colts", "AFC SOUTH");
        //afc west
        Team Chargers = new Team("Los Angelos Chargers", "AFC WEST");
        Team Chiefs = new Team("Kansas City Chiefs", "AFC WEST");
        Team Raiders = new Team("Las Vegas Raiders", "AFC WEST");
        Team Broncos = new Team("Denver Broncos", "AFC WEST");
        Team[] teams = {Patriots, Bills, Jets, Dolphins,
            Ravens, Bengals, Browns, Steelers,
            Jaguars, Texans, Titans, Colts,
            Chargers, Chiefs, Raiders, Broncos
        };
        return teams;
    }//end afc season method
    //creating the national football league
    public Team[] nfc_season(){
        //nfc east
        Team Eagles = new Team("Buffalo Bills", "NFC EAST");
        Team Giants = new Team("New England Patriots", "NFC EAST");
        Team Cowboys = new Team("New York Jets", "NFC EAST");
        Team Commanders = new Team("Dolphins", "NFC EAST");
        //afc north
        Team Vikings = new Team("Baltimore Ravens", "NFC NORTH");
        Team Packers = new Team("Cincinnati Bengals", "NFC NORTH");
        Team Bears = new Team("Cleveland Browns", "NFC NORTH");
        Team Lions = new Team("Pittsburgh Steelers", "NFC NORTH");
        //nfc south
        Team Buccaneers = new Team("Jacksonville Jaguars", "NFC SOUTH");
        Team Falcons = new Team("Houston Texans", "NFC SOUTH");
        Team Panthers = new Team("Tennessee Titans", "NFC SOUTH");
        Team Saints = new Team("Indianapolis Colts", "NFC SOUTH");
        //nfc west
        Team Seahawks = new Team("Los Angelos Chargers", "NFC WEST");
        Team San_49ers = new Team("Kansas City Chiefs", "NFC WEST");
        Team Rams = new Team("Las Vegas Raiders", "NFC WEST");
        Team Cardinals = new Team("Denver Broncos", "NFC WEST");
        Team[] teams = {Eagles, Giants, Cowboys, Commanders,
                Vikings, Packers, Bears, Lions,
                Buccaneers, Falcons, Panthers, Saints,
                Seahawks, San_49ers, Rams, Cardinals
        };
        return teams;
    }//end afc season method
    //combining both leagues together
    public ArrayList<Team> nfl(){
        Team[] nfc = nfc_season();
        Team[] afc = afc_season();
        ArrayList<Team> NFL = new ArrayList<>();
        for(Team i: nfc){
            NFL.add(i);
        }//for loop for nfc
        for(Team i: afc){
            NFL.add(i);
        }//
        return NFL;
    }//end method

}
