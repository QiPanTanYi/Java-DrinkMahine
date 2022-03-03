package oneproject;

import java.util.Scanner;

public class User {
    /*
     * 会员用户注册及登录
     */
    private static final int person = 100;
    private static Per[] pe = new Per[person];
    private static int perIndex = 0;
    static {
        pe[perIndex++] = new Per(1, "颜元冠", "女", "666");
        pe[perIndex++] = new Per(2, "龚夏宇", "男", "4399");
    }

    public void newUser() {
        Scanner c1 = new Scanner(System.in);
        System.out.println("请输入手机号码登录：");
        String userName = c1.nextLine();
        System.out.println("请输入验证码：");
        String password = c1.nextLine();
        System.out.println("【正在验证中】");
        for (int i = 0; i < 3; i++) {
            Scanner us = new Scanner(System.in);
            System.out.println("请再次输入您的手机号码：");
            String u1 = us.nextLine();
            System.out.println("请输入登录时使用的验证码：");
            String u2 = us.nextLine();
            if (u1.equals(userName) && u2.equals(password)) { // 验证用户名与密码是否正确
                System.out.println("欢迎" + "\t" + "【" + userName + "】" + "\t" + "登录");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的错误次数达到极限，请10分钟后再次尝试");
                    DrinkMachine we = new DrinkMachine();
                    we.main(new String[] {});
                }
                System.out.println("手机号或验证码与首次输入不一致,请重新输入...\n" + "您还有" + (2 - i) + "次机会");

            }
        }
    }

    public void register() {
        System.out.println("注册您的专属会员编号");
        System.out.println("【请从序号 3 开始填写】");
        int number;
        String call, femininitytest, personpw;
        Scanner iu = new Scanner(System.in);
        System.out.println("请输入编号：");
        number = iu.nextInt();
        System.out.println("请输入名称：");
        call = iu.next();
        System.out.println("请输入性别：");
        femininitytest = iu.next();
        System.out.println("请输入密码：");
        personpw = iu.next();
        System.out.println("注册成功！\n当前会员数量为" + (++perIndex));
        pe[perIndex - 1] = new Per(number, call, femininitytest, personpw);
    }

    public void inquiry() {
        System.out.println("请输入您需要查询的会员编号：");
        System.out.println("若无法查询到该编号，则自动返回主菜单");
        Scanner et = new Scanner(System.in);
        int id2 = et.nextInt();
        for (int i = 0; i < perIndex; i++) {
            if (id2 == 1 | id2 == 2) {
                System.out.println("会员编号：" + pe[id2 - 1].getNumber());
                System.out.println("会员名称：" + pe[id2 - 1].getCall());
                break;
            } else if (pe[i].getNumber() == id2) {
                System.out.println("会员编号：" + pe[id2 - 1].getNumber());
                System.out.println("会员名称：" + pe[id2 - 1].getCall());
                System.out.println(pe[id2 - 1].getFemininitytest());
                System.out.printf("查询成功，自动返回上级菜单\n");
                break;
            }
        }
        return;
    }

    public void theUser() {
        int c;
        Menu pi = new Menu();
        pi.Menu5();
        Scanner cg = new Scanner(System.in);
        c = cg.nextInt();
        switch (c) {
            case 1:
                User yi = new User();
                yi.newUser();
                break;
            case 2:
                User yq = new User();
                yq.register();
                break;
            case 3:
                User qu = new User();
                qu.inquiry();
                DrinkMachine di = new DrinkMachine();
                di.main(new String[] {});
                break;
            case 0:
                DrinkMachine dt = new DrinkMachine();
                dt.main(new String[] {});
            default:
                System.out.println("输入无效，自动返回主菜单");
                DrinkMachine dz = new DrinkMachine();
                dz.main(new String[] {});
        }
    }
}