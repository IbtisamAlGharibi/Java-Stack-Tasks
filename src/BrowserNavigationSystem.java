import java.util.Stack;

public class BrowserNavigationSystem {
    static   Stack<String> backStack = new Stack<>();
    static  Stack<String> forwardStack = new Stack<>();
    static String currentPage = "";
    public static void main( String[] args){

        visitPage("google.com");
        showCurrentPage();
        visitPage("youtube.com");
        showCurrentPage();
        visitPage("github.com");
        showCurrentPage();
        goBack();
        goBack();
        goForward();
        visitPage("stackoverflow.com");
        showCurrentPage();
        goBack();

        System.out.println("History:");
        showHistory();

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
        System.out.println("Current page " + currentPage);
        System.out.println("back stack" + backStack);
        System.out.println("forward stack" + forwardStack);
    }

    public static void goForward(){
        if (forwardStack.isEmpty()){
            System.out.println("cannot go forward");
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        }
        System.out.println("Current page " + currentPage);
        System.out.println("back stack" + backStack);
        System.out.println("forward stack" + forwardStack);

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
