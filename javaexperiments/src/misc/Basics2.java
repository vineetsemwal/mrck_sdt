package misc;

import employeems.Employee;
import employeems.Manager;

public class Basics2 {
    public static void main(String[] args) {
        Employee employee=new Manager(1,"akshita",24,"city",5);
        System.out.println("id="+employee.getId()+"name="+employee.getName());
        boolean isManager=employee instanceof Manager;
        if(isManager) {
            Manager manager = (Manager) employee;
            String handlingProject = manager.getHandlingProject();
        }
    }
}
