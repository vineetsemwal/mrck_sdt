package employeems;

public interface IEmployeeDataAccess {

    Employee[] getAllEmployees();

    Employee findById(int id)throws InvalidEmployeeIDException, EmployeeNotFoundException;

    Manager registerManager( String name,int age,String project,int empCount)
            throws InvalidEmployeeNameException,InvalidAgeException,InvalidProjectException, InvalidEmployeesCountException;
    Developer registerDeveloper( String name,int age,String languages[],String tools[])
            throws InvalidEmployeeNameException,InvalidAgeException,InvalidLanguagesException,InvalidToolsException;


    }
