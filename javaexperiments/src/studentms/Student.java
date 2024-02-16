package studentms;

public class Student {
   private int id;
   private String name;
   private int age;

    public Student() {
        this(0, "", 0);
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name) {
        this(id, name, 0);
    }


    /**
     * object.member
     * this represents current object
     * studentms.Student st=new studentms.Student()
     * st.getName()
     */
    public String getName() {
        String upper = this.name.toUpperCase();
        return upper;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    int incrementAge() {
        return ++this.age;
    }



}
