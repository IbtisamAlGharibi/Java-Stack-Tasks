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

    }
}
