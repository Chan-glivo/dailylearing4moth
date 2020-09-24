package hp.atm.bean;

public class UserInfo {
    private  String id,password,roleName,phone;

    public UserInfo(String id, String password, String roleName, String phone) {
        this.id = id;
        this.password = password;
        this.roleName = roleName;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", roleName='" + roleName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
