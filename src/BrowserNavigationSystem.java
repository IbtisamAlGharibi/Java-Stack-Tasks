import java.util.Stack;

public class BrowserNavigationSystem {
    static   Stack<String> backStack = new Stack<>();
    static  Stack<String> forwardStack = new Stack<>();
    static String currentPage = "";
    public static void main( String[] args){

    }

    public static String visitPage(String url){
        if (!(currentPage == null)){
            backStack.push(currentPage);
            forwardStack.clear();
            currentPage = url;
        }
        return currentPage;
    }

    public static void goBack(){
        if (backStack.isEmpty()){
            System.out.println("cannot go back");
            forwardStack.push(currentPage);
            currentPage = forwardStack.pop();
        }
    }

    public static void goForward(){
        if (forwardStack.isEmpty()){
            System.out.println("cannot go forward");
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        }
    }

    public static void showCurrentPage(){
        System.out.println("Current Page:" + " "+ currentPage);
    }

    public static void showHistory(){
        for (int i = 0; i<backStack.size(); i++){
            System.out.println(backStack.get(i));
        }

        for (int i = 0; i<forwardStack.size(); i++){
            System.out.println(forwardStack.get(i));
        }
    }
}
