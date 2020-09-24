package hp.atm.bean;

public class Customer extends UserInfo {
    private  int blance;

    public Customer(String id, String password, String roleName, String phone) {
        super(id, password, roleName, phone);
    }

    public int getBlance() {
        return blance;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "余额=" + blance +"用户名"+this.getId()+"角色"+this.getRoleName()+
                '}';
    }
}
