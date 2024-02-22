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

    /*
    Employee emp1=new Employee(1,"chandra",22);
     Employee emp2=  new Employee(2,"chandra",22) ;
        boolean equals=emp1.equals(emp2);
     */
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null || !(obj instanceof Employee)){
            return false;
        }
        Employee that=(Employee)obj;
        return id==that.id;

    }
}
