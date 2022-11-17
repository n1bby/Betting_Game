package gameplay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import Teams.Team;
import Game.League;
import Game.matchups;

public class gameTime{
    public static void main(String[] args){
        League L = new League();
        Team[] afc;
        Team[] nfc;
        Team[] matchups;
        ArrayList<Team> NFL;
        Scanner Begin = new Scanner(System.in);
        System.out.println("Enter Start to begin: ");
        String input = Begin.nextLine();
        while(!Objects.equals(input, "Start")){
            System.out.println("Enter Start to begin: ");
            input = Begin.nextLine();
            if(Objects.equals(input, "Start")){
                break;
            }//end if
        }//end while
        if(Objects.equals(input, "Start")){
            afc = L.afc;
            nfc = L.nfc;
            NFL = L.NFL;
            System.out.println("Choose a team: ");
            String player = Begin.nextLine();

            //

        }//end if
    }
}
