public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (array[mid] == target)
                return mid;
            else if (array[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Target not found
    }

    public static int recursionFind(int[]array, int target){
        int low = 0;
        int high = array.length - 1;

        if(array[low] > array[high]){
            return -1;

        } else {
          binarySearch(array, target);

        }

        return target;

        
    }



    public static void main(String[] args) {
        int[] numbers = {3, 1,4, 5, 6, 7, 8, 9, 10, 12, 13, 14 };
        int target = 6;
        int result = binarySearch(numbers, target);
        int result2 = recursionFind(numbers, target);

        if (result == -1)
            System.out.println("Element not found");
        else 
            System.out.println("Element found at index  " + result2 + " with recursion");
            
    }
}
