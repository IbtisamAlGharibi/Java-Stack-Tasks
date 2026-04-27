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

        findNextGreaterElement(arr1);
        findNextGreaterElement(arr2);
        findNextGreaterElement(arr3);
        findNextGreaterElement(arr4);
        findNextGreaterElement(arr5);
        findNextGreaterElement(arr6);
        findNextGreaterElementCircular(arr5);
        findNextSmallerElement(arr5);

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
        displayResults(arr, result);

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
        displayResults(arr, result);

    }

    public static void findNextSmallerElement(int[] arr){

        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            result[i] = -1;
        }
        for (int i = 0; i < n; i++){
            while (!arrays.isEmpty() && arr[arrays.peek()] > arr[i]){
                result[arrays.pop()] = arr[i];
            }
            arrays.push(i);
        }
        displayResults(arr, result);

    }
    public static void displayResults(int[] arr, int[] result){
        System.out.println("Index | Value | Next");
        for (int i = 0; i < arr.length; i++){
            System.out.println(i + "     | " + arr[i] + "     | " + result[i]);
        }
    }

}

