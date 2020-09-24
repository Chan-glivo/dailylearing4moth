package hp.atm.datainit;

import hp.atm.bean.Customer;
import hp.atm.bean.Manager;
import hp.atm.bean.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class DataInit {
   private List<UserInfo> userInfoList;

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    //    第三步：对外开放自己
    public final static DataInit getInstance() {
        return instance;
    }

    // 第二步：自己new自己
private  static  DataInit instance= new DataInit();
//第一步 ：把无参构造，私有化
//构造方法，当这个类 一创建出来，就开始执行
    private DataInit () {

//        使用集合创建5个用户，10个管理员
        userInfoList=new ArrayList<UserInfo>();
        UserInfo userCustomer=null;
        for (int i = 0; i <10; i++) {
            userCustomer= new Customer("laowang"+i,"123","客户"+i,"1232312");
            userInfoList.add(userCustomer);
        }
        for (int i = 0; i <5; i++) {
            userCustomer= new Manager("laoli"+i,"123","银行职员"+i,"12312312",12000);
            userInfoList.add(userCustomer);
        }

//        System.out.println(userInfoList);
    }



}
