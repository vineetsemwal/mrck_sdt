package employeems;

public class Developer extends Employee {
    private String languages[];
    private String tools[];
    public Developer(int id,String name,int age,String langauges[],String tools[]){
        super(id,name,age);
        this.languages=langauges;
        this.tools=tools;
    }
    public String[]  getLangauges(){
        return languages;
    }

    public String[] getTools(){
        return tools;
    }

}
