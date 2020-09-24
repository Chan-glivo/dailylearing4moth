package hp.atm.datainit;

import hp.atm.service.UserInfoService;
import sun.plugin.extension.NativeExtensionInstaller;

import java.util.Scanner;

public class AtmMain {
    private  static UserInfoService service=new UserInfoService();
    public static void main(String[] args) {
        chushi();
    }

    private static void chushi() {
        int errNum=0;
        while (errNum<3){
        System.out.println("****************** ****************** ");
        System.out.println("******************ATM取款机******************");
        System.out.println("******************欢迎您使用ATM取款机******************");
        System.out.println("请输入你的卡号");
        Scanner scanner = new Scanner(System.in);
        String account = scanner.next();
        System.out.println("请输入你的密码");
        String pwd = scanner.next();
        /**
         * 检测账户名和密码，如果正确，弹出用户界面，错误三次退出
         */
        int checkPassword = service.checkPwd(account,pwd);
        if (checkPassword==0){
            System.out.println("欢迎用户"+account+"登录，请注意安全");
            ShowMeauNum();
            System.out.println("****************** ****************** ");
            String baseOptionNum = scanner.next();
            ShowMenu(scanner, baseOptionNum);
        }else if (checkPassword==1){
            System.out.println("欢迎管理员"+account+"登录,请注意安全");
            ShowMeauNum1();
            System.out.println("****************** ****************** ");
            String baseOptionNum = scanner.next();
            ShowMenu1(scanner, baseOptionNum);
        }else {
            errNum++;
            System.out.println("错误"+errNum+"次");
        }
        }
        if (errNum==3){
   System.exit(0);
   chushi();

}
    }

    private static void ShowMenu1(Scanner scanner, String baseOptionNum) {
        switch (baseOptionNum){
            case "1":
                System.out.println("查看用户");
                ShowMeauNum1();
                String next1 = scanner.next();
                ShowMenu1(scanner, next1);
                break;
            case "2":
                System.out.println("修改用户");
                ShowMeauNum1();
                String next2 = scanner.next();
                ShowMenu1(scanner, next2);
                break;
            case "3":
                System.out.println("删除");
                ShowMeauNum1();
                String next3 = scanner.next();
                ShowMenu1(scanner, next3);
                break;
            case "4":
                System.out.println("查看工资");
                ShowMeauNum1();
                String next4 = scanner.next();
                ShowMenu1(scanner, next4);
                break;
            case "5":
                System.out.println("退卡功能");
                chushi();
                String next5 = scanner.next();
                break;
        }}
    private static void ShowMenu(Scanner scanner, String baseOptionNum) {
        switch (baseOptionNum){
            case "1":
                System.out.println("查询余额");
                ShowMeauNum();
                String next1 = scanner.next();
                ShowMenu(scanner, next1);
                break;
            case "2":
                System.out.println("取款");
                ShowMeauNum();
                String next2 = scanner.next();
                ShowMenu(scanner, next2);
                break;
            case "3":
                System.out.println("转账功能");
                ShowMeauNum();
                String next3 = scanner.next();
                ShowMenu(scanner, next3);
                break;
            case "4":
                System.out.println("存款功能");
                ShowMeauNum();
                String next4 = scanner.next();
                ShowMenu(scanner, next4);
                break;
            case "5":
                System.out.println("退卡功能");
                chushi();
                String next5 = scanner.next();

                break;
        }
    }
    private static void ShowMeauNum1() {
            System.out.println("****************** ****************** ");
            System.out.println("****************** 请输入你想要的操作类型 ****************** ");
            System.out.println("*********1.查看用户  2.修改用户*********");
            System.out.println("*********3.删除 4.查看工资*********");
            System.out.println("*********5.退卡 *********");
        }
    private static void ShowMeauNum() {
        System.out.println("****************** ****************** ");
        System.out.println("****************** 请输入你想要的操作类型 ****************** ");
        System.out.println("*********1.查询余额  2.取款*********");
        System.out.println("*********3.转账 4.存款*********");
        System.out.println("*********5.退卡 *********");
    }
}
