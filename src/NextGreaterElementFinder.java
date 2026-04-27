import java.util.Stack;

public class NextGreaterElementFinder {
    static Stack<Integer> arrays = new Stack<>();

    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 ={2,3,4};
        int[] arr3 = {4,5,2};
        int[] arr4 = {1,6,9};
        int[] arr5 ={2,8,9,3};
        int[] arr6 = {4,8,6,0};

    }
    public static void findNextGreaterElement(int[] arr){
        if (arr == null || arr.length == 0)
            return;

        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = -1;
        }

        for (int i = 0; i < n; i++){
            System.out.println("Processing:" + arr[i]);

            while (!arrays.isEmpty() && arr[arrays.peek()] < arr[i]){
                int index = arrays.pop();
                result[index] = arr[i];
            }

            arrays.push(i);

            System.out.println("Stack:" + arrays);
        }

    }

    public static void findNextGreaterElementCircular(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            result[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++){
            int index = i % n;
            while (!arrays.isEmpty() && arr[arrays.peek()] < arr[index]){
                result[arrays.pop()] = arr[index];
            }

            if (i < n){
                arrays.push(index);
            }
        }

    }

    public static void findNextSmallerElement(int[] arr){

    }

}

