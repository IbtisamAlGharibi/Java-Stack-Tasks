import java.util.Stack;

public class LargestRectangleInHistogram {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){

        int[] h1 = {2,1,5,6,2,3};
        int[] h2 = {2,4};
        int[] h3 = {6,2,5,4,5,1,6};
        int[] h4 = {};
        int[] h5 = {5};

        int[][] tests = {h1,h2,h3,h4,h5};


        for (int i = 0; i < tests.length; i++) {
            stack.clear();
            System.out.println("Test " + (i + 1));
            int result = findLargestRectangle(tests[i]);
            System.out.println("Max Area: " + result);
        }
    }

    public static int findLargestRectangle(int[] heights){
        if (heights.length == 0){
            return 0;
        }

        int max = 0;

        for (int i = 0; i <= heights.length; i++) {

            while (!stack.isEmpty() &&
                    (i == heights.length || heights[i] < heights[stack.peek()])) {

                int h = heights[stack.pop()];
                int width;

                if (stack.isEmpty()) width = i;
                else width = i - stack.peek() - 1;

                int area = calculateArea(heights, 0, width, h);

                if (area > max) max = area;

                System.out.println("Stack: " + stack + " Height: " + h + " Width: " + width + " Area: " + area);
            }

            stack.push(i);
        }

        return max;
    }

    public static int calculateArea(int[] heights, int start, int end, int height){
        return height * end;
    }

    public static void displayHistogram(int[] heights){
        System.out.println("Histogram:");

        int max = 0;
        for (int h : heights) if (h > max) max = h;

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < heights.length; j++) {
                if (heights[j] >= i) System.out.print("# ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void displayResult(int[] heights, int maxArea){
        System.out.println("Max Area: " + maxArea);
    }

}