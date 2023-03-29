import java.util.ArrayList;
import java.util.List;

public class BallTeam {

    private String teamName;
    private List<FootballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BallTeam(String teamName){
        this.teamName = teamName;
    }

    public void addTeamMember(FootballPlayer player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster:" + teamMembers);

    }
    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "WIN!";
        } else if (ourScore == theirScore){
            message = "TIED";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString(){
        return teamName + " (Ranked " + ranking() + ")";
    }
}
