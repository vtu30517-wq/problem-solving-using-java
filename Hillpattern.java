public class  Hillpattern{
    public int totalhillweight(int input1,int input2,int input3){
        int total=0;
        int current=input2;
        for(int i=1;i<=input1;i++){
            total=total+(1*current);
            current=current+input3;
        }
        return total;
    }
    public static void main(String args[]){
        Hillpattern h1=new Hillpattern();
        System.out.print(h1.totalhillweight(5,10,2));
    }
}
