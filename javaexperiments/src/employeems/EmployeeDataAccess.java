package employeems;

public class EmployeeDataAccess {
   private   Employee store[] = new Employee[2];

   private int index;

   public Employee[] getAll(){
       return store;
   }

  public Manager registerManager(int id, String name,int age,String project,int empCount){
       Manager manager=new Manager(id,name,age,project,empCount);
       store[index]=manager;
       index++;
       return manager;
   }

    public Developer registerDeveloper(int id, String name,int age,String languages[],String tools[]){
        Developer developer=new Developer(id,name,age,languages,tools);
        store[index]=developer;
        index++;
        return developer;
    }

   public Employee findById(int id){
      for (int i=0;i<store.length;i++){
          Employee iterated=store[i];
          if (iterated.getId()==id){
              return iterated;
          }
       }
      return null;
   }

   public void printAll(){
       for (int i = 0; i < store.length; i++) {
           Employee iterated = store[i];
           System.out.println("details=" + iterated.getId() + "-" + iterated.getName()
                   + "-" + iterated.getAge());
           if(iterated instanceof Manager){
               System.out.println("manager details");
               Manager manager=(Manager) iterated;
               System.out.println("handling project="+manager.getHandlingProject()+"employees count="+manager.getMangingEmployeesCount());
           }
          if(iterated instanceof Developer){
              System.out.println("developer details");
              Developer developer=(Developer) iterated;
              String[] languages=developer.getLangauges();
              String [] tools=developer.getTools();
              System.out.println("first language="+languages[0]);
              System.out.println("first tool="+tools[0]);
          }

       }
   }

}
