package Pack;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Player {
    private String name;
    private String firstName;
    private int age;
    private int number;
    private String phone;
    private String email;
    private Date membershipDate;
    private int contractDuration;
    private PlayerType type;
    private boolean captain;
    private int matchesPlayed;
    private int goalsScored;
    private List<Team> teamsPlayedFor;
    private List<Trophy> trophiesWon;



    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public Date getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }


    public List<Trophy> getTrophiesWon() {
        return trophiesWon;
    }

    public void setTrophiesWon(List<Trophy> trophiesWon) {
        this.trophiesWon = trophiesWon;
    }

    public List<Team> getTeamsPlayedFor() {
        return teamsPlayedFor;
    }

    public void setTeamsPlayedFor(List<Team> teamsPlayedFor) {
        this.teamsPlayedFor = teamsPlayedFor;
    }

    public Player(String name, String firstName, int age, int number, String phone, String email, Date membershipDate, int contractDuration, PlayerType type) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.number = number;
        this.phone = phone;
        this.email = email;
        this.membershipDate = membershipDate;
        this.contractDuration = contractDuration;
        this.type = type;
        this.captain = false;
        this.matchesPlayed = 0;
        this.goalsScored = 0;
        this.trophiesWon = new ArrayList<>();
        this.teamsPlayedFor = new ArrayList<>();
    }

    public void replacePlayer(Player reservePlayer) {
        System.out.println("Replacing player " + this.name + " with " + reservePlayer.name);
    }

    public void updatePlayerStatistics(int matches, int goals, Trophy trophies) {
        this.matchesPlayed += matches;
        this.goalsScored += goals;
        this.trophiesWon.add(trophies);
    }

    public void addTeamPlayedFor(Team team) {
        teamsPlayedFor.add(team);
        System.out.println("Added team to player's history: " + team);
    }

    public void captainTeam() {
        this.captain = true;
        System.out.println(this.name + " is now the captain.");
    }

    public void retireFromTeam(Team team) {
        teamsPlayedFor.remove(team);
        System.out.println(this.name + " has retired from team " + team);
    }

    public void renewContract(int additionalYears) {
        this.contractDuration += additionalYears;
        System.out.println("Contract renewed for " + additionalYears + " years.");
    }

    public void displayPlayerInfo() {
        System.out.println("Player: " + name + " " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Membership date: " + membershipDate);
        System.out.println("Contract duration: " + contractDuration);
        System.out.println("Type: " + type);
        System.out.println("Captain: " + captain);
        System.out.println("Matches played: " + matchesPlayed);
        System.out.println("Goals scored: " + goalsScored);
        System.out.println("Number of teams played for: " + teamsPlayedFor.size());
        System.out.println("Numbre of trophies won: " + trophiesWon.size());
    }
} 