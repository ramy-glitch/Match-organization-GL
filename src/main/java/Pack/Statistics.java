package Pack;
import java.util.Iterator;
import java.util.List;

public class Statistics {

    private int matchesPlayed;
    private double totalRevenue;
    private List<Ticket> tickets;

    public Statistics(int matchesPlayed, List<Ticket> tickets) {
        this.matchesPlayed = matchesPlayed;
        this.tickets = tickets;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void updateTicketsSold(List<Ticket> tickets) {
        this.tickets = tickets;
        System.out.println("Tickets sold updated. Tickets sold: " + this.tickets.size());
    }

    public void updateMatchStatistics(int matchesPlayed) {
        this.matchesPlayed += matchesPlayed;
        System.out.println("Match statistics updated. Matches played: " + this.matchesPlayed);
    }

    public void updateRevenue() {
        double matchRevenue = 0;
        Iterator<Ticket> iterator = tickets.iterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            matchRevenue += ticket.getPrice();
        }
        this.totalRevenue += matchRevenue;
        System.out.println("Revenue updated. Match revenue: " + matchRevenue);
    }

    public void viewStatistics() {
        System.out.println("Statistics: Tickets Sold: " + tickets.size() + ", Revenue: " + totalRevenue + ", Matches Played: " + matchesPlayed + ", Total Revenue: " + totalRevenue);
    }
}
