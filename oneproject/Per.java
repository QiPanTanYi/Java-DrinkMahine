package oneproject;
public class Per {
    /*
    构造会员类
     */
    private String call;
    private int number;
    private String personpw;
    private String femininitytest;
    public Per(){}
    public Per(int number,String call,String femininitytest,String personpw){
        this.call=call;
        this.number=number;
        this.personpw=personpw;
        this.femininitytest=femininitytest;
        }
        public String toString(){
        return "会员号码："+number+"\n"+"会员名称"+call+"\n"+femininitytest;
    }
        public int getNumber(){
            return number;
        }
        public void setNumber(int number){
            this.number = number;
        }
        public String getCall(){
            return call;
        }
        public void setCall(String call) {
            this.call = call;
        }
        public String getPersonpw() {
            return personpw;
        }
        public void setPersonpw(String personpw) {
            this.personpw = personpw;
        }
        public String getFemininitytest() {
        return femininitytest;
    }
        public void setFemininitytest(String femininitytest) {
        this.femininitytest = femininitytest;
    }
    }