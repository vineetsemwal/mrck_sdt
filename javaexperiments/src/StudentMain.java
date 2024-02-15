 class StudentMain {

    public static void main(String[] myargs) {
        Student student1=new Student();
        student1.id=1;
        student1.name="deepika";
        student1.age=24;

        Student student2=new Student();
        student2.id=2;
        student2.name="srinath";
        student2.age=23;

        String student1Name=student1.getName();
        String student2Name=student2.getName();
        System.out.println("student1 :"+student1.name+"-"+student1.age+"-"+student1.id);
        System.out.println("student2:"+student2.name+"-"+student2.age+"-"+student1.id);
        student1.incrementAge();
        student2.incrementAge();
        System.out.println("after increment");

        System.out.println("student1 :"+student1.name+"-"+student1.age+"-"+student1.id);
        System.out.println("student2:"+student2.name+"-"+student2.age+"-"+student2.id);


    }
}
