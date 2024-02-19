package employeems;

public class EmployeeApp {

    public static void main(String[] args) {
        EmployeeApp app = new EmployeeApp();
        app.runApp();
    }

    void runApp() {
        IEmployeeDataAccess dataAccess = new EmployeeDataAccess();
        String languages[] = {"java", "python"};
        String tools[] = {"idea", "eclipse"};
        dataAccess.registerDeveloper(1, "deepika", 24, languages, tools);
        dataAccess.registerManager(2, "akshay", 25, "city", 10);

        Employee found = dataAccess.findById(2);
        System.out.println("employee found=" + found.getId() + "-" + found.getName()
                + "-" + found.getAge());

        System.out.println("***printing all elements");
        Employee[] allEmployees = dataAccess.getAllEmployees();
        printAll(allEmployees);
    }


    public void printAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee iterated = employees[i];
            System.out.println("details=" + iterated.getId() + "-" + iterated.getName()
                    + "-" + iterated.getAge());
            if (iterated instanceof Manager) {
                System.out.println("manager details");
                Manager manager = (Manager) iterated;
                System.out.println("handling project=" + manager.getHandlingProject() + "employees count=" + manager.getMangingEmployeesCount());
            }
            if (iterated instanceof Developer) {
                System.out.println("developer details");
                Developer developer = (Developer) iterated;
                String[] languages = developer.getLangauges();
                String[] tools = developer.getTools();
                System.out.println("first language=" + languages[0]);
                System.out.println("first tool=" + tools[0]);
            }

        }

    }
}
