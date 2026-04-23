import java.util.Stack;

public class EmployeeStackSearch {
    public static void main(String[] args){
        Stack<String> employeeAction = new Stack<>();
        employeeAction.push("Enter");
        employeeAction.push("Leave");
        employeeAction.push("Work");
        employeeAction.push("Write");
        employeeAction.push("Submit");
        employeeAction.push("Remove");

        System.out.println(employeeAction);

        int find = employeeAction.search("Leave");
        System.out.println(find);

        int find2 = employeeAction.search("Submit");
        System.out.println(find2);

        boolean check = employeeAction.contains("Enter");
        System.out.println(check);
    }
}
