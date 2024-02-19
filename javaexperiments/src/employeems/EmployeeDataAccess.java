package employeems;

public class EmployeeDataAccess implements IEmployeeDataAccess{
   private   Employee store[] = new Employee[2];

   private int index;

   @Override
   public Employee[] getAllEmployees(){
       return store;
   }

   @Override
  public Manager registerManager(int id, String name,int age,String project,int empCount){
       Manager manager=new Manager(id,name,age,project,empCount);
       store[index]=manager;
       index++;
       return manager;
   }

   @Override
    public Developer registerDeveloper(int id, String name,int age,String languages[],String tools[]){
        Developer developer=new Developer(id,name,age,languages,tools);
        store[index]=developer;
        index++;
        return developer;
    }

    @Override
   public Employee findById(int id){
      for (int i=0;i<store.length;i++){
          Employee iterated=store[i];
          if (iterated.getId()==id){
              return iterated;
          }
       }
      return null;
   }



}
