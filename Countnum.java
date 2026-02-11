public class Countnum{
    public int numCount(int input1){
        int count=0;
        while(input1>0){
            input1=input1/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Countnum c1=new Countnum();
        c1.numCount(222);
    }
}
