package Stack;
import java.util.Stack;
public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = Smallestonleft(heights,n);
        int[] right = Smallestonright(heights,n);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){
            int area = (right[i] - left[i] - 1)*heights[i];
            max = Math.max(max,area);
        }
        return max;
    }
    static int[] Smallestonright (int[] arr, int n) {
        // Complete the function
        Stack<Integer> s = new Stack<>();
        int[] result = new int[n];
        for (int i = n - 1;i >=0 ;i--){
            while(!(s.isEmpty()) && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            result[i] = s.isEmpty()? n : s.peek();
            s.push(i);
        }
        return result;
    }
    static int[] Smallestonleft (int[] arr, int n) {
        // Complete the function
        Stack<Integer> s = new Stack<>();
        int[] result = new int[n];
        for (int i = 0;i < n;i++){
            while(!(s.isEmpty()) && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            result[i] = s.isEmpty()? -1 : s.peek();
            s.push(i);
        }
        return result;
    }



}
