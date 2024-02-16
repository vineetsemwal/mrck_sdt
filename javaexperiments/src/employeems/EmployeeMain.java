package employeems;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeDataAccess dataAccess=new EmployeeDataAccess();
        dataAccess.register(1,"deepika",24);
        dataAccess.register(2,"akshay",25);

        Employee found=dataAccess.findById(2);
        System.out.println("employee found=" + found.getId() + "-" + found.getName()
                + "-" + found.getAge());

        System.out.println("***printing all elements");
        Employee allEmployees[]=dataAccess.getAll();
        for (int i = 0; i < allEmployees.length; i++) {
            Employee iterated = allEmployees[i];
            System.out.println("details=" + iterated.getId() + "-" + iterated.getName()
                    + "-" + iterated.getAge());
        }
    }
}
