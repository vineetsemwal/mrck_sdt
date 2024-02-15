 class Calculator {

    int memory;

    int addSingle(int num){
        int newResult=memory+num;
        memory=newResult;
        return newResult;
    }

    int add(int num1, int num2){
        int result=num1+num2;
        memory=result;
        return result;
    }


}
