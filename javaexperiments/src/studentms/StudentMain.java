package studentms;


class StudentMain {

    public static void main(String[] myargs) {

        Student student1=new Student(1,"deepika",24);

        student1.setName("deepika bollaiallini.");
        student1.setAge(25);

        Student student2=new Student(2,"srinath",23);
        student2.setName("srinath s");
        student2.setAge(26);

        System.out.println("student1 :"+student1.getName()+"-"+student1.getAge()+"-"+student1.getId());
        System.out.println("student2:"+student2.getName()+"-"+student2.getAge()+"-"+student2.getId());
        student1.incrementAge();
        student2.incrementAge();
        System.out.println("after increment");

        System.out.println("student1 :"+student1.getName()+"-"+student1.getAge()+"-"+student1.getId());
        System.out.println("student2:"+student2.getName()+"-"+student2.getAge()+"-"+student2.getId());

    }
}
