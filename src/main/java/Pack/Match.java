package Pack;
import java.util.Date;
import java.util.List;

public class Match {
    private Date date;
    private String timeSlot;
    private MatchType type;
    private Team homeTeam;
    private Team awayTeam;
    private List<Referee> referees;



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public MatchType getType() {
        return type;
    }

    public void setType(MatchType type) {
        this.type = type;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<Referee> getReferees() {
        return referees;
    }

    public void setReferees(List<Referee> referees) {
        this.referees = referees;
    }

    public Match(Team awayTeam, Date date, Team homeTeam, List<Referee> referees, String timeSlot, MatchType type) {
        this.awayTeam = awayTeam;
        this.date = date;
        this.homeTeam = homeTeam;
        this.referees = referees;
        this.timeSlot = timeSlot;
        this.type = type;
    }
    

    public void scheduleMatch(Date date, String timeSlot, MatchType type) {
        this.date = date;
        this.timeSlot = timeSlot;
        this.type = type;
        System.out.println("Scheduled match on " + date + " at " + timeSlot);
    }

    public void viewMatchDetails() {
        System.out.println("Match details: Date: " + date + ", Time: " + timeSlot + ", Type: " + type);
    }

    public void assignReferees(List<Referee> referees) {
        System.out.println("Assigned referees: " + referees);
    }

    public void startMatch() {
        System.out.println("Match started.");
    }

    public void endMatch(Team winner, Team loser) {
        System.out.println("Match ended. Winner: " + winner + ", Loser: " + loser);
    }
} 