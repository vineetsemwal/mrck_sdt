package employeems;

public class EmployeeApp {

    IEmployeeDataAccess dataAccess = new EmployeeDataAccess();

    public static void main(String[] args) {
        EmployeeApp app = new EmployeeApp();
        app.runApp();
    }

    void runApp() {
        String languages[] = {"java", "python"};
        String tools[] = {"idea", "eclipse"};
        registerDeveloperAndPrint("deepika", 24, languages, tools);
        registerDeveloperAndPrint("akshay", 25, new String[]{"c#", "java"}, new String[]{"selenium", "testng"});

        registerManagerAndPrint("divyasree", 26, "metrobank", 10);
        registerManagerAndPrint("vagisa", 27, "riyadbank", 8);

        System.out.println("****find employee by id 1");
        findEmployeeAndPrint(1);
        System.out.println("*****find  employee by id 2");
        findEmployeeAndPrint(2);

        System.out.println("***printing all elements");
        Employee[] allEmployees = dataAccess.getAllEmployees();
        printAll(allEmployees);
    }

    void findEmployeeAndPrint(int id) {
        try {
            Employee employee = dataAccess.findById(id);
            printEmployee(employee);
        } catch (InvalidEmployeeIDException e) {
            System.out.println("id is not valid");
        } catch (EmployeeNotFoundException e) {
            System.out.println("employee not found");
        }
    }

    void registerManagerAndPrint(String name, int age, String project, int employeesCount) {
        try {
            dataAccess.registerManager(name, age, project, employeesCount);
            System.out.println("developer " + name + " successfully registered");
        } catch (InvalidEmployeeNameException e) {
            System.out.println("name is not valid " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("age is not valid " + e.getMessage());
        } catch (InvalidProjectException e) {
            System.out.println("project is not valid " + e.getMessage());
        } catch (InvalidEmployeesCountException e) {
            System.out.println("employees count is not valid" + e.getMessage());
        } catch (Exception e) {
            System.out.println("something went wrong, please try registering again");
            e.printStackTrace();
        }
    }

    void registerDeveloperAndPrint(String name, int age, String languages[], String tools[]) {
        try {
            dataAccess.registerDeveloper(name, age, languages, tools);
            System.out.println("developer " + name + " successfully registered");
        } catch (InvalidEmployeeNameException e) {
            System.out.println("name is not valid " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("age is not valid " + e.getMessage());
        } catch (InvalidLanguagesException e) {
            System.out.println("languages are not valid " + e.getMessage());
        } catch (InvalidToolsException e) {
            System.out.println("tools are not valid" + e.getMessage());
        } catch (Exception e) {
            System.out.println("something went wrong, please try registering again");
            e.printStackTrace();
        }

    }

    public void printEmployee(Employee employee) {
        System.out.println("employee "+employee.getName()+"-"+employee.getId());
        if (employee instanceof Manager) {
            System.out.println("manager details");
            Manager manager = (Manager) employee;
            System.out.println("handling project=" + manager.getHandlingProject() + "employees count=" + manager.getMangingEmployeesCount());
        }
        if (employee instanceof Developer) {
            System.out.println("developer details");
            Developer developer = (Developer) employee;
            String[] languages = developer.getLangauges();
            String[] tools = developer.getTools();
            System.out.println("first language=" + languages[0]);
            System.out.println("first tool=" + tools[0]);
        }

    }

    public void printAll(Employee[] employees) {
        //for (int i = 0; i < employees.length; i++) {
        //for each loop  syntax (DataType element:array)
        //iterated is the element fetched at every iteration
        for (Employee iterated : employees) {
            // Employee iterated = employees[i];
            if (iterated == null) {
                continue;
            }
            System.out.println("details=" + iterated.getId() + "-" + iterated.getName()
                    + "-" + iterated.getAge());
            printEmployee(iterated);

        }

    }
}
