package oneproject;
import java.util.Scanner;
public class Menu {
    private static final int size=100;
    private static Goods[] gs=new Goods[size];
    private static int goodsIndex=0;
    static {
        gs[goodsIndex++] = new Goods(1,"无糖可乐",10,0,10);
        gs[goodsIndex++] = new Goods(2,"百事可乐",10,950,10);
        gs[goodsIndex++] = new Goods(3,"芬达",10,916,10);
        gs[goodsIndex++] = new Goods(4,"罐装芬达",20,538,10);
        gs[goodsIndex++] = new Goods(5,"冰红茶",20,525,10);
        gs[goodsIndex++] = new Goods(6,"蒙牛牛奶",20,692500,10);
        gs[goodsIndex++] = new Goods(7,"营养快线",20,355040,10);
        gs[goodsIndex++] = new Goods(8,"脉动",20,49200,10);
        gs[goodsIndex++] = new Goods(9,"罐装椰奶",30,509600,10);
    }
    public static void query(){
        for (Goods j:gs){
            if (j!=null)
                System.out.println(j.toString());
        }
    }
    public static void query1(){
        for (Goods q:gs){
            if (q!=null)
                System.out.println(q.toString());
        }
    }
    /*
     * 管理所有菜单文字
     */
    public void Menu1(){
        System.out.println("=============欢迎进入饮料售卖机==============");
        System.out.println("          1-购买饮料");
        System.out.println("          2-会员登录（享受七折优惠）");
        System.out.println("          3-管理员登录");
        System.out.println("          0-刷新界面");
        System.out.println("==========================================");
    }
    public void Menu2(){
        try{
            System.out.println("以下饮料供您选择：");
            query();
            System.out.println("请选择饮品：");
            Scanner in=new Scanner(System.in);
            int id=in.nextInt();
            int i;
            boolean flag=false;
            while(true){
                for (i=0;i<gs.length;i++){
                    if(gs[i].getId()==id){
                        System.out.println("您选择的是："+gs[i].getName());
                        System.out.println("请投入现金进行支付");
                        flag=true;
                        break;
                    }
                }
                if (flag==true)
                    break;
                else{
                    System.out.println("无此饮料,请重新选择(0 退出)");
                    id=in.nextInt();
                    if (id==0){
                        System.out.println("欢迎下次购买...");
                        return;
                    }
                    else i=0;
                }
            }
            System.out.println("输入数量");
            Scanner co = new Scanner(System.in);
            int count=co.nextInt();
            if (count<=10 & count>0){
                int total = (int) (gs[i].getPrice()*count);
                double cal=count*gs[i].getKl();
                MoneyCounter mc=new MoneyCounter();
                mc.Cal(total);
                System.out.println("卡路里小提示：\n预计摄入热量值为："+cal+"焦");
            }else {
                System.out.println("限制购买瓶数为10瓶，请重新选择...");
                Menu io=new Menu();
                io.Menu2();
            }
        }catch (Exception e){
            System.out.println("输入无效");
            e.printStackTrace();
        }
    }
    public void Menu3(){
        try{
            System.out.println("以下饮料供您选择：");
            query1();
            System.out.println("请选择饮品：");
            Scanner ip=new Scanner(System.in);
            int id=ip.nextInt();
            int k;
            boolean choose=false;
            while(true){
                for (k=0;k<gs.length;k++){
                    if(gs[k].getId()==id){
                        System.out.println("您选择的是："+gs[k].getName());
                        System.out.println("【请投入现金进行支付】");
                        choose=true;
                        break;
                    }
                }
                if (choose==true)
                    break;
                else{
                    System.out.println("无此饮料,请重新选择(输入 0 退出)");
                    id=ip.nextInt();
                    if (id==0){
                        System.out.println("欢迎下次购买...");
                        return;
                    }
                    else k=0;
                }
            }
            System.out.println("输入数量");
            Scanner co = new Scanner(System.in);
            int count=co.nextInt();
            if (count<=10 & count>0){
                int total = (int) (gs[k].getPrice()*count*7/10);
                double cal=count*gs[k].getKl();
                MoneyCounter mc=new MoneyCounter();
                mc.Cal(total);
                System.out.println("卡路里小提示：\n预计摄入热量值为："+cal+"焦");
            }else {
                System.out.println("限制购买瓶数为10瓶，请重新选择");
                Menu io=new Menu();
                io.Menu3();
            }
        }catch (Exception e1){
            System.out.println("输入无效，请重新输入");
            e1.printStackTrace();
        }
    }
    public void Menu4(){
        System.out.println("请使用该机器的默认管理员用户名及密码登录");
        String admin = "123";
        String adminPassword = "123456";
        for(int j=0;j<3 ;j++ ){
            Scanner a1 = new Scanner(System.in);
            System.out.println("请输入管理员用户名：");
            String adm1 = a1.nextLine();
            System.out.println("请输入管理员密码：");
            String adm2 = a1.nextLine();
            if(adm1.equals(admin) && adm2.equals(adminPassword)){   //验证管理员名与密码是否正确
                System.out.println("欢迎管理员登录");
                int b;
                while (true){
                    System.out.println("=============欢迎进入管理员系统==============");
                    System.out.println("          1-查询饮料信息");
                    System.out.println("          2-添加新饮料");
                    System.out.println("          0-退出页面");
                    System.out.println("==========================================");
                    Scanner sc=new Scanner(System.in);
                    b=sc.nextInt();
                    switch (b){
                        case 2:
                            int id,price,Kl,num;
                            String name;
                            System.out.println("请输入编号(从10开始计入)：");
                            id=sc.nextInt();
                            System.out.println("请输入名称：");
                            name=sc.next();
                            System.out.println("请输入价格：");
                            price=sc.nextInt();
                            System.out.println("请输入热量值：");
                            Kl=sc.nextInt();
                            System.out.println("请输入数量：");
                            num=sc.nextInt();
                            System.out.println("添加饮料成功！当前饮料售卖机的饮料种类为："+(++goodsIndex)+"种");
                            gs[goodsIndex++] = new Goods(id,name,price,Kl,num);
                            break;
                        case 1:
                            System.out.println("请输入您需要查询的饮料编号：");
                            System.out.println("若无法查询到该编号，则自动返回主菜单");
                            Scanner er = new Scanner(System.in);
                            int id1 = er.nextInt();
                            int hi=0;
                            for (int o =0; o<goodsIndex; o++){
                                int hi1 = hi+1;
                                if (hi1==1){
                                if (gs[id1].getId() == o){
                                    System.out.println("饮料编号："+gs[o].getId() );
                                    System.out.println("饮料名称："+gs[o].getName() );
                                    System.out.println("饮料价格："+gs[o].getPrice() );
                                    System.out.println("饮料热量："+gs[o].getKl() );
                                    System.out.println("饮料数量："+gs[o].getNum() );
                                    break;
                                }
                            }else {
                            DrinkMachine dx = new DrinkMachine();
                            dx.main(new String[]{});
                        }
                    }
                        case 0:
                            System.out.println("刷新成功");
                            DrinkMachine drinkMachine = new DrinkMachine();
                            drinkMachine.main(new String[]{});
                        default:
                            System.out.println("输入无效，自动返回主菜单");
                            DrinkMachine dt = new DrinkMachine();
                            dt.main(new String[]{});
                    }
                }
            }else{
                if(j==2){
                    System.out.println("您的错误次数达到极限，请10分钟后再次尝试");
                }
                System.out.println("用户名或密码错误,您还有"+(2-j)+"次机会");
            }
        }
    }
    public void Menu5(){
        System.out.println("=============欢迎进入用户管理系统==============");
        System.out.println("          1-手机信息登录");
        System.out.println("          2-会员注册");
        System.out.println("          3-会员查询");
        System.out.println("          0-返回主菜单");
        System.out.println("==========================================");
    }
}