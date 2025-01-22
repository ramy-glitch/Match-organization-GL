package Pack;
import java.util.Date;

public class Trophy {
    private Date date;
    private String competition;
    private TrophyType type;

    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public TrophyType getType() {
        return type;
    }

    public void setType(TrophyType type) {
        this.type = type;
    }

    public Trophy(Date date, String competition, TrophyType type) {
        this.date = date;
        this.competition = competition;
        this.type = type;
    }

    public void awardToPlayer(Player player) {
        System.out.println("Awarded trophy to player: " + player);
    }

    public void awardToTeam(Team team) {
        System.out.println("Awarded trophy to team: " + team);
    }

    public void viewTrophyDetails() {
        System.out.println("Trophy details: Date: " + date + ", Competition: " + competition + ", Type: " + type);
    }
} 