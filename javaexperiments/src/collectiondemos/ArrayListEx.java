package collectiondemos;

import employeems.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Employee>oldList=new ArrayList<>();
        oldList.add(new Employee(1,"vagisa",23));
        oldList.add(new Employee(2,"akshita",24));

        List<Employee> list=new ArrayList<>(100);
        list.add(new Employee(3,"divya",24));
        list.add(new Employee(4,"divakar",25));

        list.addAll(oldList);
        for (Employee employee :list){
            System.out.println("employee="+employee.getId()+"-"+employee.getName());
        }
        list.set(0, new Employee(3,"srinath",23));
        System.out.println("size="+list.size());
        list.remove(0);
        System.out.println("size after removing element="+list.size());
        Employee searchFor=new Employee(1,"vagisa",23);
        boolean contains= list.contains(searchFor);
        System.out.println("contains="+contains);
    }
}
