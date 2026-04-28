import java.util.Stack;

public class LargestRectangleInHistogram {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args){


    }
    public static int findLargestRectangle(int[] heights){
        if (heights.length == 0){
            return 0;
        }
        for (int i = 0; i <= heights.length; i++) {
            while (!stack.isEmpty() &&
                    (i == heights.length || heights[i] < heights[stack.peek()])) {

            }

        }
    }

    public static int calculateArea(int[] heights, int start, int end, int height){

    }
}
