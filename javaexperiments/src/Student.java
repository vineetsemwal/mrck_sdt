
class Student {
    int id;
    String name;
    int age;

     /**
      *
      *  object.member
      *  this represents current object
      *  Student st=new Student()
      *  st.getName()
      */
    String getName() {
        return this.name;
    }
    int incrementAge() {
        return ++this.age;
    }



}
