package employeems;

public class EmployeeDataAccess {
   private   Employee store[] = new Employee[2];

   private int index;

   public Employee[] getAll(){
       return store;
   }

  public Employee register(int id, String name,int age){
       Employee employee=new Employee(id,name,age);
       store[index]=employee;
       index++;
       return employee;
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
       }
   }

}
