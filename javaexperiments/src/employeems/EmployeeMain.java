package employeems;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeDataAccess dataAccess=new EmployeeDataAccess();
        String languages[]={"java","python"};
        String tools[]={"idea","eclipse"};
        dataAccess.registerDeveloper(1,"deepika",24,languages,tools);
        dataAccess.registerManager(2,"akshay",25,"city",10);

        Employee found=dataAccess.findById(2);
        System.out.println("employee found=" + found.getId() + "-" + found.getName()
                + "-" + found.getAge());

        System.out.println("***printing all elements");
        dataAccess.printAll();

    }
}
