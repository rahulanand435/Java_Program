package Array;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        int a = 6;
        System.out.println(last( arr, a ));
    }
    static int binarySearch(int[] arr, int a){
        int start = 0;
        int end = arr.length - 1 ;
        int pos = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] < a){
                start = mid + 1;
            }else if (arr[mid] > a){
                end = mid - 1;
            }else{
                pos = mid;
                end = mid - 1;
            }
        }
        return  pos;
    }
    static int last(int[] arr, int a){
        int start = 0;
        int end = arr.length - 1;
        int pos = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > a){
                end = mid - 1;
            }else if (arr[mid] < a){
                start = mid + 1;
            }else{
                pos = mid;
                start = mid + 1;
            }
        }
        return pos;
    }
}
