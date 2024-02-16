package employeems;

public class Employee {
    private int id;
    private String name;
    private int age;

    private Employee manager;

    public Employee(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public void assignManager(Manager manager){
        this.manager=manager;
    }

    public Employee getManager() {
        return manager;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
