package Pack;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Team {

    private String name;
    private List<Player> mainPlayers;
    private List<Player> reservePlayers;
    private double budget;
    private List<Trophy> trophiesWon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getMainPlayers() {
        return mainPlayers;
    }

    public void setMainPlayers(List<Player> mainPlayers) {
        this.mainPlayers = mainPlayers;
    }

    public List<Player> getReservePlayers() {
        return reservePlayers;
    }

    public void setReservePlayers(List<Player> reservePlayers) {
        this.reservePlayers = reservePlayers;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Trophy> getTrophiesWon() {
        return trophiesWon;
    }

    public void setTrophiesWon(List<Trophy> trophiesWon) {
        this.trophiesWon = trophiesWon;
    }

    public Team(String name, List<Player> mainPlayers, List<Player> reservePlayers, double budget, List<Trophy> trophiesWon) {
        this.name = name;
        this.mainPlayers = mainPlayers;
        this.reservePlayers = reservePlayers;
        this.budget = budget;
        this.trophiesWon = trophiesWon;
    }

    public void consultPlayerHistory(Player player) {
        System.out.println("Consulting history for player: " + player);
    }

    public void addReservePlayer(Player player) {
        reservePlayers.add(player);
        System.out.println("Added reserve player: " + player);
    }

    public void replacePlayer(Player startingPlayer, Player reservePlayer) {
        mainPlayers.remove(startingPlayer);
        mainPlayers.add(reservePlayer);
        System.out.println("Replaced player: " + startingPlayer + " with " + reservePlayer);
    }

    public void updateBudget(double amount) {
        this.budget += amount;
        System.out.println("Updated budget by " + amount);
    }

    public void organizeTrainingSession(Date date) {
        System.out.println("Organizing training session on " + date);
    }

    public void addTrophy(Trophy trophy) {
        trophiesWon.add(trophy);
        System.out.println("Added trophy: " + trophy);
    }

    public void removeTrophy(Trophy trophy) {
        trophiesWon.remove(trophy);
        System.out.println("Removed trophy: " + trophy);
    }

    public void displayInfo() {
        System.out.println("Team Name: " + name);
        System.out.println("Budget: " + budget);
        System.out.println("Main Players: ");
        Iterator<Player> mainPlayerIterator = mainPlayers.iterator();
        while (mainPlayerIterator.hasNext()) {
            Player player = mainPlayerIterator.next();
            System.out.println(player.getName());
        }

        System.out.println("Reserve Players: ");
        Iterator<Player> reservePlayerIterator = reservePlayers.iterator();
        while (reservePlayerIterator.hasNext()) {
            Player player = reservePlayerIterator.next();
            System.out.println(player.getName());
        }

        System.out.println("Trophies Won: ");
        Iterator<Trophy> trophyIterator = trophiesWon.iterator();
        while (trophyIterator.hasNext()) {
            Trophy trophy = trophyIterator.next();
            System.out.println(trophy.getCompetition());
        }
    }
}
