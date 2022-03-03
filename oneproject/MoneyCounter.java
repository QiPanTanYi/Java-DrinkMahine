package oneproject;
import java.util.*;
public class MoneyCounter {
    /*
     * 顾客结算机制
     */
    public void Cal(int Price){
        Scanner in = new Scanner(System.in);
        System.out.println("投币口在下方，只支持人民币！");
        int totalPay = in.nextInt();
        if(totalPay == Price){
            Equal();
        }
        else if(totalPay>Price){
            More(Price,totalPay);
        }
        else{
            for(int i=0;totalPay<Price;i++){    //当投入金额小于饮料价格，提示继续投币
                Scanner input=new Scanner(System.in);
                System.out.println("投入金额不足以支付本次交易，请继续投币");
                int everyPay =input.nextInt();
                totalPay += everyPay;
            }
            if(totalPay == Price){  //当再次投币出现投币金额等于价格时，调用Equal方法
                Equal();
            }
            else{
                More(Price,totalPay);
            }
        }
    }
    public void Equal(){        //当投入硬币与价格相同时
        System.out.println("请在出口处取出饮料，找零为0元");
        System.out.println("欢迎下次使用！");
    }
    public void More(int Price,int totalPay){
        int backPay = totalPay-Price;
        int fiveHp = backPay/50;
        int fiveHRemain = backPay-fiveHp * 50;
        int twoHp = fiveHRemain/20;
        int twoHRemain = fiveHRemain-twoHp * 20;
        int oneHp = twoHRemain/10;
        int oneHRemain = twoHRemain-oneHp * 10;
        int fiftyp = oneHRemain/5;
        int fiftyRemain = oneHRemain-fiftyp*5;
        int tenp = fiftyRemain;
        System.out.println("请在出口处取饮料，找零为："+backPay+"\n"+"分别为：");
        System.out.println("50元："+fiveHp+"张");
        System.out.println("20元："+twoHp+"张");
        System.out.println("10元："+oneHp+"张");
        System.out.println("5元："+fiftyp+"张");
        System.out.println("1元："+tenp+"张");
        System.out.println("请在出口处取出饮料，欢迎下次使用！");
    }
}