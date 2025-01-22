package Pack;
import java.util.List;

public class Federation {
    private String name;
    private String phone;
    private String email;
    private String website;
    private Stadium stadium;
    private Director director;
    private List<Member> members;
    private List<Referee> referees;
    private List<Match> matchesPlans ;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Referee> getReferees() {
        return referees;
    }

    public void setReferees(List<Referee> referees) {
        this.referees = referees;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Match> getMatchesPlans() {
        return matchesPlans;
    }

    public void setMatchesPlans(List<Match> matchesPlans) {
        this.matchesPlans = matchesPlans;
    }

    public Federation(String name, String phone, String email, String website, Stadium stadium, Director director, List<Member> members, List<Referee> referees, List<Match> matchesPlans) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.stadium = stadium;
        this.director = director;
        this.members = members;
        this.referees = referees;
        this.matchesPlans = matchesPlans;
    }

    public void planMatch(Match match) {
        System.out.println("Planning match: " + match);
    }

    public void consultStatistics() {
        System.out.println("Consulting statistics...");
    }

    public void updateContactDetails(String phone, String email, String website) {
        this.phone = phone;
        this.email = email;
        this.website = website;
        System.out.println("Contact details updated.");
    }

    public void assignReferee(Referee referee, Match match) {
        System.out.println("Assigning referee " + referee + " to match " + match);
    }

    public void organizeTournament(List<Team> teams) {
        System.out.println("Organizing tournament for teams: " + teams);
    }
} 