class Maximum{
    public static void main(String args[]){
        int max=0;
        int arr[]={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
