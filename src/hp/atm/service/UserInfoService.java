package hp.atm.service;

import hp.atm.bean.UserInfo;
import hp.atm.datainit.DataInit;

import java.util.List;

public class UserInfoService {
    private List<UserInfo> userInfoList;//所有的数据就完成初始化了

    public UserInfoService() {
        DataInit datainit = DataInit.getInstance();//内存
        userInfoList = datainit.getUserInfoList();
    }
    //    对userInfoList进行性判断，管理员返回1，顾客返回0
//    对账号密码做判断
    public int checkPwd(String name, String password) {
        for (int i = 0; i < userInfoList.size(); i++) {
//            先判断账户pwd是否正确
            if (userInfoList.get(i).getId().equals(name) && userInfoList.get(i).getPassword().equals(password)) {
                if (name.contains("laowang")) {
                    return 0;
                }
                if (name.contains("laoli")) {
                    return 1;
                }
            }
//
        }
return 3;
    }
}

