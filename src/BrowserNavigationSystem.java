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

    }
}
