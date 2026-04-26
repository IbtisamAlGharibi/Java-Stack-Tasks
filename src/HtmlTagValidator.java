import java.util.Stack;

public class HtmlTagValidator {
    public static void main(String[] args){

        String str1 = "<html></html>";
        String str2 = "<head></head>";
        String str3 = "<body></body>";
        String str4 = "<p></p>";
        String str5 = "<header></header>";

        System.out.println(validateHtmlTags(str1));
        System.out.println(validateHtmlTags(str2));
        System.out.println(validateHtmlTags(str3));
        System.out.println(validateHtmlTags(str4));
        System.out.println(validateHtmlTags(str5));
    }

    public static boolean validateHtmlTags(String html){

        Stack<String> stack = new Stack<>();

        if (html == null || html.isEmpty()) {
            System.out.println("Empty string");
            return false;
        }

        String[] parts = html.split("<");

        for (int i = 0; i < parts.length; i++) {

            String part = parts[i];

            if (!part.contains(">")) continue;

            String tag = part.substring(0, part.indexOf(">"));

            if (tag.endsWith("/")) {
                continue;
            }

            if (tag.startsWith("/")) {

                String name = tag.substring(1);

                if (stack.isEmpty()) {
                    System.out.println("No opening tag for " + name);
                    return false;
                }

                String top = stack.pop();

                if (!top.equals(name)) {
                    System.out.println("Mismatch " + top + " and " + name);
                    return false;
                }

            } else {

                String name = tag.split(" ")[0];
                stack.push(name);
            }
        }

        if (!stack.isEmpty()) {
            System.out.println(" Unclosed tags " + stack);
            return false;
        }

        return true;


    }
}