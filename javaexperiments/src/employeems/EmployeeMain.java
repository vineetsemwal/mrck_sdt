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
        dataAccess.printAll();

    }
}
