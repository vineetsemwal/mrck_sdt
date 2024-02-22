package collectiondemos;

import employeems.Employee;

public class IdentityEqualityCheck {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"chandra",22);
        Employee emp2=new Employee(1,"chandra",22);
        boolean equals=emp1.equals(emp2);
        System.out.println("equals="+equals);
    }
}
