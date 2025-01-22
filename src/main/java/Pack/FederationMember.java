package Pack;
public class FederationMember extends Member {
    private String roleInFederation;


    public FederationMember(String name, String phone, String email, String roleInFederation) {
        super(name, phone, email, "FederationMember");
        this.roleInFederation = roleInFederation;
    }

    public void attendMeeting() {
        System.out.println("Attending federation meeting...");
    }

    public void submitReport(String report) {
        System.out.println("Submitting report: " + report);
    }

    public String getRoleInFederation() {
        return roleInFederation;
    }

    public void setRoleInFederation(String roleInFederation) {
        this.roleInFederation = roleInFederation;
    }
} 