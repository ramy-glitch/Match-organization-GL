package Pack;
import java.util.Date;
import java.util.List;

public class Stadium {

    private StadiumReservation reservedFor;
    private int ticketsSold;
    private double totalRevenue;
    private double totalRentalRevenue;
    private boolean availability = true;
    private Date reservationDate;
    private Date releaseDate;
    private List<Match> matches;

    public Stadium(List<Match> matches, Date releaseDate, Date reservationDate, StadiumReservation reservedFor, int ticketsSold, double totalRentalRevenue, double totalRevenue) {
        this.matches = matches;
        this.releaseDate = releaseDate;
        this.reservationDate = reservationDate;
        this.reservedFor = reservedFor;
        this.ticketsSold = ticketsSold;
        this.totalRentalRevenue = totalRentalRevenue;
        this.totalRevenue = totalRevenue;
    }

    public StadiumReservation getReservedFor() {
        return reservedFor;
    }

    public void setReservedFor(StadiumReservation reservedFor) {
        this.reservedFor = reservedFor;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getTotalRentalRevenue() {
        return totalRentalRevenue;
    }

    public void setTotalRentalRevenue(double totalRentalRevenue) {
        this.totalRentalRevenue = totalRentalRevenue;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public void hostMatch(Match match) {
        this.matches.add(match);
        System.out.println("Match hosted on " + match.getDate());
    }

    public void reserveStadium(StadiumReservation type, Date date, int durationInDays) {
        Date currentDate = new Date();

        if (!availability && releaseDate != null && date.before(releaseDate)) {
            System.out.println("Stadium is already reserved until " + releaseDate + ". Cannot reserve for " + date);
            return;
        }

        if (date.before(currentDate)) {
            System.out.println("Cannot reserve the stadium for a past date: " + date);
            return;
        }

        this.reservedFor = type;
        this.availability = false;
        this.reservationDate = date;
        this.releaseDate = calculateReleaseDate(date, durationInDays);
        System.out.println("Stadium reserved for " + type + " from " + reservationDate + " to " + releaseDate);
    }

    public void releaseStadium() {
        if (availability) {
            System.out.println("Stadium is already available. No action needed.");
            return;
        }

        Date currentDate = new Date();
        if (currentDate.before(releaseDate)) {
            System.out.println("Cannot release the stadium before the reservation period ends: " + releaseDate);
            return;
        }

        this.availability = true;
        System.out.println("Stadium released on " + currentDate);
    }

    public void sellTickets(int quantity, Date matchDate) {
        Date date = new Date();
        if (date.before(reservationDate) || date.after(matchDate)) {
            System.out.println("Cannot sell tickets while the stadium is unavailable or the match ended.");
            return;
        }

        this.ticketsSold += quantity;
        this.totalRevenue += quantity * 50;
        System.out.println("Sold " + quantity + " tickets. Total tickets sold: " + ticketsSold);
    }

    public Date calculateReleaseDate(Date reservationDate, int durationInDays) {
        long durationInMillis = (long) durationInDays * 24 * 60 * 60 * 1000;
        return new Date(reservationDate.getTime() + durationInMillis);
    }

    public boolean isAvailable() {
        return availability;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void displayStadiumInfo() {
        System.out.println("Stadium Information:");
        System.out.println("Availability: " + (availability ? "Available" : "Reserved"));
        if (!availability) {
            System.out.println("Reserved For: " + reservedFor);
            System.out.println("Reservation Date: " + reservationDate);
            System.out.println("Release Date: " + releaseDate);
        }
        System.out.println("Tickets Sold: " + ticketsSold);
        System.out.println("Total Revenue: " + totalRevenue);
        System.out.println("Matches Hosted: " + matches.size());
        System.out.println("Total Rental Revenue: " + totalRentalRevenue);
        System.out.println("Matches: " + matches);
    }
}
