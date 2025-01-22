package Pack;
public class Member {
    private String name;
    private String phone;
    private String email;
    private String role;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Member(String name, String phone, String email, String role) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }

    public void updateContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
        System.out.println("Member contact details updated.");
    }
} 