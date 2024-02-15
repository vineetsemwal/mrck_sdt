 class Student {
    int id;
    String name;
    int age;

     /**
      *
      *  object.member
      *  this represents current object
      */

    String getName() {
        incrementAge();
        return name;
    }

    int incrementAge() {
        return ++this.age;
    }



}
