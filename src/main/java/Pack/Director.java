package Pack;
public class Director extends Member {
    public Director(String name, String phone, String email) {
        super(name, phone, email, "Director");
    }

    public void setStrategy(String strategy) {
        System.out.println("Setting strategy: " + strategy);
    }

    public void approveBudget(double amount) {
        System.out.println("Budget of " + amount + " approved.");
    }
} 