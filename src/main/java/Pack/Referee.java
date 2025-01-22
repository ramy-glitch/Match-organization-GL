package Pack;
import java.util.ArrayList;
import java.util.List;

public class Referee {

    private String name;
    private String firstName;
    private int age;
    private String phone;
    private String email;
    private int experience;
    private List<Match> matchesOfficiated;

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<Match> getMatchesOfficiated() {
        return matchesOfficiated;
    }

    public void setMatchesOfficiated(List<Match> matchesOfficiated) {
        this.matchesOfficiated = matchesOfficiated;
    }

    public Referee(String name, String firstName, int age, String phone, String email, int experience) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.experience = experience;
        this.matchesOfficiated = new ArrayList<>();
    }

    public void officiateMatch(Match match) {
        matchesOfficiated.add(match);
        System.out.println("Officiating match: " + match);
    }

    public void reportMatchOutcome(Match match) {
        System.out.println("Reporting outcome for match: " + match);
    }

    public void displayRefereeInfo() {
        System.out.println("Referee: " + name + " " + firstName + " (" + age + " years old)");
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Matches Officiated: " + matchesOfficiated.size());
    }
}
