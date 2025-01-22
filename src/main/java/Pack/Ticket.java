package Pack;
public class Ticket {
    private int ticketID;
    private double price;
    private Match match;
    private Spectator spectator;

    

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Spectator getSpectator() {
        return spectator;
    }

    public void setSpectator(Spectator spectator) {
        this.spectator = spectator;
    }

    public Ticket(int ticketID, double price, Match match, Spectator spectator) {
        this.ticketID = ticketID;
        this.price = price;
        this.match = match;
        this.spectator = spectator;
    }

    public void generateTicket() {
        System.out.println("Ticket generated for Match: " + match + " Spectator: " + spectator);
    }

    public void validateTicket(int ticketID) {
        if (this.ticketID == ticketID) {
            System.out.println("Ticket validated.");
        } else {
            System.out.println("Invalid ticket ID.");
        }
    }

    public void displayTicketInfo() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Price: " + price);
        System.out.println("Teams: ");
        System.out.println("Home: " + match.getHomeTeam().getName());
        System.out.println("Away: " + match.getAwayTeam().getName());
        System.out.println("Spectator: " + spectator.getName());
    }
} 