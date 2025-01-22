package Pack;
import java.util.List;

public class Spectator {
    private String name;
    private String email;
    private List<Ticket> tickets;
    private  Match match;

    public Spectator(String email, Match match, String name, List<Ticket> tickets) {
        this.email = email;
        this.match = match;
        this.name = name;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public void viewSchedule() {
        System.out.println("Viewing match schedule...");
    }

    public void purchaseTicket(Match match) {
        System.out.println("Purchasing ticket for match: " + match);
    }

    public void confirmPurchase() {
        System.out.println("Purchase confirmed.");
    }

    public void rateMatch(Match match, int rating) {
        System.out.println("Rated match " + match + " with a score of " + rating);
    }

    public void displaySpectatorInfo() {
        System.out.println("Spectator Name: " + name);
        System.out.println("Spectator Email: " + email);
        System.out.println("Match: " + match);
        System.out.println("Number of tickets bought: "+ tickets.size());
    }
} 