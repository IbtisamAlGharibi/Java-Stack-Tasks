import java.util.Stack;

public class HtmlTagValidator {
    public static void main(String[] args){
        Stack<String> tags = new Stack<>();
        String str1 = "<html> </html>";
        String str2 = "<head> </head>";
        String str3 = "<body> </body>";
        String str4 = "<p> </p>";
        String str5 = "<header> </header>";

    }

    public static boolean validateHtmlTags(String html){
        Stack<String> stack= new Stack<>();
        if (html == null || html.isEmpty()) {
            System.out.println("Empty string");
            return false;

            String[] parts = html.split("<");

            for (int i = 0; i < parts.length; i++) {
                String part = parts[i];
                if (!part.contains(">")) continue;
                String tag = part.substring(0, part.indexOf(">"));

                if (tag.endsWith("/")) {
                    System.out.println("Self-closing tag: " + tag);
                    continue;

                }
                if (tag.startsWith("/")){
                    String name = tag.substring(1);

                    if (stack.isEmpty()){
                        System.out.println("No opening tag for " + name);
                        return false;
                    }

            }
        }
    }
}
