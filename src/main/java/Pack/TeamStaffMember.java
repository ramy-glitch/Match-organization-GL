package Pack;
public class TeamStaffMember extends Member {
    private String roleInTeam;

    

    public TeamStaffMember(String name, String phone, String email, String roleInTeam) {
        super(name, phone, email, "TeamStaffMember");
        this.roleInTeam = roleInTeam;
    }

    public void manageTrainingSession() {
        System.out.println("Managing training session...");
    }

    public void evaluatePlayerPerformance(Player player) {
        System.out.println("Evaluating performance of player: " + player);
    }

    public String getRoleInTeam() {
        return roleInTeam;
    }

    public void setRoleInTeam(String roleInTeam) {
        this.roleInTeam = roleInTeam;
    }
} 