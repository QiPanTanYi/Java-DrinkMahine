package oneproject;
import java.util.Scanner;
public class DrinkMachine {
    /*
     *构建售卖机系统
     */
    public static void main(String[] args) {
        int a;
        while (true){
            Menu one = new Menu();
            one.Menu1();
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            switch (a){
                case 1:
                    Menu two = new Menu();
                    two.Menu2();
                    break;
                case 2:
                    Scanner vi = new Scanner(System.in);
                        User sm = new User();
                        sm.theUser();
                        System.out.println("【输入 1 进入购买】\n【输入 2 返回上一级】\n【输入 0 返回主菜单】");
                        int v=vi.nextInt();
                        switch (v){
                            case 1:
                                Menu three = new Menu();
                                three.Menu3();
                                break;
                            case 2:
                                User st = new User();
                                st.theUser();
                                break;
                            case 0:
                                DrinkMachine dz = new DrinkMachine();
                                dz.main(new String[]{});
                            default:
                                System.out.println("输入无效，自动返回主菜单");
                                DrinkMachine dx = new DrinkMachine();
                                dx.main(new String[]{});
                        }
                    continue;
                case 3:
                    Menu four = new Menu();
                    four.Menu4();
                case 0:
                    System.out.println("刷新成功");
                    break;
                default:
                    System.out.println("输入无效，自动返回主菜单");
                    DrinkMachine dt = new DrinkMachine();
                    dt.main(new String[]{});
            }
        }
    }
}