import java.util.Stack;

public class TextEditorWithUndoRedo {
    public static void main(String[] args){
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();
        StringBuilder builder = new StringBuilder();

    }

    public static void type(String text){
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();
        StringBuilder builder = new StringBuilder();
        undo.push(text);
        redo.push(text);
        builder.append(text);
        System.out.println(undo);
        System.out.println(redo);

    }
}
