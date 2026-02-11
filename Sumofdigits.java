public class Sumofdigits {
    public static void sumofevenandodd(int num){
        int sum=0;
        while(num > 0){
        if(num%2==0){
            int reminder=num%10;
            if(reminder%2==0){
                sum=reminder+sum;
                num=num/10;
            }
        }
        else{
            int reminder=num%10;
            if(reminder%2!=0){
                sum=reminder+sum;
                num=num/10;
            }
        }
    }
    System.out.print(sum);
}
    public static void main(String args[]){
        Sumofdigits s1=new Sumofdigits();
        s1.sumofevenandodd(11);
    }
}
