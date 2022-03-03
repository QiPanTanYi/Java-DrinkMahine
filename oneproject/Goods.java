package oneproject;
public class Goods {
    /*
     * 构造商品属性方法
     */
    private int id;
    private String name;
    private int price;
    private int Kl;
    private int num;
    public Goods(){}
    public Goods(int id,String name,int price,int Kl,int num){
        this.id=id;
        this.name=name;
        this.price=price;
        this.Kl=Kl;
        this.num=num;
    }
    public String toString(){
        return id+"."+name+"("+price+"元)"+"\t"+"\t"+Kl+"焦"+"\t"+num+"瓶";
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getKl() {
        return Kl;
    }
    public void setKl(int Kl) {
        this.Kl = Kl;
    }
    public int getNum(){return num;}
    public void setNum(int num){this.num=num;}
}