public class Sumoflast2 {
    public static void main(String args[]){
        int num=128;
        int sum=0;
        int count=1;
        while(num != 0&&count<=2){
            int res=num%10;
            sum=res+sum;
            count++;
            num=num/10;
        }
        System.out.print(sum);
    }
}
