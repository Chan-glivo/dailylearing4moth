package hp.atm.bean;

public class Manager extends UserInfo {
    private  int ral;

    public Manager(String id, String password, String roleName, String phone, int ral) {
        super(id, password, roleName, phone);
        this.ral = ral;
    }

    public int getRal() {
        return ral;
    }

    public void setRal(int ral) {
        this.ral = ral;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "工资=" + ral +"昵称"+this.getId()+"角色"+this.getRoleName()+
                '}';
    }
}
