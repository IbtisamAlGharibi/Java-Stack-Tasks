import java.util.Stack;

public class EmployeeStackDemo {
    public  static void main(String[] args){

        Stack<String> employeeAction = new Stack<>();
        employeeAction.push("Enter");
        employeeAction.push("Leave");
        employeeAction.push("Work");
        employeeAction.push("Write");
        employeeAction.push("Submit");

        System.out.println(employeeAction);

        employeeAction.push("Remove");
        System.out.println(employeeAction);



    }

}
