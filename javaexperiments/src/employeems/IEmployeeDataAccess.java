package employeems;

public interface IEmployeeDataAccess {

    Employee[] getAllEmployees();

    Employee findById(int id);

    Manager registerManager(int id, String name,int age,String project,int empCount);

    Developer registerDeveloper(int id, String name,int age,String languages[],String tools[]);

}
