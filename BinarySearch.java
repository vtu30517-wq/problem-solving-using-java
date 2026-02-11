class Main {
 public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
                 if (arr[mid] == target) {
                return mid;      
            } 
            else if (arr[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;   
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 77, 88, 99};
        int target = 77;
        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
