import java.util.Stack;

public class BrowserHistorySimulator {
    public static void main(String[] args){
        Stack<String> webPages = new Stack<>();
        webPages.push("Amazon");
        webPages.push("Shein");
        webPages.push("AliExpress");
        webPages.push("Slack");
        webPages.push("ClickUp");

        System.out.println(webPages);
        System.out.println(webPages.pop());
        System.out.println(webPages.pop());

        System.out.println(webPages.peek());

        System.out.println(webPages.isEmpty());

        webPages.push("Teams");
        webPages.push("Zoom");

        System.out.println(webPages);




    }
}
