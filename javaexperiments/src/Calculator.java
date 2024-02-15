 class Calculator {

    int memory;

    int addSingle(int num){
        int newResult=memory+num;
        memory=newResult;
        return newResult;
    }

    int add(int num1, int num2){
        int result=memory+num1+num2;
        memory=result;
        return result;
    }

    void  clear(){
        memory=0;
    }


}
