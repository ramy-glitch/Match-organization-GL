package Pack;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Stadium stadium = new Stadium(null,null,null,null,0,0,0); // Create a stadium object

 
        Date reservationDate = new Date(); 
        stadium.reserveStadium(StadiumReservation.MATCH, reservationDate, 2);

        Team homeTeam = new Team("Barcelona",null,null, 1000000,null);
        Team awayTeam = new Team("Real Madrid",null,null, 100,null);
        Match match = new Match(awayTeam,null ,homeTeam,null,"12:00" , MatchType.DERBY);

        System.out.println("Match hosted between " + homeTeam.getName() + " and " + awayTeam.getName() + " at " + match.getTimeSlot());
        

        /*-----------------Sell Tickets-----------------------*/

        stadium.sellTickets(100, new Date()); 
        System.out.println("100 tickets sold for the match.");

        /*-----------------Release Stadium-----------------------*/

        System.out.println("Attempted to release the stadium before the reservation period ends.");
        stadium.releaseStadium();

        /*------------------Calculate Release Date--------------- */

        Date releaseDate = stadium.calculateReleaseDate(reservationDate, 2); // Assuming a 2-day reservation period
        System.out.println("Simulated release date: " + releaseDate);

        // Set the current date to the release date for testing
        // Note: This is just for simulation purposes, in a real scenario, the current date would naturally progress
        System.setProperty("user.timezone", "GMT");
        System.setProperty("user.time", String.valueOf(releaseDate.getTime()));

    }
}